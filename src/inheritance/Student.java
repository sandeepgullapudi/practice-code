package inheritance;
interface Academic {
    void Study();
}

interface NonAcademic{
    void Play();

}


public class Student implements Academic , NonAcademic  {
	
	public void Study() {
		System.out.println("student is studying.");	
	}

	

	@Override
	public void Play() {
		// TODO Auto-generated method stub
		System.out.println("student is playing.");
		
	}
}


