
public class Encapsulation {
	
        static class Student {

	    // Private variables (data hiding)
	    private int id;
	    private String name;

	    // Setter method
	    public void setId(int id) {
	        this.id = id;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    // Getter method
	    public int getId() {
	        return id;
	    }

	    public String getName() {
	        return name;
	    }
	}
  public static void main(String[] args) {

      Student s = new Student();

      // Setting values using setters
      s.setId(101);
      s.setName("Supriya");

      // Getting values using getters
      System.out.println("Student Id: " + s.getId());
      System.out.println("Student Name: " + s.getName());
  }
}


