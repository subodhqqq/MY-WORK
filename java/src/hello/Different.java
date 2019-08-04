/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;
import java.util.Scanner;

/**
 *
 * @author subodh
 */
public class Different {
    public static void main(String[] args){
        int x,y;
        int result;
        System.out.println("enter first number:");
        x=new Scanner(System.in).nextInt();
        System.out.println("enter second number:");
        y=new Scanner(System.in).nextInt();
        result=x-y;
        System.out.println("result is:"+result);
    }
            
}
