class vehicle {
    protected String licenseNumber;

    public void sertLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }
}

class car extends vehicle {
    protected String model;

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    void sertLicenseNumber(String licenseNumber) {
        super.sertLicenseNumber(licenseNumber); // Call the parent class method
    }

    public void displayInfo() {
        System.out.println("License Number: " + licenseNumber);
        System.out.println("Model: " + model);
    }
}

public class Inheritance {
    public static void main(String[] args) {
        car myCar = new car();
        myCar.sertLicenseNumber("ABC123");
        myCar.setModel("Toyota Camry");
        myCar.displayInfo();
    }
}