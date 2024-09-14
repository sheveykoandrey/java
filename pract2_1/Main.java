public class Main {
    public static void main(String[] args) {
        // Пример использования класса Car
        Car car1 = new Car("Toyota Camry", "ABC123", "Red", 2020);
        Car car2 = new Car(); // Использование конструктора по умолчанию
        Car car3 = new Car("Honda Civic", 2018); // Использование конструктора с выбранными полями

        // Вывод инфы о машинах
        System.out.println("Car 1: " + car1.getModel() + ", License: " + car1.getLicense() + ", Color: " + car1.getColor() + ", Year: " + car1.getYear());
        System.out.println("Car 2: " + car2.getModel() + ", License: " + car2.getLicense() + ", Color: " + car2.getColor() + ", Year: " + car2.getYear());
        System.out.println("Car 3: " + car3.getModel() + ", License: " + car3.getLicense() + ", Color: " + car3.getColor() + ", Year: " + car3.getYear());
    }
}
