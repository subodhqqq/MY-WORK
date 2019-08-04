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
public class question11 {

    public static void main(String[] args) {
double radius;
System.out.print("enter the radius of circle: ");
radius=new Scanner(System.in).nextInt();
double perimeter,area;
         perimeter = 2 * Math.PI * radius;
         area = Math.PI * radius * radius;

        System.out.println("Perimeter is = " + perimeter);
        System.out.println("Area is = " + area);
    }
    
}
