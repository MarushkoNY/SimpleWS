/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import entity.Data;
import javax.ejb.MessageDriven;
import javax.jms.Connection;
import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.Session;
import javax.jms.TextMessage;
import service.DataWSImpl;
import util.Unmarshalling;

/**
 *
 * @author Nikolay
 */
//@MessageDriven(mappedName = "Queue")
public class DataBean implements MessageListener{
    
    
    public void onMessage(Message inputMessage){
        Connection connection = null;
        Session session = null;
        TextMessage message = null;
        String result = null;
        try{
            message = (TextMessage) inputMessage;
            result = message.getText();
            Data data = Unmarshalling.unmarshall(result);
            DataWSImpl.storeData(data);
        }catch (Exception ex) {
            ex.printStackTrace();
        } 
    }
}
