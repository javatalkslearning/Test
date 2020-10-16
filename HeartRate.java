package snippet;

import java.time.LocalDate;
import java.time.Period;
public class HeartRate {
	private String name;
	private LocalDate dateOfBirth;
	
	public HeartRate(String name, LocalDate dateOfBirth) {
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	
	public HeartRate() {
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth( int month ,int year,int day) {
	 this.dateOfBirth = LocalDate.of(year, month, day);
	}
	
	public int calculateAge() {
	    LocalDate currentDate = LocalDate.now();
	    Period period = Period.between(dateOfBirth, currentDate);
	    return  period.getYears();
	} 
	public int calculateMaximumHeartRate() {
		return 220-calculateAge();
	}
	
	public double targetHeartRate1() {
		return calculateMaximumHeartRate()*0.5;
	}
	public double targetHeartRate2() {
		return calculateMaximumHeartRate()*8.5;
	}
	
	public static void main(String[] args) {
		HeartRate rate = new HeartRate();
		rate.setDateOfBirth(10, 1996, 30); rate.setName("Roshan");
		int age = rate.calculateAge();
		System.out.println(age);
		System.out.println(rate.calculateMaximumHeartRate());
		System.out.println("HartRate diff "+rate.targetHeartRate1()+ " - "+rate.targetHeartRate2());
	}
	
}
