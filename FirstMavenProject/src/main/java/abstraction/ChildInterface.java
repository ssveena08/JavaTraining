package abstraction;

public class ChildInterface implements sampleinterface, parentsample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//sampleinterface in= new ChildInterface();
//in.display();
parentsample p=new ChildInterface();
p.display();
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
	}

}
