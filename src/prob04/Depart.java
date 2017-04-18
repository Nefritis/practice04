package prob04;

public class Depart extends Employee{
	private String depart;

	public String getDepart() {
		return depart;
	}

	public void setDepart(String depart) {
		this.depart = depart;
	}

	public Depart(String name, int salary,String depart) {
		super(name, salary);
		this.depart = depart;
		// TODO Auto-generated constructor stub
	}
	
	public void getInformation() {
		System.out.println( "이름: " + super.getName() + " 연봉: " + super.getSalary() + " 부서 : " + depart );
	}
}
