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
public class question13 {
    public static void main(String[] args)
    {
        int len,bre;
        double pra,area;
        System.out.println("enter the length of rectaangle:");
        len=new Scanner(System.in).nextInt();
          System.out.println("enter the breath of rectaangle:");
        bre=new Scanner(System.in).nextInt();
        pra=2*(len+bre);
        area=len*bre;
        System.out.println("parameter of rectangle is: "+pra);
         System.out.println("area of rectangle is: "+area);
        
    }
    
}
