package java1;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;


public class Serialization implements Serializable {

	private static final long serialVersionUID = 1L;
	int i=10;
	int j=20;
	public static void main (String[] args) throws FileNotFoundException {
		Serialization s = new Serialization();
		FileOutputStream fos = new FileOutputStream("sandeep.ser");
		try {
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		FileInputStream fis = new FileInputStream("sandeep.ser");
		try {
			ObjectInputStream ois = new ObjectInputStream(fis);
			Serialization s1 = (Serialization) ois.readObject();
			System.out.println(s1.i+".."+s1.j);
		} catch (IOException | ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
	}
	

}
 