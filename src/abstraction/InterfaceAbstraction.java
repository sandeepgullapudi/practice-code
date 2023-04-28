package abstraction;
interface Drawable{  
void draw();  
}  
class Triangle implements Drawable{  
public void draw(){
	System.out.println("drawing rectangle");
	}  

}  
class Circle implements Drawable{  
public void draw(){
	System.out.println("drawing circle");
	}  
}  
 
public class InterfaceAbstraction{  
public static void main(String args[]){  
Drawable d=new Circle();
Drawable d1=new Triangle();
d.draw();
d1.draw();
}
}  
