package cs161_js_assignmentThree_ClinicService;

public class Referral {

	private String providerName;
	private int Date;
	private int Time;
	

	public void setproviderName(String providerName) {
		this.providerName = providerName;
	}
	
	public String getproviderName () {
		return this.providerName; 
	}
	
	
	private void setDate(int Date) {
		this.Date = Date;
	}
	
	private Integer getDate () {
		return this.Date;
	}
	
	
	
	private void setTime(int Time) {
		this.Time = Time;
			
	}
	
	private Integer getTime() {
		return this.Time;
	}
}
