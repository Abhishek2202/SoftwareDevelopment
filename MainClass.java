import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;


class first {
    public void display() {
        System.out.println("Base class one");
        Logger logger = Logger.getLogger("com.api.jar");
        logger.info("This is an info message");
        
        
    }
}

//Inheritance of class first
class second extends first {
    @Override
    public void display() {
        System.out.println("Second Class two");
    }
    
    public int add(int x, int y) {
        return x+y;
    }

    //Polymorphism of add method
    public double add(double x,double y) {
        return x+y;
    }
    
}

//Encapsulation
class Encap {
	
    private String name;
    public String getName() {
        return name;
    }
    public void setName(String newName) {
        name = newName;
    }
}

//Abstraction
abstract class TwoWheeler {
    public abstract void run();
}
class bike extends TwoWheeler{
    public void run(){
        System.out.println("\nThe bike is in run");
    }
}

//Interface
interface inter1{
    public void test();
}
class inter2 implements inter1 {
    public void test() {
        System.out.println("Interface Method Implemented");
    }
}

public class MainClass {
	//private static Logger logger=Logger.getLogger("MainClass");
	public static void main(String[] args) {
		
		Logger logger = LogManager.getLogger("MainClass");
        
        first a=new first();
        a.display();
        second b=new second();
        b.display();
        
        
        //Logger logger=LogManager.getLogger("MainClass");
        
        System.out.println(b.add(4,2));
        System.out.println(b.add(5.,2.));

        logger.trace("Trace message");
        Encap encap = new Encap();
        
        encap.setName("Jagrati Sharma");
        System.out.print("Name : " + encap.getName() );
        
        TwoWheeler test = new bike();
        test.run();

        inter1 p = new inter2();
        p.test();
        
        
        logger.error("Error Message!");
        logger.fatal("Fatal Message!");
        
        
        LogManager.shutdown();
		
	}
}


















