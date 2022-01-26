package Demo;

public class Constr {

		  private String name;

	
		  Constr() {
		    System.out.println("Constructor Called:");
		    name = "Swapnil";
		  }

		  public static void main(String[] args) {

		  
		    Constr obj = new Constr();
		    System.out.println("The name is " + obj.name);
		  }
		}