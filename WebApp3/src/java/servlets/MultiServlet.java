/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import entity.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Timestamp;
import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;
import serverws.DataEntity;
import serverws.DataWS;
import serverws.DataWSImplService;
import service.DataSerialize;

/**
 *
 * @author Nikolay
 */
@WebServlet(name = "MultiServlet", urlPatterns = {"/Serv"})
public class MultiServlet extends HttpServlet {
    
    @WebServiceRef(wsdlLocation = "http://localhost:7001/WebApp/DataWSImplService?WSDL")
    private  DataWSImplService service;
    
    @Resource(mappedName = "ConnectionFactory")
    private ConnectionFactory factory;
    
    @Resource(mappedName = "Queue")
    private Queue queue;
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Data data = new Data();
        data.setIp(req.getRemoteAddr());
        data.setTime(new Timestamp(System.currentTimeMillis()));
        String sMessage = DataSerialize.serialize(data);
        
        Connection connection = null;
        Session session = null;
        try{
            connection = factory.createConnection();
            session = connection.createSession(true, Session.AUTO_ACKNOWLEDGE);
            MessageProducer producer = session.createProducer(queue);
            TextMessage message = session.createTextMessage();
            message.setText(sMessage);
            producer.send(message);
            
        } catch (Exception ex) {
            System.out.println("Exception occured while sending message777");
        } finally{
            try{
                session.close();
                connection.close();
            }catch (Exception ex) {
                System.out.println("Exception occured while closing connections");
            }
        }
        
        
        PrintWriter out = resp.getWriter();
        out.print("The time has been stored!");
        
        
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        DataWS port = service.getDataWSImplPort();
        DataEntity data = port.getData();
        PrintWriter out = resp.getWriter();
        out.println("Time and date of the last request: " + data.getTime());
        out.println("IP address of the last request: " + data.getIp());
    }

    
}
