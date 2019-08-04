/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */




//  Question. WAP to user given value add.
package Question1;
import java.util.Scanner;
/**
 *
 * @author subodh
 */
public class question15 
{
  public static void main(String[] args)  
  {
      int n1,n2;
      System.out.println("enter the first number");
      n1=new Scanner(System.in).nextInt();
       System.out.println("enter the second number");
      n2=new Scanner(System.in).nextInt();
      n1=n1+n2;
      n1=n1-n2;
      n2=n1+n2;
      n2=n2-n1;
      System.out.println("sweping number is first no is:"+n2);
       System.out.println("sweping number is second no is:"+n1);
  }
}
