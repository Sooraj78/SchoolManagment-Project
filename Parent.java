package StudentManagment;

public class Parent 
{
	
	//Parent Details of Students
	String fatherName;
	int fatherAge;
	int motherAge;
	String motherName;
	int phoneNumber;
	String emailId;
	int salary;
	boolean isPoor;
	boolean isbelowMiddle;
	boolean isMiddle;
	boolean isRich;
	
	

	public String getFatherName() {
		return fatherName;
	}
	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}
	public int getFatherAge() {
		return fatherAge;
	}
	public void setFatherAge(int fatherAge) {
		this.fatherAge = fatherAge;
	}
	public int getMotherAge() {
		return motherAge;
	}
	public void setMotherAge(int motherAge) {
		this.motherAge = motherAge;
	}
	public String getMotherName() {
		return motherName;
	}
	public void setMotherName(String motherName) {
		this.motherName = motherName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public boolean isPoor() {
		return isPoor;
	}
	public void setPoor(boolean isPoor) {
		this.isPoor = isPoor;
	}
	public boolean isIsbelowMiddle() {
		return isbelowMiddle;
	}
	public void setIsbelowMiddle(boolean isbelowMiddle) {
		this.isbelowMiddle = isbelowMiddle;
	}
	public boolean isMiddle() {
		return isMiddle;
	}
	public void setMiddle(boolean isMiddle) {
		this.isMiddle = isMiddle;
	}
	public boolean isRich() {
		return isRich;
	}
	public void setRich(boolean isRich) {
		this.isRich = isRich;
	}
	Parent()
	{
		
	}
	public Parent(String fatherName, int fatherAge, int motherAge, String motherName) 
	{
		this.fatherName = fatherName;
		this.fatherAge = fatherAge;
		this.motherAge = motherAge;
		this.motherName = motherName;
//		if(this.fatherAge>=21&&this.fatherAge<=80&&this.motherAge>=18&&this.motherAge<=80)
//		{
//			System.out.println("Accepted ");
//		}
//		if(this.fatherAge+8>=this.motherAge||this.motherAge+20>=this.fatherAge)
//		{
//			System.out.println("Accepted ");
//		}
//		else
//		{
//			System.out.println("Error ");
//		}
	}
	Parent(String fatherName,int phoneNumber)
	{
		this.fatherName=fatherName;
		this.phoneNumber=phoneNumber;
		this.salary=salary;
	}
	Parent(String fatherName,String motherName,int phoneNumber,String emailId,int salary)
	{
		this.fatherName=fatherName;
		this.motherName=motherName;
		this.phoneNumber=phoneNumber;
		this.emailId=emailId;
		this.salary=salary;
		
		if(this.salary<=10000)
		{
			this.isPoor=true;
		}
		if(this.salary>10000&&this.salary<500000)
		{
			this.isbelowMiddle=true;
		}
		if(this.salary>=500000&&this.salary<100000)
		{
			this.isMiddle=true;
		}
		if(this.salary>=100000)
		{
			this.isRich=true;
		}
	}
	@Override
	public String toString() {
		return "Parent [fatherName=" + fatherName + ", fatherAge=" + fatherAge + ", motherAge=" + motherAge
				+ ", motherName=" + motherName + ", phoneNumber=" + phoneNumber + ", emailId=" + emailId + ", salary="
				+ salary + ", isPoor=" + isPoor + ", isbelowMiddle=" + isbelowMiddle + ", isMiddle=" + isMiddle
				+ ", isRich=" + isRich + "]";
	}

}
