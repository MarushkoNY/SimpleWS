/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import javax.annotation.Resource;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import clientService.Data;

/**
 *
 * @author Nikolay
 */
public class DataSender {
    
    @Resource(mappedName = "ConnectionFactory")
    private ConnectionFactory factory;
    
    @Resource(mappedName = "Queue")
    private Queue queue;
    
    public void sendData(Data data){
        String sMessage = Marshaller.marshall(data);
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
            ex.printStackTrace();
        }
    }
}
