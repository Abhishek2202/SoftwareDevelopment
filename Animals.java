// Polymorphism example

package SD1;

class Animals {
	  public void animalSound() {
	    System.out.println("The animal makes a sound");
	  }
	}
	class Pig extends Animals {
	  public void animalSound() {
	    System.out.println("The pig says: wee wee");
	  }
	}
	class Dogs extends Animals {
	  public void animalSound() {
	    System.out.println("The dog says: bow wow");
	  }
	}
	class AnotherClass {
	  public static void main(String[] args) {
	    Animals myAnimal = new Animals();  // Create a Animal object
	    Animals myPig = new Pig();  // Create a Pig object
	    Animals myDogs = new Dogs();  // Create a Dogs object
	    myAnimal.animalSound();
	    myPig.animalSound();
	    myDogs.animalSound();
	  }
	}