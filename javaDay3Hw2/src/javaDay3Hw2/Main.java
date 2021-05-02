package javaDay3Hw2;

public class Main {

	public static void main(String[] args) {

		Student student1 = new Student();
		student1.setId(1);
		student1.setUserId(1);
		student1.setFirstName("Taha");
		student1.setLastName("UÇAR");
		student1.seteMail("sadasfqaegt@asfasfg.dsf");
		student1.setPassword("123456");
		
		Instructor instructor1 = new Instructor();
		instructor1.setId(1);
		instructor1.setUserId(2);
		instructor1.setFirstName("Engin");
		instructor1.setLastName("DEMİROĞ");
		instructor1.seteMail("asdasfasd@asfasfa.sdf");
		instructor1.setPassword("sfasdafafa");
		
		
		StudentManager studentManager = new StudentManager();
		
		studentManager.add(student1);
		studentManager.signIn(student1);
		studentManager.aaaa(student1);
		
		InstructorManager instructorManager = new InstructorManager();
		
		instructorManager.update(instructor1);
		instructorManager.bbbbbb(instructor1);
		instructorManager.delete(instructor1);
		
		UserManager userManager = new UserManager();
		
		userManager.logOut(student1);
		userManager.logOut(instructor1);
		
		
		
		
		
		
	}

}
