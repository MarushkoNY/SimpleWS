/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import clientService.DataWS;
import javax.xml.ws.WebServiceRef;
import clientService.Data;
import clientService.DataWSImplService;


/**
 *
 * @author Nikolay
 */

public class DataWSClient {
    
    @WebServiceClient(wsdlLocation = "file:C:/Users/Nikolay/Desktop/WS.wsdl")
    private DataWSImplService service;
    
        public  Data getData(){
            DataWS port = service.getDataWSImplPort();
            Data data = port.getData();
            return data;
        }
    
}
