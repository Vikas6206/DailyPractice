package designPattern.creational.Singleton;

public class BasicSingleton {

    private BasicSingleton(){
    }

    private static final BasicSingleton INSTANCE = new BasicSingleton();

    public static BasicSingleton getInstance(){
        return INSTANCE;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

class Demo{


    public static void main(String args[]){
       /**
        * problem with this approach
        * 1:Reflection: we can use it to make the constructor public
        * 2: serialization: we can make additional copy of the object (when we deserialize the object)
        */
       BasicSingleton singleton = BasicSingleton.getInstance();
       singleton.setValue(234);
       System.out.println(singleton.getValue());
   }
}
