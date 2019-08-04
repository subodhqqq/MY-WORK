
package gov1;
import java.util.regex.Matcher; 
import java.util.regex.Pattern;
import java.util.Scanner;
public class RegularExpressionTest {
    
        String str;
        public RegularExpressionTest (){
            Reg();
        }
        public void Reg ()
        {
            System.out.println("enter the number");
            str=new Scanner(System.in).nextLine();
            /* System.out.println("metacharacters d....");//d means digit  
  
System.out.println(Pattern.matches("\\d", "abc"));//false (non-digit)  
System.out.println(Pattern.matches("\\d", "1"));//true (digit and comes once)  
System.out.println(Pattern.matches("\\d", "4443"));//false (digit but comes more than once)  
System.out.println(Pattern.matches("\\d", "323abc"));//false (digit and char)  
  
System.out.println("metacharacters D....");//D means non-digit */ 
  
/*System.out.println(Pattern.matches("\\D", "abc"));//false (non-digit but comes more than once)  
System.out.println(Pattern.matches("\\D", "1"));//false (digit)  
System.out.println(Pattern.matches("\\D", "4443"));//false (digit)  
System.out.println(Pattern.matches("\\D", "323abc"));//false (digit and char)  
System.out.println(Pattern.matches("\\D", "m"));//true (non-digit and comes once)  */
  boolean res=true;
  {
System.out.println("metacharacters D with quantifier....");  
System.out.println(Pattern.matches("\\d*", "123"));//true (non-digit and may come 0 or more times)  
  }
} 
        
   
    
public static void main(String[] args){
    new RegularExpressionTest();
    }
}
