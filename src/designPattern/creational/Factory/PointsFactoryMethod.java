package designPattern.creational.Factory;

/**
 * This factory method design pattern is used to create the
 * object via method i.e. we will be calling the methods to
 * create different type of objects
 */
public class PointsFactoryMethod {
    double x;
    double y;

    PointsFactoryMethod(double a, double b){
        x=a;
        y=b;
    }

    //if we want to have a square root of parameters being passed to the variables
    //then we have to create another constructor which is not allowed since the parameters are doing to remain same

//    PointsFactoryMethod(double a, double b){
//        x=Math.sqrt(a);
//        y=Math.sqrt(b);
//    }

    static public PointsFactoryMethod createFactoryObject(double a, double b){
        //this method returns the new Factory object
        return new PointsFactoryMethod(a,b);
    }

    static public PointsFactoryMethod createSquareRootFactoryObject(double a, double b){
        //deos the commented function of object creation
        return new PointsFactoryMethod(Math.sqrt(a),Math.sqrt(b));
    }

    public static void main(String args[]){
        PointsFactoryMethod f1=createFactoryObject(3,4);
        System.out.println("Values of object f1 are "+f1.x+" "+f1.y);
        PointsFactoryMethod f2 = createFactoryObject(9,16);
        System.out.println("Values of object f2 are "+f2.x+" "+f2.y);
    }
}
