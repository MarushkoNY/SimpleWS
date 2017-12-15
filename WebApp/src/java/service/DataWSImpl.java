/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import entity.Data;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author Nikolay
 */
@WebService(endpointInterface = "service.DataWS")
public class DataWSImpl implements DataWS{
    
    public Data getData(){
        Context ctx = null;
        Data data = new Data();
        String query = "SELECT * FROM datastorage";
        DataSource ds = null;
        try {
            ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("mysql");
            try (Connection con = ds.getConnection();
                    Statement st = con.createStatement();
                    ResultSet rs = st.executeQuery(query);){
            while (rs.next()){
                System.out.println(rs.getInt("data_id"));
                data.setIp(rs.getString("ip"));
                data.setTime(rs.getTimestamp("requestDate"));
                System.out.println(rs.getTimestamp("requestDate"));
                System.out.println(rs.getString("ip"));
            }
            }
        } catch (Exception exx){
            System.out.println(exx);
        }
        return data;
    }
    
    public static void storeData(Data data){
        Context ctx = null;
        DataSource ds = null;
        String query = "INSERT INTO dataStorage(requestDate, ip) VALUES (?,?);";
        try {
            ctx = new InitialContext();
            ds = (DataSource) ctx.lookup("mysql");
            try (Connection connection = ds.getConnection();
                    PreparedStatement ps = connection.prepareStatement(query)) {
                ps.setTimestamp(1, data.getTime());
                ps.setString(2, data.getIp());
                ps.executeUpdate();
            }
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
    
    

}
