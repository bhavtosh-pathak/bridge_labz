package Class;
class Employee{
    int empid;
    String dept;
    double salary;

    Employee(int empid,String dept,double salary){
        this.empid=empid;
        this.dept=dept;
        this.salary=salary;
    }
    public void  modifySalary(int modify){
        salary+=modify;
        System.out.println("now your modified salary is:" +salary);
    }
    public double getmodifySalary(){
        return salary;
    }
   
}
 class Manager extends Employee{
    
        public Manager(int empid,String dept,double salary){
        super(empid,dept,salary);

        }
        void display(){
            System.out.println("the emp id is "+super.empid + "and the dept is "+super.dept);
        }

    
    void showinfo(){
        System.out.println("the employee id is :"+empid+"ande dept is :"+this.dept);
    }
    public static void main(String[] args) {
        Employee e = new Employee(1, "IT", 2000000);
        e.modifySalary(2000);
        e.getmodifySalary();
        Manager m = new Manager(1, "IT", 0200000);
        m.display();
        
        
    }

}
