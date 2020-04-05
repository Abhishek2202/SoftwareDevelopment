// Polymorphism example

package SD1;

public class AnimalsDriver {
	public static void main(String[] args) {
	    Animals myAnimal = new Animals();  // Create a Animal object
	    Animals myPig = new Pig();  // Create a Pig object
	    Animals myDogs = new Dogs();  // Create a Dog object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDogs.animalSound();
	  }
}
