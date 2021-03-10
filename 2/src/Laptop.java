/*
2) Класс Laptop.***************************************
1) Создайте класс Laptop, который содержит переменные**********************
   MacAddress,
   Model,
   Weight,
   ProcessorType,
   OS.
2) Создайте 3 объекта этого класса.*******************
3) Выведите на консоль характерестики.*******************
4) Добавить в класс Laptop методы: showNotePad(), имеет один параметр – имя файла.******************
   Выводит на консоль сообщение “Content of {name} file”.
   Создать геттеры и сеттеры для каждого поля. Вызвать эти методы для каждого из объектов.****************
5) Добавить конструктор в класс Laptop,***************
   который принимает на вход три параметра для инициализации переменных класса - macAdress, model и os.
6) Добавить конструктор,****************
   который принимает на вход два параметра для инициализации переменных класса - weight, processorType.
7) Добавить конструктор без параметров.*********************
8) Добавьте перегруженный метод showNotePad(),************************
   который принимает два параметра - имя файла и количество строк кода в нем.
   Вызвать этот метод.
*/
public class Laptop {
    private int macAddress;
    private int model;
    private double weight;
    private int processorType;
    private String os;
    public int getMacAddress() {
        return macAddress;
    }
    public int getModel() {
        return model;
    }
    public int getProcessorType() {
        return processorType;
    }
    public String getOs() {
        return os;
    }
    public void setMacAddress(int macAddress) {
        this.macAddress = macAddress;
    }
    public void setModel(int model) {
        this.model = model;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public void setProcessorType(int processorType) {
        this.processorType = processorType;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public double getWeight() {
        return weight;
    }
    public Laptop() {}
    public Laptop(int macAdress, int model, String os) {
        this.macAddress = macAdress;
        this.model = model;
        this.os = os;
    }
    public Laptop(int weight, int processorType) {
        this.weight = weight;
        this.processorType = processorType;

    }
    public void showNotePad(String name) {
        System.out.println("Content of {" + name + "} file");
    }
    public void showNotePad(String name, int amountOfStrings) {
        System.out.println("Content of {" + name + "} file. Strings " + amountOfStrings);
    }
    /*
   MacAddress,
   Model,
   Weight,
   ProcessorType,
   OS.
     */
    public static void main(String[] args) {
        Laptop obj1 = new Laptop(1,2,"qwer");
        Laptop obj2 = new Laptop(3,4);
        Laptop obj3 = new Laptop();
        obj1.setMacAddress(10);
        obj1.setModel(20);
        obj1.setWeight(30);
        obj1.setProcessorType(40);
        obj1.setOs("OS50");
        obj2.setMacAddress(60);
        obj2.setModel(70);
        obj2.setWeight(80);
        obj2.setProcessorType(90);
        obj2.setOs("OS100");
        obj3.setMacAddress(110);
        obj3.setModel(120);
        obj3.setWeight(130);
        obj3.setProcessorType(140);
        obj3.setOs("OS150");
        System.out.println("1)))))))))))))))))))))))");
        System.out.println("MacAddress: " + obj1.getMacAddress());
        System.out.println("Model: " + obj1.getModel());
        System.out.println("Weight: " + obj1.getWeight());
        System.out.println("ProcessorType:" + obj1.getProcessorType());
        System.out.println("OS: " + obj1.getOs());
        System.out.println("2)))))))))))))))))))))))");
        System.out.println("MacAddress: " + obj1.getMacAddress());
        System.out.println("Model: " + obj1.getModel());
        System.out.println("Weight: " + obj1.getWeight());
        System.out.println("ProcessorType:" + obj1.getProcessorType());
        System.out.println("OS: " + obj1.getOs());
        System.out.println("3)))))))))))))))))))))))");
        System.out.println("MacAddress: " + obj1.getMacAddress());
        System.out.println("Model: " + obj1.getModel());
        System.out.println("Weight: " + obj1.getWeight());
        System.out.println("ProcessorType:" + obj1.getProcessorType());
        System.out.println("OS: " + obj1.getOs());
        obj1.showNotePad("file name");
        obj1.showNotePad("file name", 59);

    }
}
