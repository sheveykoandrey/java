public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    private static final int CURRENT_YEAR = 2024; 
    
    public Car(String model, String license, String color, int year) { 
        this.model = model; 
        this.license = license;
        this.color = color;
        this.year = year;
    }


    public Car() {
    }


    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }


    
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public String ToString() { 
        return ("Model: " + this.model + ", " + "License: " + this.license + ", " + "Color: " + this.color + ", " + "Year: " + this.year);  
    }
    
    public int getCarAge() { 
        return CURRENT_YEAR - this.year;
    }
    
}
