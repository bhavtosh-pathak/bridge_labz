package Class;

public class prog9 {
    

static class Vehicle {
    
    String ownerName;
    String vehicleType;

    
    static double registrationFee = 5000.0;

    Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

   
    void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName +
                           ", Vehicle Type: " + vehicleType +
                           ", Registration Fee: ₹" + registrationFee);
    }

    
    static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
        System.out.println("Registration fee updated to: ₹" + registrationFee);
    }

 
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("hemant", "Car");
        Vehicle v2 = new Vehicle("gagan", "Bike");

        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(7000);

        
        v1.displayVehicleDetails();
        v2.displayVehicleDetails();
    }
}

    
}
