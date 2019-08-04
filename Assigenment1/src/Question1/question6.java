/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */   

//WAP to prnit DIVIDED ADDITION MULTIPHICATION, SUBTRACTION.
package Question1;
import java.util.Scanner;
/**
 *
 * @author subodh
 */
public class question6 {
     public static void main(String[] args)
    {
        int n1,n2;
         System.out.println("enter the first number: ");
        n1=new Scanner(System.in).nextInt();
        System.out.println("enter the second number: ");
        n2=new Scanner(System.in).nextInt(); 
       System.out.println("adition="+(n1+n2));
        System.out.println("subtraction="+(n1-n2));
        System.out.println("multiphicatio="+(n1*n2));
        System.out.println("division="+(n1/n2));
        System.out.println("remender of the no: "+(n1%n2));
    }
}
