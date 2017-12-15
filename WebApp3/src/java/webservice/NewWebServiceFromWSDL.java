/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webservice;

import javax.jws.WebService;
import serverws.DataWSImplService;

/**
 *
 * @author Nikolay
 */
@WebService(serviceName = "DataWSImplService", portName = "DataWSImplPort", endpointInterface = "serverws.DataWS", targetNamespace = "http://serverWS/", wsdlLocation = "WEB-INF/wsdl/NewWebServiceFromWSDL/localhost_7001/WebApp/DataWSImplService.wsdl")
public class NewWebServiceFromWSDL {

    public serverws.DataEntity getData() {
        
        throw new UnsupportedOperationException("Not implemented yet.");
    }

    public void printMessage() {
        //TODO implement this method
        throw new UnsupportedOperationException("Not implemented yet.");
    }
    
}
