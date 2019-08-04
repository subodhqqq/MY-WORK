/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package account;

public class Person {
     String branch;
     int id;
    String name;
   int amount;
   int cur;
    
    public Person()
    {  
        this.branch="";
        this.id=0;
        this.name="";
        this.amount=0;
        this.cur=0;
    }
    public Person(String branch,int id,String name,int amount,int cur)
    {
        this.branch=branch;
        this.id=id;
        this.name=name;
        this.amount=amount;
        this.cur=cur;
        
    }
    public Person(Person p)
    {
        this.branch=p.branch;
        this.id=p.id;
        this.name=p.name;
        this.amount=p.amount;
        this.cur=p.cur;
    }
    public String getBranch(){
        return (this.branch);
    }
     public int getID(){
        return (this.id);
    }
    public String getName(){
        return (this.name);
    }
      public int getAmount(){
        return (this.amount);
      }
       public int getCur(){
        return (this.cur);
      }
    //setters
         public void setBranch(String branch){
        this.branch=branch;
    }

    public void setId(int id){
        this.id=id;
    }
    public void setName(String name){
        this.name=name;
    }
     public void setAmount(int amount){
        this.amount=amount;
    }
       public void setCur(int cur){
        this.cur=cur;
    }
    
    @Override
    public String toString(){
        return(branch+""+id+" "+name+""+amount+""+cur);
    }
}

