class Car {
   public void move() {
      System.out.println("Creta is from Hyundai");
   }
}

class Bus extends Car {
   public void move() {
      System.out.println("That Bus is from Mercedes");
   }
}

public class TestBus {

   public static void main(String args[]) {
      Car a = new Car();   // Car reference and object
      Car b = new Bus();   // Car reference but Bus object

      a.move();   // runs the method in Car class
      b.move();   // runs the method in Bus class
   }
}
