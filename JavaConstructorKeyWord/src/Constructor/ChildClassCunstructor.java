package Constructor;

public class ChildClassCunstructor extends ParentClassConstructor {

	
	public ChildClassCunstructor() {
		System.out.println("I am Child class constructor");
	}



public static void main(String[] args) {
	ChildClassCunstructor obj1 = new ChildClassCunstructor();
	ParentClassConstructor obj2 = new ParentClassConstructor();
	
}
}