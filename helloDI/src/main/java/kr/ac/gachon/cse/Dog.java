package kr.ac.gachon.cse;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Dog implements AnimalType {

	private String myName;


	@Override
	public void sound() {
		System.out.println("Dog name="+myName+":"+"Bow wow");
	}

}
