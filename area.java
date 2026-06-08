class Area{
    void area(int side){
        System.out.println("Area of square is: " + side*side);
    }
    voidarea(int length,int breadth){
        System.out.println("Area of rectangle is: " + length*breadth);
    }
public static void main(String args[]){
        Area a = new Area();
        a.area(5);
        a.area(10, 20);
    }
}