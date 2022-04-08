class Animal {
  public void animalSound() {
    System.out.println("The sound of the animals");
  }
}

class Cat extends Animal {
  public void animalSound() {
    System.out.println("The cat says: meow meow");
  }
}

class Cow extends Animal {
  public void animalSound() {
    System.out.println("The cow says: moo moo");
  }
}

class Duck extends Animal {
  public void animalSound() {
    System.out.println("The duck says: quack quack");
  }
}

class Main {
  public static void main(String[] args) {
    Animal myAnimal = new Animal();
    Animal myCat = new Cat();
    Animal myCow = new Cow();
    Animal myDuck = new Duck();
    
    myAnimal.animalSound();
    myCat.animalSound();
    myCow.animalSound();
    myDuck.animalSound();
  }
}
