
/**
* The main class of our project.<br>. 
*/
public class myMain3 {

	//--------------------------------------------------
	//	testFunctionality
	//--------------------------------------------------			
	/** 
	* This function test the student and module classes.<br>
	*/
	public static void testFunctionality(){
		System.out.println("\n------------------------------\n\n   STUDENT FUNCTIONALITY\n\n------------------------------\n");
		//1. We create some student objects.
		System.out.println("\n----------- 1. student instances creation -----------");
		
		student s1 = new student("John", 18, true); 
		student s2 = new student("Mary", 20, true); 		
		student s3 = new student("Peter", 21, false); 
		
		//2. We use our objects to call to the getMethods.
		System.out.println("\n----------- 2. student test for getMethods -----------");
				
		//2.1. Check the attributes of s1.
		String auxStr = s1.getName();
		System.out.println(auxStr);
		
		int auxInt = s1.getAge();
		System.out.println(auxInt);		
		
		boolean auxBool = s1.getFirstYear();
		System.out.println(auxBool);
			
		//3. We use our objects to call to the setMethods.
		System.out.println("\n----------- 3. student test for setMethods -----------");
	
		s1.setName("Jack");
		s1.setAge(20);
		s1.setFirstYear(false);		
		
		auxStr = s1.getName();
		System.out.println(auxStr);
		
		auxInt = s1.getAge();
		System.out.println(auxInt);		
		
		auxBool = s1.getFirstYear();
		System.out.println(auxBool);
		
		//4. We use our objects to call to the extra functionality.
		System.out.println("\n----------- 4. student test for extra functionality -----------");

		s1.birthday();
		s2.birthday();
		
		System.out.println("\n------------------------------\n\n   MODULE FUNCTIONALITY\n\n------------------------------\n");
		//5. We create some module objects.
		System.out.println("\n----------- 5. module instances creation -----------");
		
		module m1 = new module("Linear Data Structures and Algorithms", 1234);
		module m2 = new module("Nonlinear Data Structures and Algorithms", 1235);
		
		//6. Register some students to the first module.
		System.out.println("\n----------- 6. module test for extra functionality -----------");
		
		m1.registerStudent(s1);
		m1.registerStudent(s2);
		m1.registerStudent(s3);
		
		m2.registerStudent(s1);
		m2.registerStudent(s2);		
		
		student auxStudent1 = m1.getStudentInfo(0);
		student auxStudent2 = m1.getStudentInfo(3);

		System.out.println(auxStudent1);
		System.out.println(auxStudent2);		
		System.out.println(auxStudent1.getName());
		System.out.println(auxStudent1.getAge());
		System.out.println(auxStudent1.getFirstYear());	
	}	
	
	//--------------------------------------------------
	//	MAIN
	//--------------------------------------------------			
	/**
	 * Main Method:<br> 
	 * Calls to the function testFunctionality to show the previous two classes functionality is correct.<br>
	 * @param args: We will run the program parameter free, so do not worry about it. 
	 */	
	public static void main(String[] args) {
		//We call to testFunctionality 
		testFunctionality();
	}

}
