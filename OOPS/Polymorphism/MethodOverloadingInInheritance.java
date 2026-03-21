// Parent Class
class Animal {
    // Overloaded method - takes no parameters
    public void sound() {
        System.out.println("Animal makes a sound");
    }
    // Overloaded method - takes String parameter
    public void sound(String type) {
        System.out.println("Animal of type " + type + " makes a sound");
    }
    // Overloaded method - takes int parameter
    public void sound(int count) {
        System.out.println("Animal makes " + count + " sounds");
    }
}
// Child Class inheriting from Animal
class Dog extends Animal {
    // Overriding the no-parameter method
    @Override
    public void sound() {
        System.out.println("Dog barks: Woof Woof!");
    }
    // Overloading the method with String parameter
    @Override
    public void sound(String type) {
        System.out.println("Dog of type " + type + " barks");
    }
    // New overloaded method in child class - takes double parameter
    public void sound(double volume) {
        System.out.println("Dog barks with volume: " + volume);
    }
    // New overloaded method in child class - takes String and int parameters
    public void sound(String type, int times) {
        System.out.println("Dog of type " + type + " barks " + times + " times");
    }
}
// Main class to demonstrate
public class MethodOverloadingInInheritance {
    public static void main(String[] args) {
        // Creating Dog object (which is also an Animal)
        Dog dog = new Dog();
        dog.sound();  // Output: Dog barks: Woof Woof!
        dog.sound("Labrador");  // Output: Dog of type Labrador barks
        dog.sound(3);  // Output: Animal makes 3 sounds
        dog.sound(7.5);  // Output: Dog barks with volume: 7.5
        dog.sound("German Shepherd", 5);  // Output: Dog of type German Shepherd barks 5 times

        System.out.println("\n--- Using Parent Class Reference ---");
        Animal animal = new Dog();
        animal.sound();  // Output: Dog barks: Woof Woof!
        animal.sound("Poodle");  // Output: Dog of type Poodle barks
        animal.sound(4);  // Output: Animal makes 4 sounds
    }
}
