/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */    

//WAP to print the  multiphication of two no.
package Question1;
import java.util.Scanner;
/**
 *
 * @author subodh
 */
public class question5 
{
    public static void main(String[] args)
    {
        int n1,n2;
        double result;
        System.out.println("enter the first number: ");
        n1=new Scanner(System.in).nextInt();
        System.out.println("enter the second number: ");
        n2=new Scanner(System.in).nextInt(); 
        result=n1*n2;
        System.out.println(result);
    }
}
