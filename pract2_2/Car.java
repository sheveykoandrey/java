public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    // Константа для текущего года
    private static final int CURRENT_YEAR = 2024;

    // Конструктор с параметрами для всех полей
    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    // Конструктор по умолчанию
    public Car() {
        this.model = "Unknown";
        this.license = "Unknown";
        this.color = "Unknown";
        this.year = 0; // Нулевое значение, если год не указан
    }

    // Конструктор с выбранными полями (в данном случае model и year)
    public Car(String model, int year) {
        this.model = model;
        this.year = year;
        this.license = "Unknown";
        this.color = "Unknown";
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

    // Метод для получения возраста автомобиля
    public int getCarAge() {
        return CURRENT_YEAR - this.year;
    }

    // Метод To_String(), который возвращает инфу об объекте
    public String toString() {
        return "Model: " + this.model + ", License: " + this.license + ", Color: " + this.color + ", Year: " + this.year;
    }
}
