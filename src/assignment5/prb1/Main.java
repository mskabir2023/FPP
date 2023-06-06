package assignment5.prb1;

public class Main {
    public static void printTotal(Shape[] shapes){
        double sumArea = 0;
        double sumPerimeter = 0;
        for (int i = 0; i< shapes.length; i++){
            sumArea += shapes[i].calculateArea();
            sumPerimeter += shapes[i].calculatePerimeter();
        }
        System.out.println("Total Area:"+sumArea);
        System.out.println("Total Perimeter:"+sumPerimeter);
    }
    public static void main(String[] args) {
     Shape s1 = new Shape("Green");
     Shape s2 = new Shape("Red");
     Shape r = new Rectangle("Green", 2.2, 4.2);
     Shape r1 = new Rectangle("yellow", 2.2, 4.2);
     Shape c = new Circle("Blue", 5.6);

     Shape[] shapes = new Shape[5];

     shapes[0] = s1;
     shapes[1] = s2;
     shapes[2]=r;
     shapes[3]=c;
     shapes[4]=r1;

     printTotal(shapes);
    }
}
