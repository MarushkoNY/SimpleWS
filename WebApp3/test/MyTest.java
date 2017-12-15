/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Nikolay
 */
public class MyTest {

    @Test
    public void test1() throws FileNotFoundException, IOException {
        FileReader reader = new FileReader(new File("C:/Users/Nikolay/Desktop/data.xml"));
        String exa = null;
        int c = 0;
        while ((c = reader.read()) != -1) {
            exa += (char) c;
        }
        System.out.println(exa);
//        assertNull(exa);
        
    }

}
