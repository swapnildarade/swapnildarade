package Demo;

public class Constr {

			  private String name;
		      int empId;
		      String empName;
		      String departmen;
		      float salary;
		      
		      //default constructor
		      public Constr()
		      {
		          
		      }
		      //parameterized constructor
		     public Constr(int empId,String empName,String department,float salary)
		      {
		          this.empId=empId;
		          this.empName=empName;
		          this.departmen=department;
		          this.salary=salary;
		      }
		      public void display()
		      {
		          System.out.println("Id: "+empId);
		          System.out.println("Name: "+empName);
		          System.out.println("Departmen "+departmen);
		          System.out.println("Salary "+salary);
		      }
		      public static void main(String[] args) {
		    	  Constr e=new Constr();
		          Constr e1= new Constr(12, "Anusha", "I.T.", 450000);
		          Constr e2= new Constr(13,"ram", "C.S.", 500000);
		          e.display();
		          e1.display();
		          e2.display();
		      
		  
		      
		  }
		}