package StudentManagment;

public class Student extends Parent
{
	//Student Details
	private String studentFirstName;
	private String studentLastName;
	private int rollno;
	private String dateOfBirth;
	private String yearOfJoining;
	private double percentage;
	private Parent parent;
	static String schoolName="Good Shephered School ";
	
	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getYearOfJoining() {
		return yearOfJoining;
	}

	public void setYearOfJoining(String yearOfJoining) {
		this.yearOfJoining = yearOfJoining;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public Parent getParent() {
		return parent;
	}

	public void setParent(Parent parent) {
		this.parent = parent;
	}

	//initializing variables through special type
	Student(String studentFirstName,String studentLastName,int rollno,String yearOfJoining,double percentage,Parent parent)
	{
		this.studentFirstName=studentFirstName;
		this.studentLastName=studentLastName;
		this.rollno=rollno;
		this.yearOfJoining=yearOfJoining;
		this.percentage=percentage;
		this.parent=parent;
	}
	
	//
	Student(String studentName, String yearofJoining, Parent parent)
	{
		this.studentFirstName=studentName;
		this.yearOfJoining=yearofJoining;
		this.parent=parent;
	}
	Student()
	{
		
	}
	@Override
	public String toString() {
		return "Student [studentFirstName=" + studentFirstName + ", studentLastName=" + studentLastName + ", rollno="
				+ rollno + ", dateOfBirth=" + dateOfBirth + ", yearOfJoining=" + yearOfJoining + ", percentage=" + percentage + ", parent=" + parent + "]";
	}
	
	
	

	
}
