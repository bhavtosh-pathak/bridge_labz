package Class2;

public class prog7 {
    static class Patient{
        static String hospname = "Hemant's hospital";
        static int totalpatients;
        String name;
        int age;
        final int patientid = 20;

        Patient(String name,int age){
            this.name=name;
            this.age=age;
            totalpatients++;

        }
        void totalpatients(){
            System.out.println(totalpatients);
        }
    }
    public static void main(String[] args) {
        Patient p = new Patient("bhavtosh", 21);
        p.totalpatients();
    }
    
}
