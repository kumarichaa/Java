// A nongeneric class. 
class NonGen { 
  int num; 
 
  NonGen(int i) { 
    num = i; 
  } 
 
  int getnum() { 
    return num; 
  } 
} 
 
// A generic subclass. 
class Gen<T> extends NonGen {  
  T ob; // declare an object of type T  
    
  // Pass the constructor a reference to   
  // an object of type T.  
  Gen(T o, int i) { 
	//num=i;  
    super(i); 
    ob = o;  
  }  
  
  // Return ob.  
  T getob() {  
    return ob;  
  }  
}  
  
// Create a Gen object. 
public class HierDemo2 {  
  public static void main(String args[]) 
{  
    
    // Create a Gen object for String. 
    Gen<String> w = new Gen<String>("Hello", 47); 
    
    System.out.print(w.getob() + " "); 
    System.out.println(w.getnum()); 
  }  
}
