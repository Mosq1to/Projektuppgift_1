/**
 * Employee class
 */
public abstract class Employee {
	private int Id;
	private String Name;
	private int Salary;
	private String Personalnr;

	/**
	 * Constructor for employee class
	 * @param Id
	 * @param Name
	 * @param Salary
	 * @param Personalnr
	 */
	public Employee(int Id, String Name, int Salary, String Personalnr) {
		this.Id = Id;
		this.Name = Name;
		this.Salary = Salary;
		this.Personalnr = Personalnr;
	}

	/**
	 *
	 * method to get id
	 * @return this.Id
	 */
	public int getId() {
		return this.Id;
		
	}

	/**
	 * method to set id
	 * @param Id
	 */
	public void setId(int Id) {
		this.Id=Id;
		
	}

	/**
	 *method to get namme
	 * @return this.name
	 */
	public String getName() {
		return this.Name;
		
	}

	/**
	 *method to set namme
	 * @param Name
	 */
	public void setName(String Name) {
		this.Name=Name;
		
	}

	/**
	 *method to get salary
	 * @return
	 */
	public int getSalary() {
		return this.Salary;
		
	}

	/**
	 *method to set salary
	 * @param Salary
	 */
	public void setSalary(int Salary) {
		this.Salary=Salary;
		
	}

	/**
	 *method to get Personalnr
	 * @return
	 */
	public String getPersonalnr() {
		return this.Personalnr;
		
	}

	/**
	 *method to set Personalnr
	 * @param Personalnr
	 */
	public void setPersonalnr(String Personalnr) {
		this.Personalnr=Personalnr;
		
	}


}
