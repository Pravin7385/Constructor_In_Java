package Constructor;

// 1. Default Constructor --> no-arguments 
// 2.Parameterized Constructor --> with arguments

// Constructor name and class name always same in Constructor. 
public class Constructor {
	
	int id;
	String name;
	String city;
	
	//1. Default Constructor --> no-arguments
	public Constructor() {
		name = "pravin";
	}
	
	// 2.Parameterized Constructor --> with arguments
	public Constructor(int userId,String username,String usercity) {

		id=userId;
		name=username;
		city=usercity;
		
		System.out.println("ID is:"+id);
		System.out.println("name is:"+name);
		System.out.println("city is:"+city);
	}
	
	public static void main(String[] args) {
		Constructor constructor = new Constructor(10,"pravin","pune");// calling with arguments
		System.out.println(constructor.name);// calling without arguments
		
	}
	
}
