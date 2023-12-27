import java.util.Scanner;

//The Student class which cobtains important data members and member function for the calculation
class Student {
    String name;
    int marks[] = new int[5];
    float tmarks;
    float perc;
    char grade;
    Scanner sc = new Scanner(System.in); //A scanner object to read marks of student from the user

    //Constructor which accepts the name of the student during object initialization
    Student(String s) {
        this.name = s;
    }

    //A member function to accept the marks of the subjects
    private void getmarks() {
        System.out.println("-------------------------------------------------");
        System.out.println("Please enter the marks in 5 subjects (out of 100)");
        for (int i = 0; i < 5; i++) {
            marks[i] = sc.nextInt();
        }
        System.out.println("-------------------------------------------------");
    }

    //A member function to calculate the total marks of the student
    private void totalmarks() {
        for (int x : marks) {
            tmarks = tmarks + x;
        }
    }

    //A function to calculate Percentage
    private void totalpercentage() {
        perc = tmarks / 5;

    }

    //Function to calculate the Grade
    private void gradecalc() {
        if (perc > 90) {
            grade = 'A';
        } else if (perc > 70 && perc < 90) {
            grade = 'B';
        } else if (perc > 50 && perc < 70) {
            grade = 'C';
        } else if (perc > 33 && perc < 50) {
            grade = 'D';
        } else {
            System.out.println("You Fails!!");
        }

    }

    //An important public function which sets all the data to its data members following the concept of data abstraction
    void SetDetails() {
        //All the private functions are called on this public function
        getmarks();
        totalmarks();
        totalpercentage();
        gradecalc();
    }

    //Another important public function that gives all the results when it is invoked with main its object
    void Getdetails() {
        System.out.println("Student name: " + name);
        System.out.println("  S1  S2  S3  S4  S5");
        for (int i : marks) {
            System.out.print("  " + i);
        }
        System.out.println();
        System.out.println("Total Marks: " + tmarks);
        System.out.println("Percentage: " + perc);
        System.out.println("Grade: " + grade);
    }
}

//The main class of the program
public class Grade_Calcularor {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);  //object of Scanner class to take input as Student name
        System.out.println("WELCOME TO CALCULATE YOUR ACADEMIC ACHIEVEMENT");
        System.out.println("**********Enter name of the student*********");
        String sname = inp.nextLine();
        Student s1 = new Student(sname);  //Object of student initialized with its constructor passing parameted as student name
        s1.SetDetails(); //member function which set the details of the student is invoked with its object
        s1.Getdetails(); //member function which gives the details of the student is invoked with its object

    }
}
