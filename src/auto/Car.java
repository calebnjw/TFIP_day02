package auto;

public class Car {
  // attributes
  private String registration;
  private String color;
  private boolean started = false;
  private int counter = 0;
  // private int miles = 0;

  // constructor
  public Car() {}
  public Car(String registration) {
    this.setRegistration(registration);
  }

  // getters and setters
  public String getRegistration() { return this.registration; }
  public void setRegistration(String registration) { this.registration = registration; }

  public String getColor() { return this.color; }
  public void setColor(String color) { this.color = color; }

  public boolean getStarted() { return this.started; }
  private void setStarted(boolean started) { 
    this.started = started; 
  }

  public int getCounter() { return this.counter; }
  private void setCounter() { this.counter++; }

  // methods
  public void start() {
    if (this.started) {
      System.out.println("Car is already running. Try stopping the car. ");
    } else {
      this.setStarted(true);
      this.setCounter();
      System.out.println("Car started. ");
      System.out.printf("You've started the car %d times. \n", this.getCounter());
    }
  }
  
  public void stop() {
    if (this.started) {
      System.out.println("Car stopped. ");
      this.setStarted(false);
    } else {
      System.out.println("Car is not running. Try starting the car. ");
    }
  }
}

