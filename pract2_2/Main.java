public class Main {
    public static void main(String[] args) {
        // Пример использования класса Car
        Car car1 = new Car("Toyota Camry", "ABC123", "Red", 2020);
        Car car2 = new Car(); // Использование конструктора по умолчанию
        Car car3 = new Car("Honda Civic", 2018); // Использование конструктора с выбранными полями

        // Вызов метода toString() для вывода инфы об объектах
        System.out.println("Car 1: " + car1.toString());
        System.out.println("Car 2: " + car2.toString());
        System.out.println("Car 3: " + car3.toString());

        // Вывод возраста автомобиля
        System.out.println("Car 1 age: " + car1.getCarAge() + " years");
        System.out.println("Car 3 age: " + car3.getCarAge() + " years");
    }
}
