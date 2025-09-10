package Class;

public class prog10 {
    


static class Student {
    public int rollNumber;       
    protected String name;       
    private double CGPA;         

    
    Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    
    public double getCGPA() {
        return CGPA;
    }

    
    public void setCGPA(double newCGPA) {
        if (newCGPA >= 0.0 && newCGPA <= 10.0) {
            CGPA = newCGPA;
        } else {
            System.out.println("Invalid CGPA. Must be between 0 and 10.");
        }
    }

    
    public void displayStudent() {
        System.out.println("Roll No: " + rollNumber +
                           ", Name: " + name +
                           ", CGPA: " + CGPA);
    }
}


class PostgraduateStudent extends Student {

    String specialization;

    
    Student(int rollNumber, String name, double CGPA, String specialization) {
        super(rollNumber, name, CGPA);
        this.specialization = specialization;
    }

 
    public void displayPGStudent() {
        System.out.println("Postgraduate Student -> Roll No: " + rollNumber +
                           ", Name: " + name +   
                           ", CGPA: " + getCGPA() + 
                           ", Specialization: " + specialization);
    }
}


class TestStudents {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Amit", 8.5);
        s1.displayStudent();

        
        s1.setCGPA(9.2);
        System.out.println("Updated CGPA: " + s1.getCGPA());

        Student pg1 = new Student(201, "Riya", 9.0, "Data Science");
        pg1.displayPGStudent();
    }
}

 

    
}
