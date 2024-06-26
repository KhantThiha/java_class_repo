package assignment5.Circle;

public class MyCircle {
    private double radius;
    private MyPoint center;
    public MyCircle() {
        this.radius=1;
        this.center=new MyPoint();
    }
    public MyCircle(int xCenter,int yCenter,double radius) {
        this.radius = radius;
        this.center=new MyPoint(xCenter,yCenter);
    }
    public MyCircle(MyPoint center,double radius) {
        this.radius = radius;
        this.center = center;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public MyPoint getCenter() {
        return center;
    }
    public void setCenter(MyPoint center) {
        this.center = center;
    }
    public int getCenterX(){
        return this.center.getX();
    }
    public int getCenterY(){
        return this.center.getY();
    }
    public void setCenterX(int x){
        this.center.setX(x);
    }
    public void setCenterY(int y){
        this.center.setX(y);
    }
    public void setCenterXY(int x,int y){
        this.center.setXY(x, y);;
    }
    public String toString(){
        return "center="+this.center.toString()+" radius="+this.radius;
    }
    public double distance(MyCircle another) {
        return this.center.distance(another.center);
    }
}
