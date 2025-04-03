package superkeyword;

public class Employee {
	
	String name;
	int id;
	Address address; //aggregate

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address a = new Address("India", "Kochi", "Kerala", "94101");
		Employee e = new Employee("Veena",30,a);
		e.display();

	}
	
	public void display()
	{
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(address.country);
		 System.out.println(address.city);
		 System.out.println(address.state);
		 System.out.println(address.zipCode);
		 
		 
		 
		 
	}

	public Employee(String name, int id, Address address) 
	{
		super();
		this.name = name;
		this.id = id;
		this.address = address;
	}

}
