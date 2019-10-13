
public abstract class Employee {
	private int Id;
	private String Name;
	private int Salary;
	private String Personalnr;
	
	public Employee(int Id, String Name, int Salary, String Personalnr) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
		this.Personalnr = Personalnr;
	}
	
	public int getId() {
		return this.Id;
		
	}
	public void setId(int Id) {
		this.Id=Id;
		
	}
	public String getName() {
		return this.Name;
		
	}
	public void setName(String Name) {
		this.Name=Name;
		
	}
	public int getSalary() {
		return this.Salary;
		
	}
	public void setSalary(int Salary) {
		this.Salary=Salary;
		
	}
	public String getPersonalnr() {
		return this.Personalnr;
		
	}
	public void setPersonalnr(String Personalnr) {
		this.Personalnr=Personalnr;
		
	}


}
