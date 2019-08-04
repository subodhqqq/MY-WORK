/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov1;

/**
 *
 * @author subodh
 */
public class Login {
/*
    static String getPassword() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static String getName() {
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/
     String id;
    String password;

    public Login(String id, String password) {
        this.id = id;
        this.password = password;
    }
    
    public Login() {
        this.id = "";
        this.password ="";
    }

    
    public Login(Login l) {
        this.id = l.id;
        this.password = l.password;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" + "id=" + id + ", password=" + password + '}';
    }

 }


