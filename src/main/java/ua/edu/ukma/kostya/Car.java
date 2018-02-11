package ua.edu.ukma.kostya;

import javax.validation.constraints.NotNull;

public abstract class Car {
	
	@NotNull
	private String number;
	
	public Car() {
		number = "UA" + (int) (Math.random()*10) + (int) (Math.random()*10) + (int) (Math.random()*10) + "AA";
	}
	
	public Car(String number) {
		this.number = number;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public String toString() {
		return number;
	}
	
}
