package superkeyword;

public class Mammal extends Animal
{
	// Constructor
	Mammal(String name)
	{
		// Call the constructor of the parent (Animal) class
        super(name);
    }
	void sound() 
	{
		 // Calling the parent class's sound() method using super
		
        super.sound(); 
        System.out.println("sound");
    }
	
	void displayInfo() 
	{
		 // Calling the parent class's display() method using super
        super.display();  
        System.out.println("mammal.");
    }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mammal mammal = new Mammal("Elephant");
		mammal.sound();
        mammal.displayInfo();
		
	}

}
