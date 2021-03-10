import java.util.regex.Matcher;

/*
3) Куратор  для проверки одной работы
(которая включается в себя N задач) за каждого студента берет в качестве оплаты X$.
Каждую неделю студент получает новую работу, за каждую предыдущую несданную работу идет
коэффициент штрафов Z, который умножается каждую неделю:
предыдущая сумма за тему на указанный процент
(т.е. если в первую неделю студент не сдал тему, то на след неделе стоимость проверки будет X * (1 + Z),
просрочка еще на неделю (X * (1 + Z)) * (1 + Z), и т.д.)
При этом каждую неделю нужно сдавать и новую тему, иначе и на эту тему тоже идет штраф.
1) Какую сумму куратор получит за студента,
если он
1)просрочит сдачу одной темы на T недель,
2)просрочит сдачу N из M тем на Y недель каждая,
3)не выполнит ни одной темы на T недель,
4) по каждой теме будет иметь просрочку на неделю/Q недель
2) Какую сумму куратор получит за всех студентов,
если S студентов из общего количества студентов сделали просрочки, остальные все вовремя сдавали
Разработать класс, калькулятор просрочек выполнения заданий куратора
Параметры настройки калькулятора должны иметь как минимум:
процент, на который стоимость часа куратора увеличивается с каждой неделей просрочки,
количество недель курса, количество студентов на занятии
Дополнительные параметры/функционал добавляются разработчиком самостоятельно
Эту задачу будете защищать
 */
public class Runner {
    private int price;
    private double factor;
    private int allTasks;
    private int weeks;
    private int amountOfUnit;
    private int amountOfPeople;
    public int getWeeks() {
        return weeks;
    }
    public int getPrice() {
        return price;
    }
    public double getFactor() {
        return factor;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setFactor(double factor) {
        this.factor = factor;
    }
    //1
    public double salary1(int time) {
        //(X * (1 + Z)) * (1 + Z), и т.д.)
        //1)просрочит сдачу одной темы на T недель,
        return price * (weeks - time) + price * Math.pow(1 + factor,time);
    }
    //2
    public double salary2(int time, int task) {
        return price * (weeks - time) + price * Math.pow(1 + factor, time) * task;
    }
    //3
    public double salary3(int period) {
        double sum = 0;
        sum += price * (weeks - period);
        for(; period < 0; period--) {
            sum += price * Math.pow(1 + factor,period);
        }
        return sum;
    }
    //4
    public double salary4(int time) {
        return price * Math.pow(1 + factor, time) * allTasks;
    }
    //5
    public double salary5(int time, int task, int people) {
        return  (price * (weeks - time) + (price * Math.pow(1 + factor, time) * task)) * people +
                 price * weeks * (amountOfPeople - people);
    }
    public static void main(String[] args) {

    }
}
