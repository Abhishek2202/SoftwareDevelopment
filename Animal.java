//Abstraction example

package SD1;

//Abstract class
abstract class Animal {
// Abstract method (does not have a body)
public abstract void animalSound();
// Regular method
public void sleep() {
 System.out.println("Zzz");
}
}

//Subclass (inherit from Animal)
class Dog extends Animal {
public void animalSound() {
 // The body of animalSound() is provided here
 System.out.println("The dog barks");
}
}

class MyMainClass {
public static void main(String[] args) {
 Dog myDog = new Dog(); // Create a Dog object
 myDog.animalSound();
 myDog.sleep();
}
}