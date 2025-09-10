package Class;



class prog8 {
    
    String courseName;
    int duration; 
    double fee;

    
    static String instituteName = "GLA ";

   
    prog8(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    
    void displayCourseDetails() {
        System.out.println("Institute: " + instituteName +
                           ", Course: " + courseName +
                           ", Duration: " + duration + " months" +
                           ", Fee: " + fee);
    }

   
    static void updateInstituteName(String newName) {
        instituteName = newName;
        System.out.println("Institute new name " + instituteName);
    }

    
    public static void main(String[] args) {
        prog8 c1 = new prog8("Java Programme", 6, 15000);
        prog8 c2 = new prog8("Web Development", 4, 12000);

        c1.displayCourseDetails();
        c2.displayCourseDetails();

        
        prog8.updateInstituteName("abc Academy");

       
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
