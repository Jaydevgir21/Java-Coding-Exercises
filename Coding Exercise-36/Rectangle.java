public class Rectangle {
    // write your code here
    private double width;
    private double length;
    
    public Rectangle(double width,double length){
        if(width < 0){
            width=0;
        }
        if(length < 0){
            length=0;
        }
        this.length=length;
        this.width=width;
        
    }
    public double getWidth(){
        return this.width;
    }
    public double getLength(){
        return this.length;
    }
    public double getArea(){
        return width*length;
    }
}