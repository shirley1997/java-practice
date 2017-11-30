public class Student
{
    //the student's full name
    String firstName;
    String lastName;


public Student(String firstName, String lastName)//constructor header
   {
      this.firstName = firstName;//description of constructors
      this.lastName = lastName;
 }

 
 
 
  public String getFirstName()
    {
        return firstName;
    }

    /**
    * Return the last name of this student
    */
    public String getLastName()
    {
        return lastName;
    }
public static void main(String[] args)
{
  //gives a name to the students
  Student student= new Student("Samantha", "Jones");

  //each object calls the getName method
  System.out.println("The students first name is: " +student.getFirstName());
  System.out.println("The students last name is: " +student.getLastName());

  }
  }