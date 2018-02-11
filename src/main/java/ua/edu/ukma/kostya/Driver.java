package ua.edu.ukma.kostya;

import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("myDriver")
public class Driver {
	
	@Autowired
	@Qualifier("sedan")
	private Car car;
	
	@Min(2)
	private int experience;
	
	public Driver() {
		car = null;
	}
	
	public Driver(Car car) {
		this.car = car;
	}
	
	public void drive() {
		System.out.println("Driver drives on car " + car);
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
