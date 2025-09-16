package Class;

public class prog5 {
    

static class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

   
    CarRental() {
        customerName = "none";
        carModel = "none";
        rentalDays = 1;
    }

    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
    }

    CarRental(CarRental other) {
        this.customerName = other.customerName;
        this.carModel = other.carModel;
        this.rentalDays = other.rentalDays;
    }

    
    double calculateCost() {
        double rate;
        switch (carModel.toLowerCase()) {
            case "suv": rate = 19000; break;
            case "bmw": rate = 60000; break;
            case "mercedes benz": rate = 3000; break;
            default: rate = 120; 
        }
        return rentalDays * rate;
    }

    void displayRental() {
        System.out.println(customerName +
                           ","+ carModel 
                           "," + rentalDays
                           ", " + calculateCost());
    }

    
    public static void main(String[] args) {
        
        CarRental r1 = new CarRental();
        r1.displayRental();

        
        CarRental r2 = new CarRental("hemant", "SUV", 2);
        r2.displayRental();

     
        CarRental r3 = new CarRental(r2);
        r3.displayRental();
    }
}

    
}
