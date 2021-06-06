package designPattern.creational.Singleton;

import java.io.*;

public class SerializationSolution implements Serializable {


    private SerializationSolution(){
    }

    private static final SerializationSolution INSTANCE = new SerializationSolution();

    public static SerializationSolution getInstance(){
        return INSTANCE;
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    /**
     * In order to solve the serialization solution we go for the below method
     * to tell the JVM that whenever serialization happens it has to happen based on instance
     */

    protected Object readResolve(){
        return INSTANCE;
    }

}

class Demo2{
    static void saveToFile(SerializationSolution singleton,String filename) throws Exception{
        try(FileOutputStream fileOutputStream= new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(singleton);
        }
    }

    static SerializationSolution readObjectFromFile(String filename) throws Exception{
        try(FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            return (SerializationSolution) objectInputStream.readObject();
        }
    }

    public static void main(String args[]) throws Exception {
        /**
         * problem with this approach
         * 1:Reflection: we can use it to make the constructor public
         * 2: serialization: we can make additional copy of the object (when we deserialize the object)
         */
        SerializationSolution singleton = SerializationSolution.getInstance();
        singleton.setValue(111);
        String filename ="singleton2.bin";
        saveToFile(singleton,filename);
        singleton.setValue(222);


        SerializationSolution singleton2 =readObjectFromFile(filename);
        System.out.print("Comparing both the object ....");
        System.out.println(singleton==singleton2);
        System.out.println("Value set for singleton object "+singleton.getValue());
        System.out.println("Value read from the file "+singleton2.getValue());

    }
}

