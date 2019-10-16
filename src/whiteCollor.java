/**
 *
 */
public class whiteCollor extends Employee {
	private Boolean companyCar;
	private Boolean collectum;

	/**
	 * Extended class of Emplkoyee to create whitecollor employee
	 * @param Id
	 * @param Name
	 * @param Salary
	 * @param Personalnr
	 * @param companycar
	 * @param collectum
	 */
	public whiteCollor(int Id, String Name, int Salary, String Personalnr,Boolean companycar, Boolean collectum) {
		// TODO Auto-generated constructor stub
		super(Id, Name, Salary, Personalnr);
		this.setCollectum(collectum);
		this.setCompanyCar(companycar);
		
	}

	/**
	 *
	 * @return
	 */
	public Boolean getCollectum() {
		return this.collectum;
	}

	/**
	 *
	 * @param collectum
	 */

	public void setCollectum(Boolean collectum) {
		this.collectum = collectum;
	}

	/**
	 *
	 * @return
	 */

	public Boolean getCompanyCar() {
		return this.companyCar;
	}

	/**
	 *
	 * @param companyCar
	 */

	public void setCompanyCar(Boolean companyCar) {

		this.companyCar = companyCar;
	}


}
