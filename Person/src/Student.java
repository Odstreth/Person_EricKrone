
public class Student extends Person {

	private final String STATUS;
	
	public Student(String rank){
		this.STATUS = rank;
	}
	
	@Override
	public String toString(){
		return super.name +" is a Student";
	}


}
