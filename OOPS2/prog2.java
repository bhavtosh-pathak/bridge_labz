package Class;

public class prg2 {
    static class Circle{
        int radius;

        Circle(){
            this(1);

        }
        Circle(int radius){
            this.radius=radius;
        }
        void  getArea(int radius){
            System.out.println(3.14*radius*radius);   
        }
    }
    public static void main(String[] args) {
        Circle c = new Circle();
        c.getArea(3);
    }
    
}
