public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    // Конструктор с параметрами для всех полей
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор по умолчанию
    public Car() {
    }

    // Конструктор с выбранными полями (в данном случае model и year)
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    // Геттеры и сеттеры для полей
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
}