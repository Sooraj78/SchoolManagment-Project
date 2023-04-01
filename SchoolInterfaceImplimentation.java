package StudentManagment;
import java.sql.*;


public class SchoolInterfaceImplimentation implements SchoolInterface
{

	 //Parent Object
//    Parent parent1=new Parent("Gagan ", 5,10," Laya ");  
//    Parent parent2=new Parent("Shivu "," Lakshmi ", 75445555," sbwwi@53 ", 10000);
//	Parent parent3=new Parent("Shiva "," rani ", 785545555," sbwwi@53 ", 20000);
//	Parent parent4=new Parent("Hari "," ramya ", 758565555," sbwwi@53 ", 30000);
//	Parent parent5=new Parent("Dadhi "," rachitha ", 7546555," sbwwi@53 ", 40000);
//	Parent parent6=new Parent("ravi "," Lalitha ", 798755555," sbwwi@53 ", 50000);
//	Parent parent7=new Parent(" suresh "," arya ", 74965555," sbwwi@53 ", 600500);
//	Parent parent8=new Parent("ramesh "," baghya ", 1665555," sbwwi@53 ", 700000);
//	Parent parent9=new Parent("tharun "," sirisha ", 987865555," sbwwi@53 ", 8500000);
//	Parent parent10=new Parent("hemanth "," lekha ", 75598665," sbwwi@53 ", 90000000);
//	Parent parent11=new Parent("arun "," srija ", 787455," sbwwi@53 ", 100000000);
//	
//	Student Object
//	Student S1=new Student("Arya ","12/12/2012",parent1);
//	Student S2=new Student("Bhavya ","12/07/2012",parent2);
//	Student S3=new Student("Bharath ","24/03/2012",parent3);
//	Student S4=new Student("Charan ","02/11/2012",parent4);
//	Student S5=new Student("Harish ","30/11/2012",parent5);
//	Student S6=new Student("Gagan ","21/12/2012",parent6);
//	Student S7=new Student("Supreeth ","14/01/2012",parent7);
//	Student S8=new Student("sname ","31/01/2012",parent8);
//	Student S9=new Student("Maaz ","01/09/2012",parent9);
//	Student S10=new Student("Prajwal ","12/04/2012",parent10);
//	Student S11=new Student("Kishore ","22/04/2012",parent11);
		
	//Implementation For Converting String to Store in Arrays
//	Student students[]=new Student[]{S1,S2,S3,S4,S5,S6,S7,S8,S9,S10};
			
//			@Override
//			public void studentDetails() 
//			{
//				
//					try {
//						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
//						String query="select * from student";
//						conn.createStatement();
//						Statement st=conn.createStatement();
//						ResultSet rs=st.executeQuery(query);
//						
//						int count =0;
//						while(rs.next())
//						{
//							
//							count++;
//						}
//						System.out.println(count);
//						
//                       
//                        conn.close();
//					} catch (SQLException e) 
//					{
//						e.printStackTrace();
//					}
//					}
			
			
//			//Implementation For Getting Particular Student Details
//			@Override
//			public void particularStudentDetails(int num)
//			{
//				System.out.println(students[num]);
//			}

		
			@Override
			public void harishParentSalary() 
			{
				try {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
					String query="select salary from parent where rollno=(select rollno from student where studentFirstName='harish')";
					conn.createStatement();
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(query);
					while (rs.next()) 
					{
						System.out.println(rs.getString(1));
					}
					conn.close();
					rs.close();
					
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
                
					
					
		


			@Override
			public void insertNewData()
			{
				try {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
					String query="insert into student  values('Lalith', 'KS' , 896, '1989-12-12', '2012-03-28', 97 , 6)";
					conn.createStatement();
					Statement st=conn.createStatement();
					int queryResult=st.executeUpdate(query);
					System.out.println("Succefuly Updated "+queryResult+" Row");
					
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
				
			}

            
	
          	@Override
	        public void getSatyaParentPhNo() 
          	{
          		try 
          		{
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
					String query="select phoneNumber from parent where rollno=(select rollno from student where studentFirstName='Satya')" ;
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(query);
					while(rs.next())
					System.out.println(rs.getString(1));
					rs.close();
					conn.close();
				} 
          		catch (SQLException e)
          		{
					e.printStackTrace();
				}
		}
	
				@Override
				public void totalParentSalaryOfSchool() 
				{
					try 
					{
						Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
						String query="select sum(salary) from parent";
						Statement st=conn.createStatement();
						ResultSet rs=st.executeQuery(query);
						while (rs.next()) 
						{
							System.out.println(rs.getString(1));
							
						}
						rs.close();

					} 
					catch (SQLException e) 
					{
						e.printStackTrace();
					}
				}
	
				
			@Override
			public void getPrincipalDetails()
			{
				try 
				{
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
					String query="select*from teacher where teacherDesignation=' Principal'";
					Statement st=conn.createStatement();
					ResultSet rs=st.executeQuery(query);
					while (rs.next()) 
			
						System.out.println(rs.getString(1)+rs.getString(2)+rs.getString(3)+rs.getString(4)+rs.getString(5)+rs.getString(6)+rs.getString(7)+rs.getString(8)+rs.getString(9)+rs.getString(10)); 
					rs.close();
				} 
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}

			
			@Override
			public void updateTeacherSalary() 
			{
				try {
					Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/schooldb","root", "tiger");
					String query="update teacher set techerSalary=techerSalary-1000000 where teacherFirstName='Farazul' and teacherLastName=' Hasan'";
					Statement st=conn.createStatement();
					int rs=st.executeUpdate(query);
					System.out.println(rs);
				} 
				catch (SQLException e) 
				{
					e.printStackTrace();
				}
			}
	
}
				

			
			
			
			



			
