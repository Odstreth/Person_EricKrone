import java.util.Date;


public class Employee extends Person {

	private String office;
	private double salary;
	private Date dateHired;
	
	@Override
	public String toString(){
		return this.name +" is an Employee";
	}


}
