// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width;
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;


  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;


  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;

  }

  public Rectangle(double width, double height) {
    this(width, height, 0, 0);
  }

  public Rectangle() {
    this(1,1,0,0);
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  public void scale(double scaleX,double scaleY){
    width *= scaleX;
    height *= scaleY;
  }

  public void scale(double factor){
    width *= factor;
    height *= factor;
  }


  public boolean isOverlappedWith(Rectangle r){
    double upperYt = this.originY + (this.height/2);
    double lowerYt = this.originY - (this.height/2);
    double rightXt = this.originX + (this.width/2);
    double leftXt = this.originX - (this.width/2);

    double upperYr = r.originY + (r.height/2);
    double lowerYr = r.originY - (r.height/2);
    double rightXr = r.originX + (r.width/2);
    double leftXr = r.originX - (r.width/2);

    if(upperYt < lowerYr || upperYr < lowerYt) return false;
    if(rightXt < leftXr || rightXr < leftXt) return false;

    return true;
  }

  public static boolean areOverlapping(Rectangle r1, Rectangle r2){
    return r1.isOverlappedWith(r2);
  }

  public double calcRatio(){
    double res1 = width / height;
    double res2 = width * (1/height);

    
    if(Math.abs(res1 - res1) > 0.001) return -1;

    return width / height;
  } 

  public boolean isSquare(){
    return height == width;
  }

}
