public class Circle{

    private double radius;
    private double originX;
    private double originY;

    public Circle(double radius,double originX,double originY){
    this.radius = radius;
    this.originX = originX;
    this.originY = originY;
    }

    public Circle(double radius){
        this(radius,0,0);
    }

    public Circle(){
        this(1,0,0);
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double newRadius){
        if(newRadius > 0)
        radius = newRadius;
    }

    public double getOriginX(){
        return originX;
    }
    
    public void setOriginX(double newOriginX){
        if(newOriginX > 0)
        originX = newOriginX;
    }

    public double getOriginY(){
        return originY;
    }
    public void setOriginY(double newOriginY){
        if(newOriginY > 0)
        originY = newOriginY;
    }

    public double getArea(){
        return Math.PI * (radius*radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * radius;
    }

    public void move(double moveX,double moveY){
        originX += moveX;
        originY += moveY;
    }

    public String toString(){
        return "Circle[x="+originX+",y="+originY+",r="+radius+"]";
    }
    
    public void scale(double factor){
        radius *= factor;
    }

    public boolean isOverlappedWith(Circle c){
        double distanceCentre = Math.sqrt((originX-c.originY)*(originX-c.originY) + (originY-c.originY)*(originY-c.originY));
        return distanceCentre < radius + c.radius;
    }

    public boolean isEnclosedBy(Circle c){
        if(isOverlappedWith(c) == false) return false;

        double distanceCentre = Math.sqrt((originX-c.originY)*(originX-c.originY) + (originY-c.originY)*(originY-c.originY));
        return (distanceCentre + radius < c.radius);

    }

}