package cs161_js_assignmentThree_ClinicService;

public class ClinicService {

	private int ServiceNumber;
	private int ServiceName;
	private int ServiceDescription;
	
	
	public void setServiceNumber(int ServiceNumber) {
		this.ServiceNumber = ServiceNumber;
	}
	
	public Integer getServiceNumber () {
		return this.ServiceNumber;
	}
	
	public void setServiceName(int ServiceName) {
		this.ServiceName = ServiceName;
	}
	
	public Integer getServiceName () {
		return this.ServiceName;
	}
	
	public void setServiceDescription(int ServiceDescription) {
		this.ServiceDescription = ServiceDescription;
	}
	
	public Integer getServiceDescription () {
		return this.ServiceDescription;
	}
}
