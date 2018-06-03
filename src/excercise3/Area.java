package excercise3;

public class Area {
    //method to calculate the area of the circle
    public static double getArea(double radius)
    {
        return Math.PI*radius*radius;
    }

    //method to calculate the area of a rectangle
    public static double getArea(int length,int breadth){
        return length* breadth;
    }
    // method to calculate the area of a cylinder
    public static double getArea(double radius, double height){
        return Math.PI* radius* radius*height;
    }
}
