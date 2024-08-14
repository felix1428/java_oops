
import java.util.*;

public class access {

    // Instance variables for the outer class
    String name;  // Stores the name
    int rollno;   // Stores the roll number

    // Inner class felix
    public class felix {

        // Method of the inner class to display the name passed as an argument
        public void inner(String namee, int rollno) {
            System.out.println("Inner class: " + namee);
        }
    }

    // Method to display the name and roll number stored in the outer class
    public void show() {
        System.out.println(name);
        System.out.println(rollno);
    }

    public static void main(String[] args) {
        Scanner n = new Scanner(System.in);  // Scanner object for taking user input

        // Creating an object of the outer class 'access'
        access user = new access();
        user.name = n.nextLine();  // Assigning the input name to the 'name' variable
        user.rollno = 3034;  // Setting a fixed roll number
        user.show();  // Displaying the name and roll number using the show method

        // Creating another object of the outer class 'access'
        access user2 = new access();
        user2.name = n.nextLine();  // Assigning a new input name to the 'name' variable
        user2.rollno = n.nextInt();  // Taking input for roll number
        user2.show();  // Displaying the name and roll number for the second object
//testing
        // Creating an object of the inner class 'felix' using the outer class object
        felix obj = user.new felix();
        String namee = n.nextLine();  // Taking input for the name to be passed to the inner class method
        int rollno = n.nextInt();  // Taking input for roll number
        obj.inner(namee, rollno);  // Calling the inner class method and passing the name and roll number

    }
}
