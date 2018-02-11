package ua.edu.ukma.kostya;

import org.springframework.stereotype.Component;

@Component
public class Sedan extends Car {
	
	public Sedan() {
		super();
	}
	
	public Sedan(String number) {
		super(number);
	}
	
}
