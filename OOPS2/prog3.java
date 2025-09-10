package Class;

public class prog3 {
    String guestName;
    String roomType;
    int nights;

    
    prog3() {
        guestName = "none";
        roomType = "none";
        nights = 1;
    }

   
    prog3(String guestName, String roomType, int nights) {
        this.guestName = guestName;
        this.roomType = roomType;
        this.nights = nights;
    }

   
    prog3(prog3 other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    
    void displayBooking() {
        System.out.println("Guest: " + guestName + 
                           ", Room: " + roomType + 
                           ", Nights: " + nights);
    }

   
    public static void main(String[] args) {
        
        prog3 b1 = new prog3();
        b1.displayBooking();

        prog3 b2 = new prog3("Alice", "Deluxe", 3);
        b2.displayBooking();

       
        prog3 b3 = new prog3(b2);
        b3.displayBooking();
    }
}
