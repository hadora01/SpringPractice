package kr.ac.gachon.cse;




import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("/animal.xml");

	
	PetOwner person = (PetOwner)context.getBean("id_petOwner");
	
	person.play();
	context.close();
	
	}

}
