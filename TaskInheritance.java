class Animal {
  protected String brand = "Maine";
  public void meowing() {
    System.out.println("Meow, Meow!");
  }
}

class Cat extends Animal {
  private String modelName = "Coon";
  public static void main(String[] args) {
    Cat myCuteCat = new Cat();
    myCuteCat.meowing();
    System.out.println(myCuteCat.brand + " " + myCuteCat.modelName);
  }
}
