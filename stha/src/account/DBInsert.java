/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import  java.util.Scanner;
public class DBInsert {

    String url = "jdbc:mysql://localhost:3306/db_account";
    String user = "admin";
    String pw = "stha12345";
    
    String branch="";
    int id=0;
    String name="";
    int amount=0;
    int currentAmount=0;
    public DBInsert() {

        try {

            Class.forName("org.gjt.mm.mysql.Driver"); //load driver
            //System.out.println("connect database sucessfully:");
            //insert,update,delet,or select
            try (Connection conn = DriverManager.getConnection(url, user, pw)) {
                //System.out.println("connect database sucessfully:");
                //insert,update,delet,or select
                System.out.println("branch name :");
                branch=new Scanner(System.in).nextLine();
                
                System.out.println("Enter id :");
                id=new Scanner(System.in).nextInt();
                
                System.out.println("user name :");
                name=new Scanner(System.in).nextLine();
                
                System.out.println("Enter amount:");
                amount=new Scanner(System.in).nextInt();
                
                System.out.println("Enter currentAmount:");
                currentAmount=new Scanner(System.in).nextInt();
                //Insert into tbl_tranning(id,name,address) values(1,'subodh','ktm');
                String sql = "Insert into tbl_person1(branch,id,name,amount,currentAmount) values(?,?,?,?,?);";//sql statemnent//(? =yesle call garxa lin no 42 lai)
                PreparedStatement pstat = conn.prepareStatement(sql);//inistialaized
                
                //value user bat dina ko lagi ho
                pstat.setString(1,branch);
                pstat.setInt(2, id);
                pstat.setString(3,name);
                pstat.setInt(4,amount);
                pstat.setInt(5,currentAmount);
                
                
                pstat.executeUpdate();//(insert ,upadate ,delet) ececute
                System.out.println("data base insert record");
            }
            System.out.println("databas dconectin close sucessfully:");

        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
    }

    
     public DBInsert(String branch,int id,String name,int amount,int currentAmount) {

        try {

            Class.forName("org.gjt.mm.mysql.Driver"); //load driver
            //System.out.println("connect database sucessfully:");
            //insert,update,delet,or select
           Connection conn = DriverManager.getConnection(url, user, pw);{
                //System.out.println("connect database sucessfully:");
                //insert,update,delet,or select
                
                //Insert into tbl_tranning(id,name,address) values(1,'subodh','ktm');
                String sql = "Insert into tbl_person1(branch,id,name,amount,currentAmount) values(?,?,?,?,?);";//sql statemnent//(? =yesle call garxa lin no 42 lai)
                PreparedStatement pstat = conn.prepareStatement(sql);//inistialaized
                
                //value user bat dina ko lagi ho
                pstat.setString(1,branch);
            pstat.setInt(2, id);
            pstat.setString(3,name);
            pstat.setInt(4,amount);
            pstat.setInt(5,currentAmount);
                    
                
                pstat.executeUpdate();//(insert ,upadate ,delet) ececute
                System.out.println("data base insert record");
            }
            System.out.println("databas dconectin close sucessfully:");

        } catch (Exception ex) {
            System.out.println("Error:" + ex);
        }
    }

    public static void main(String[] args) {
        new DBInsert();
    }

}
