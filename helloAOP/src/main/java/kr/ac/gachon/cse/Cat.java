package kr.ac.gachon.cse;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter

public class Cat implements AnimalType {

	private String myName;

	@Override
	public void sound() {
		System.out.println("Cat name=" + myName + ":" + "Meow");
	}

	
	
}

//ctrl+shift+o 자동임포트 