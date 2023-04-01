package StudentManagment;

public interface SchoolInterface 
{
	//Get All Student Details in Arrays
	//public void studentDetails(); 
	
	//Get Particular Student Details Based On Index Values
	//public void particularStudentDetails(int num);
	
	//Get Parent Salary Of Student Harish 
	public void harishParentSalary();
	
	//Inserting New Data To Database(Student) Using JDBC
	public void insertNewData();
	
	//Get Parent PhoneNo Of Student Satya
	public void getSatyaParentPhNo();
	
	//Calculate Total Salary Of Parents and Find the Avg of them 
	public void totalParentSalaryOfSchool();
	
	//Principal Details
	public void getPrincipalDetails();
	
	//Update value
	public void updateTeacherSalary();
}
