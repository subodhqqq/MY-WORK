/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class DBConnet {

    String url = "jdbc:mysql://localhost:3306/db_training";
    String user = "admin";
    String pw = "stha12345";

    public DBConnet() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver"); //load driver
            Connection conn = DriverManager.getConnection(url, user, pw);
            System.out.println("connect database sucessfully:");
            //insert,update,delet,or select

            //Insert into tbl_tranning(id,name,address) values(1,'subodh','ktm');
            String sql = "Insert into tbl_person1(branch,id,name,amount,currentAmount) values('balaju',12,'rabin',5000,10000);";//sql statemnent
            PreparedStatement pstat = conn.prepareStatement(sql);//inistialaized
            pstat.executeUpdate();//(insert ,upadate ,delet) ececute
            System.out.println("data base insert record");
            conn.close();
            System.out.println("databas dconectin close sucessfully:");

        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
    }

    public static void main(String[] args) {
        new DBConnet();
    }

}


