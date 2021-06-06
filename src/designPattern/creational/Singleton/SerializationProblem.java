package designPattern.creational.Singleton;

import java.io.*;

public class SerializationProblem implements Serializable{


    private SerializationProblem(){
    }

    private static final SerializationProblem INSTANCE = new SerializationProblem();

    public static SerializationProblem getInstance(){
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

class Demo1{
    static void saveToFile(SerializationProblem singleton,String filename) throws Exception{
        try(FileOutputStream fileOutputStream= new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            objectOutputStream.writeObject(singleton);
        }
    }

    static SerializationProblem readObjectFromFile(String filename) throws Exception{
        try(FileInputStream fileInputStream = new FileInputStream(filename);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)){
            return (SerializationProblem) objectInputStream.readObject();
        }
    }

    public static void main(String args[]) throws Exception {
        SerializationProblem singleton = SerializationProblem.getInstance();
        singleton.setValue(111);
        String filename ="singleton.bin";
        saveToFile(singleton,filename);
        singleton.setValue(222);


        SerializationProblem singleton2 =readObjectFromFile(filename);
        System.out.print("Comparing both the object ....");
        System.out.println(singleton==singleton2);
        System.out.println("Value set for singleton object "+singleton.getValue());
        System.out.println("Value read from the file "+singleton2.getValue());

    }
}
