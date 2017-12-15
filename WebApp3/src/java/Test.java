
import entity.Data;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Timestamp;
import service.DataSerialize;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nikolay
 */
public class Test {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader(new File("C:/Users/Nikolay/Desktop/data.xml")); 
        String exa = null;
        int c = 0;
        while ((c = reader.read()) != -1){
            exa +=(char)c; 
        }
        
        System.out.println(exa);
        
        
    }
}
