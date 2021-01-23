package cs161_js_assignmentThree_ClinicService;

public class ReferralList {

	private String providerName;
	private String location;
	private int phone;
	private String serviceProvided;
	// matchServiceNeeds;
	//displayMatchedList;
	
	public void setproviderName(String providerName) {
		this.providerName = providerName;
	}
	
	public String getproviderName () {
		return this.providerName;
	}
	
	public void setlocation(String location) {
		this.location = location;
	}
	
	public String getlocation () {
		return this.location;
	}
	
	public void setserviceProvided(String serviceProvided) {
		this.serviceProvided = serviceProvided;
	}
	
	public String getserviceProvided () {
		return this.serviceProvided;
	}
	
	public void setphone(Integer phone) {
		this.phone = phone;
	}
	
	public Integer getphone () {
		return this.phone;
	}
}
