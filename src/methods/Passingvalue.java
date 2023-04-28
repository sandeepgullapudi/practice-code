package methods;

public class Passingvalue {
	int a=100;    
     void change(int a){    
     
    
     }    
     public static void main(String args[]){    
       Passingvalue p=new Passingvalue();   
       System.out.println(" Value (before change)="+p.a);    
       p.change(500);  
       System.out.println(" Value (after change)="+p.a);    
     }    
}
