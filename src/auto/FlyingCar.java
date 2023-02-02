package auto;

public class FlyingCar extends Car {
  // new attributes
  private double altitude = 0.0;

  // own constructor
  public FlyingCar(String registration) {
    super.setRegistration(registration);
  };

  // new getters and setters
  public double getAltitude() { return this.altitude; };
  public void setAltitude(double altitude) { this.altitude = altitude; }

  public void climb() { this.climb(10); }
  public void climb(double feet) {
    if (this.altitude < 100.0) {
      this.altitude = Math.min((this.altitude + feet), 100.0);
    }
    System.out.printf("The car is now at %f feet. \n", this.altitude);
  }

  // overriding an existing method
  @Override // this is an annotation
  public String getRegistration() {
    return "FV" + super.getRegistration();
  }

  @Override
  public void start() {
    super.start();
    this.climb();
  }
}
