import java.util.*;  
public class ScannerNextFloatExample4
 {    
    public static void main(String args[])
	{       
          Float number;  
        Scanner scan = new Scanner( System.in );       
        System.out.print("Enter the numeric value : ");  
        number = scan.nextFloat();  
        System.out.println("Float value : " + number +" \nTwice value : " + 2.0*number );  
        scan.close();  
      }    
}  