/*
2) Класс Laptop.
1) Создайте класс Laptop, который содержит переменные
   MacAddress,
   Model,
   Weight,
   ProcessorType,
   OS.
2) Создайте 3 объекта этого класса.
3) Выведите на консоль характерестики.
4) Добавить в класс Laptop методы: showNotePad(), имеет один параметр – имя файла.
   Выводит на консоль сообщение “Content of {name} file”.
   Создать геттеры и сеттеры для каждого поля. Вызвать эти методы для каждого из объектов.
5) Добавить конструктор в класс Laptop,
   который принимает на вход три параметра для инициализации переменных класса - macAdress, model и os.
6) Добавить конструктор,
   который принимает на вход два параметра для инициализации переменных класса - weight, processorType.
7) Добавить конструктор без параметров.
8) Добавьте перегруженный метод showNotePad(),
   который принимает два параметра - имя файла и количество строк кода в нем.
   Вызвать этот метод.
*/
public class Laptop {
    private int macAddress;
    private int model;
    private double weight;
    private int processorType;
    private String OS;
    public Laptop() {

    }
    public static void main(String[] args) {

    }
}
