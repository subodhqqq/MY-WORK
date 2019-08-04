/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;
import java.util.Scanner;
/**
 *
 * @author subodh
 */
public class question12 {
    public static void main(String[] args)
    {
        int n1,n2,n3;
        double sum,avarage;
        System.out.println("enter the first no");
        n1=new Scanner(System.in).nextInt();
        System.out.println("enter the second no");
        n2=new Scanner(System.in).nextInt();
        System.out.println("enter the third no");
        n3=new Scanner(System.in).nextInt();
        sum=n1+n2+n3;
        avarage=sum/3;
        System.out.println("avarage no is:"+avarage);
    }
    
}
