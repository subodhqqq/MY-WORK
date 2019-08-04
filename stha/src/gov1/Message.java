/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gov1;

public class Message {
    String message;

    public Message() {
        this.message = "";
    }
      public Message(String message) {
        this.message = message;
    }
        public Message(Message m) {
        this.message = m.message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Message{" + "message=" + message + '}';
    }
        
}
