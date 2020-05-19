public class Parallelogram extends Rectangle{
  protected double side = 1;
  private static int count = 0;
  private static int keyCount = 0;

  public Parallelogram() {
    if (getClass() == Parallelogram.class) {
      count++;
      keyCount++;
      key = getShapeName() + keyCount;
    }
  }

  public Parallelogram(double base, double height, double side) {
    this();
    this.base = base;
    this.height = height;
    this.side = side;
  }

  @Override
  double findArea() {
    return base * height;
  }

  @Override
  double findPerimeter () {
    return (base + side) * 2;
  }

  public String toString() {
    return String.format("[%s] - Base: %.2f | Height: %.2f | Side: %.2f | Key: %s", getShapeName(), base, height, side, key);
  }

  public static int getCount() {
    return count;
  }

  public static int countDecrement() {
    Quadrilateral.countDecrement();
    count--;
    return count;
  }
}