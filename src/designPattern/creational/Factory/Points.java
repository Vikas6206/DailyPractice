package designPattern.creational.Factory;

public class Points {

    double x;
    double y;

    Points(double a, double b){
        x=a;
        y=b;
    }

    //if we want to have a square root of parameters being passed to the variables
    //then we have to create another constructor which is not allowed since the parameters are doing to remain same

//    Points(double a, double b){
//        x=Math.sqrt(a);
//        y=Math.sqrt(b);
//    }
    static  public class PointFactory{
        static public Points createFactoryObject(double a, double b){
            //this method returns the new Factory object
            return new Points(a,b);
        }

        static public Points createSquareRootFactoryObject(double a, double b){
            //deos the commented function of object creation
            return new Points(Math.sqrt(a),Math.sqrt(b));
        }
    }


    public static void main(String args[]){
        Points f1=Points.PointFactory.createFactoryObject(3,4);
        System.out.println("Values of object f1 are "+f1.x+" "+f1.y);
        Points f2 = Points.PointFactory.createFactoryObject(9,16);
        System.out.println("Values of object f2 are "+f2.x+" "+f2.y);
    }
}
