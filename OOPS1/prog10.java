package JAVA_PROGRAM;

public class prog10 {
    static class Cartitem {
        String itemname;
        int price;
        int quantity;
        Cartitem(String itemname,int price,int quantity){
            this.itemname=itemname;
            this.price=price;
            this.quantity=quantity;
        }
        void additem(int item){
            quantity+=item;

        }
        void removeitem(int item){
            quantity-=item;
        }
        void displaytotalcost(){
            System.out.println("total cost is "+(quantity*price));
        }
    
        
    }
    public static void main(String[] args) {
        Cartitem c1 = new Cartitem("mango", 50, 02);
        c1.additem(3);
        c1.removeitem(5);
        c1.displaytotalcost();
    }  
}
