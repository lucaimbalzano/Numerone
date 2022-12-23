package com.generator;
import java.util.*;

public class Main {

  public static void main(String[] args) {
     System.out.println("## WelcomeToNumbers ##");
     boolean engine= true;
     
     int n=0;
    while(engine){
    printMenu(); 
    
    Scanner sc= new Scanner(System.in); 
      System.out.print("## Enter level of difficulty: ");
    int d= sc.nextInt();
     
     if(d!=0){
       System.out.print("## Enter lenght numbers to memorize: ");  
      n= sc.nextInt();  
     }
     
      
     switch(d){
       case 1:
         getNumbers(n);
         break;
       case 0:
         engine = false;
         break;
       case 2:
         System.out.println("## On creation ##"); 
       case 3:
         System.out.println("## On creation ##");
       default:
        System.out.print("## Not found combination (404) ##");
        break;
     } 
     sc.close();
    }
    System.out.print("## Thanks to use Luca Imbalzano© Application ##");
  }
  
  public static void getNumbers(int n){
        
    String out= " [1]";
    int y=1;
    for(int j=1; j<=10; j++){
     for(int i=1; i<=10; i++){
       int x = (int) (Math.random() * 101);
       if(x<=9){
         out = out+" 0"+x;
       }else{
         out = out+" "+x;
       }
       
     }     
     out = out+"\n";
     y=j;  
     if(y!=10 && y!=1) 
      { y+=1;
       out = out +" ["+y+"]";
      }
     if(y==1)  
      {
        y+=1;
        out = out +" ["+y+"]";
      }    
     y=0;   
     }
     
    System.out.println(out);
  }
  
  public static void printMenu(){
    System.out.println("--++## Menú ##++--");
    System.out.println(" 1) First Level ");
    System.out.println(" 2) Second Level ");
    System.out.println(" 3) Third Level ");
    System.out.println("--++## enter 0 to exit  ##++--");
  }
  
  
}