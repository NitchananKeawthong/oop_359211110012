package ooplab8;

public class Rectangle extends Shape {

    public Rectangle(int width, int length) {
        super(width, length);
    }

    @Override
    public int getArea() {
        return super.getWidth()*super.getLength();
    }
}//class