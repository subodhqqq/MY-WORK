/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class DB_login {

    public Login_info login(Login login) {
        Login_info login_info = new Login_info();
        try {

            Class.forName("org.gjt.mm.mysql.Driver"); //load driver
            Connection conn = Database.Connect();
            String sql = "SELECT * FROM tble_login name=? where password=?";
            Database.close(conn);
            PreparedStatement pstat = conn.prepareStatement(sql);//inistialaized
            pstat.setString(1, Login.getId());
            pstat.setString(2, Login.getPassword());
            ResultSet rs = pstat.executeQuery();//(selet only) ececute
            while (rs.next()) {
                Login_info.setLogin(login);
                Login_info.setMessage(new Message("True"));

            }
            Database.close(conn);

        } catch (Exception ex) {
            login_info.setLogin(login);
            login_info.setMessage(new Message("False"));
        }
        return (login_info);
    }
}
