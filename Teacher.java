                                                                                                                  //21/03/2023
package StudentManagment;

public class Teacher
{
	private String teacherFirstName;
	private String teacherLastName;
	private String teacherGender;
	private long techerSalary;
	private long teacherPhoneNo;
	private String teacherExperience;
	private String teacherQualification;
	private String teacherSubject;
	private String teacherBio;
	private String classGrade;
	private String teacherDesignation;

	
	public String getTeacherDesignation() {
		return teacherDesignation;
	}
	public void setTeacherDesignation(String teacherDesignation) {
		this.teacherDesignation = teacherDesignation;
	}
	public String getTeacherSubject() {
		return teacherSubject;
	}
	public void setTeacherSubject(String teacherSubject) {
		this.teacherSubject = teacherSubject;
	}
	public String getTeacherFirstName() {
		return teacherFirstName;
	}
	public void setTeacherFirstName(String teacherFirstName) {
		this.teacherFirstName = teacherFirstName;
	}
	public String getTeacherLastName() {
		return teacherLastName;
	}
	public void setTeacherLastName(String teacherLastName) {
		this.teacherLastName = teacherLastName;
	}
	public String getTeacherGender() {
		return teacherGender;
	}
	public void setTeacherGender(String teacherGender) {
		this.teacherGender = teacherGender;
	}
	public long getTecherSalary() {
		return techerSalary;
	}
	public void setTecherSalary(long techerSalary) {
		this.techerSalary = techerSalary;
	}
	public long getTeacherPhoneNo() {
		return teacherPhoneNo;
	}
	public void setTeacherPhoneNo(long teacherPhoneNo) {
		this.teacherPhoneNo = teacherPhoneNo;
	}
	public String getTeacherExperience() {
		return teacherExperience;
	}
	public void setTeacherExperience(String teacherExperience) {
		this.teacherExperience = teacherExperience;
	}
	public String getTeacherQualification() {
		return teacherQualification;
	}
	public void setTeacherQualification(String teacherQualification) {
		this.teacherQualification = teacherQualification;
	}
	public String getTeacherBio() {
		return teacherBio;
	}
	public void setTeacherBio(String teacherBio) {
		this.teacherBio = teacherBio;
	}
	public String getClassGrade() {
		return classGrade;
	}
	public void setClassGrade(String classGrade) {
		this.classGrade = classGrade;
	}
	public Teacher() 
	{
		
    }
	public Teacher(String teacherFirstName, String teacherLastName, String teacherBio) {
		super();
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.teacherBio = teacherBio;
	}
	
	public Teacher(String teacherFirstName, String teacherLastName, String teacherGender, long techerSalary,
			long teacherPhoneNo, String teacherExperience, String teacherQualification, String teacherSubject,
			String teacherBio, String classGrade, String teacherDesignation) {
		super();
		this.teacherFirstName = teacherFirstName;
		this.teacherLastName = teacherLastName;
		this.teacherGender = teacherGender;
		this.techerSalary = techerSalary;
		this.teacherPhoneNo = teacherPhoneNo;
		this.teacherExperience = teacherExperience;
		this.teacherQualification = teacherQualification;
		this.teacherSubject = teacherSubject;
		this.teacherBio = teacherBio;
		this.classGrade = classGrade;
		this.teacherDesignation = teacherDesignation;
	}
	@Override
	public String toString() {
		return "Teacher [teacherFirstName=" + teacherFirstName + ", teacherLastName=" + teacherLastName
				+ ", teacherGender=" + teacherGender + ", techerSalary=" + techerSalary + ", teacherPhoneNo="
				+ teacherPhoneNo + ", teacherExperience=" + teacherExperience + ", teacherQualification="
				+ teacherQualification + ", teacherSubject=" + teacherSubject + ", teacherBio=" + teacherBio
				+ ", classGrade=" + classGrade + ", teacherDesignation=" + teacherDesignation + "]";
	}	
}