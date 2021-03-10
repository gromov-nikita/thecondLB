/*
1) Класс Credit
Создать класс кредита, который принимает следующую информацию: название кредита,
ставка, срок погашения, штрафные санкции есть или нет

1) Создать массив объектов этого класса
2) Создать 2 конструктора, один принимает все аргументы, второй - 2 аргумента (на ваш выбор).
Один из конструкторов должен вызывать другой конструктор
3) Геттеры/сеттеры
4) создать метод для вывода информации на экран
 */
public class Credit {
    private String type;
    private double loanRate;
    private int term;
    private boolean fine;
    public Credit(String type, double loanRate, int term, boolean fine) {
        this(type, loanRate);
        this.term = term;
        this.fine = fine;
    }
    public Credit(String type, double loanRate) {
        this.type = type;
        this.loanRate = loanRate;
    }
    public String getType() {
        return type;
    }
    public double getLoanRate() {
        return loanRate;
    }
    public int getTerm() {
        return term;
    }
    public boolean getFine() {
        return fine;
    }
    public void setType(String type) {
        this.type = type;
    }
    public void setLoanRate(double loanRate) {
        this.loanRate = loanRate;
    }
    public void setTerm(int term) {
        this.term = term;
    }
    public void setFine(boolean fine) {
        this.fine = fine;
    }
    public void print() {
        System.out.println("Type: " + type);
        System.out.println("Loan rate: " + loanRate);
        System.out.println("Term: " + term);
        System.out.println("Fine: " + fine);
    }
    public static void main(String[] args) {
        Credit[] array = new Credit[3];
        array[0] = new Credit("12",0.5);
        array[1] = new Credit("123",0.6,21, false);
        array[2] = new Credit("1234",0.7,30,true);
        array[0].print();
        array[1].print();
        array[2].print();
        array[0].setType("1111111111");
        array[0].setLoanRate(2);
        array[0].setTerm(5400);
        array[0].setFine(true);
        System.out.println("________________");
        System.out.println(array[0].getType());
        System.out.println(array[0].getLoanRate());
        System.out.println(array[0].getTerm());
        System.out.println(array[0].getFine());
    }
}
