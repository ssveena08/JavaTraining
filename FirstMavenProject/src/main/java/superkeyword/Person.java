package superkeyword;

public class Person 
{
	
	// Private variables (data hiding)
    private String name;
    private int age;

    // Constructor to initialize the person object
    public Person(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    // Print method to display person information
    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
