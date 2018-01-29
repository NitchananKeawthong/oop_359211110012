package ooplab8;
//Abstract class
public abstract class Shape {
    private int width;
    private  int length;

    public abstract int getArea();

    public Shape(int width, int length) {
        this.width = width;
        this.length = length;
    }


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }
}//class
