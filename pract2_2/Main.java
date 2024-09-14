public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", "CCC333", "Black", 2000);
        Car car2 = new Car(); 
        Car car3 = new Car("Lada", 2011); 
        
        System.out.println("Car1: " + car1.ToString()); 
        System.out.println("Car2: " + car2.ToString()); 
        System.out.println("Car3: " + car3.ToString());
        
        
        System.out.println("Car1 age: " + car1.getCarAge()); 
        System.out.println("Car3 age: " + car3.getCarAge());
        
    }
}

