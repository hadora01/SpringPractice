package kr.ac.gachon.cse;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Logger {
	
	@Pointcut("execution(void kr.ac.gachon.cse.*.sound())" )
	private void selectSound() {
		
	}
	
	@Before("selectSound()")
	public void aboutToSound() {
		System.out.println("advice: about to sound");
	}
	

}
