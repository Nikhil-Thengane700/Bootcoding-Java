public class Box {


      double length;
      double breadth;
     double height;

    public static Box createBox(){
        Box box = new Box();

        box.length= 10;
        box.breadth=20;
        box.height=15;


        return box;
    }

    public static Box createBox(double length, double breadth,double height){

        Box box= new Box();
        box.length=length;
        box.breadth=breadth;
        box.height=height;
        return box;

    }

    public static void printBox(Box box){
        System.out.println("Length "+box.length);
        System.out.println("breadth "+box.breadth);
        System.out.println("Height "+ box.height);
    }
}
