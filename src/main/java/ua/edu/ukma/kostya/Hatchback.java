package ua.edu.ukma.kostya;

import org.springframework.stereotype.Component;

@Component
public class Hatchback extends Car {
	
	public Hatchback() {
		super();
	}
	
	public Hatchback(String number) {
		super(number);
	}

}
