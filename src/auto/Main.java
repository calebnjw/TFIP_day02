package auto;

public class Main {
  public static void main(String[] args) {
    // Car myCar = new Car();

    // myCar.setColor("Red");
    // myCar.setRegistration("SHX1234Z");

    // System.out.printf("My car is %s. \n", myCar.getColor());
    // System.out.printf("My car's license plate is %s. \n", myCar.getRegistration());

    // myCar.stop();
    // myCar.start();
    // myCar.start();
    // myCar.stop();
    // myCar.start();
    // myCar.stop();
    // myCar.start();
    // myCar.stop();
    // myCar.start();
    // myCar.stop();
    // myCar.start();
    // myCar.stop();
    // myCar.start();
    // myCar.stop();

    Car myFlyingCar = new FlyingCar();
    FlyingCar myCar = new FlyingCar();

    if (myFlyingCar instanceof FlyingCar) {
      myCar = (FlyingCar) myFlyingCar;
    }
    
    myCar.setRegistration("SXH12345J");
    System.out.printf("Flying car's license plate is %s. \n", myCar.getRegistration());
    myCar.start();
    myCar.climb(50.0);

  }  
}
