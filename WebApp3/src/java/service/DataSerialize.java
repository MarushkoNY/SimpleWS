/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Data;
import java.io.File;
import java.io.FileReader;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

/**
 *
 * @author Nikolay
 */
public class DataSerialize {
    
    
    public static String serialize(Data data){
        
        String message="";
        try{
        File file = new File("C:/Users/Nikolay/Desktop/data.xml");
        
        JAXBContext ctx = JAXBContext.newInstance(Data.class);
        Marshaller marshaller = ctx.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
        marshaller.marshal(data, file);
        
        FileReader reader = new FileReader(file);
        
        int c = 0;
        while ((c = reader.read()) != -1){
            message +=(char)c; 
        }
        } catch (Exception ex){
            System.out.println("Marshalling exception");
        }
        System.out.println(message);
        
        return message;
    }
}
