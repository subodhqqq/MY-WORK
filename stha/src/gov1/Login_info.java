
package gov1;

import java.util.logging.Logger;

/**
 *
 * @author subodh
 */
public class Login_info {

    static void setLogin(Login login) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static void setMessage(Message message) {
 //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Login login;
    Message message;

    public Login_info() {
        this.login = null;
        this.message =null;
    }
      public Login_info(Login login, Message message) {
        this.login = login;
        this.message = message;
    }
        public Login_info(Login_info li) {
        this.login =li. login;
        this.message =li. message;
    }

    public Login getLogin() {
        return login;
    }
   // private static final Logger LOG = Logger.getLogger(Login_info.class.getName());

    public Message getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "Logininfo{" + "login=" + login + ", message=" + message + '}';
    }
    
        
}
