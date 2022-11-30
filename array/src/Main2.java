import java.util.*; 
import java.io.*;

class Main2 {

  public static String CodelandUsernameValidation(String str) {
    // code goes here  
    
    if(str.length()>4 && str.length()<25){
      if(str.charAt(0)>'a'&&str.charAt(0)<'z'&&str.charAt(str.length()-1)!='_'){
        for(int i=0;i<str.length();i++){
	        if(str.charAt(i)>'a'&&str.charAt(i)<'z'||str.charAt(i)=='_'||(int)str.charAt(i)>(int)'0'&&(int)str.charAt(i)<(int)'9'){
	          continue;
	
	        }
	        else 
	          return "false";
	
        }
      }
      else
    	  return "false";
    }
    else
  	  return "false";
   
    return "true";


    
    
     
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(CodelandUsernameValidation(s.nextLine())); 
  }

}