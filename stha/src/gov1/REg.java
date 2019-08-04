
package gov1;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import java.util.Scanner;
public class REg {
    public static void main(String[] args)
    {
        int num=0;
        String numbers;
        System.out.println("enter tha numbers:");
        numbers=new Scanner(System.in).nextLine();
        //   ^ and $ suru ra last ko value k hunxa va anera herna
        //
        
        while(!numbers.matches("^\\d+$"))
        {
            System.out.println("please enter only interger number");
            numbers=new Scanner(System.in).nextLine();
        }
        num=Integer.parseInt(numbers);
        System.out.println("ypur entered:"+num);
                
    }
}
