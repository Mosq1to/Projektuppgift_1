
public class whiteCollor extends Employee {
	private Boolean companyCar;
	private Boolean collectum;
	
	
	public whiteCollor(int Id, String Name, int Salary, String Personalnr,Boolean companycar, Boolean collectum) {
		// TODO Auto-generated constructor stub
		super(Id, Name, Salary, Personalnr);
		this.setCollectum(collectum);
		this.setCompanyCar(companycar);
		
	}

	public Boolean getCollectum() {
		return collectum;
	}


	public void setCollectum(Boolean collectum) {
		this.collectum = collectum;
	}


	public Boolean getCompanyCar() {
		return companyCar;
	}


	public void setCompanyCar(Boolean companyCar) {

		this.companyCar = companyCar;
	}


}
