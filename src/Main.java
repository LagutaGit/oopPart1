import javax.print.PrintService;

public class Main {
    public static void main(String[] args) {

//        Person sarah = new Person("Sarah", 30, 101);
////        Так он не выведет, потому что данные приватные.
////        System.out.println(sarah.age);
////        Так правильно, через геттер
//        System.out.println(sarah.getAge());
////        Меняем возраст Саре
//        sarah.setAge(28);
//        System.out.println(sarah.getAge());
//        /*Этот пример наглядно показывает принцип инкапсуляции, где мы
//         * не даём напрямую доступ к переменным
//         * */

        Person[] people = {
                new Person("Сара", 30, 101),
                new Person("Иван", 31, 102),
                new Person("Дмитрий", 35, 103),
                new Person("Сара", 30, 101),
                new Person("Иван", 31, 102),
                new Person("Дмитрий", 35, 103)
        };

        Custumers[] custumerss = {
                new Custumers("Сара", 30, 101, 11122233),
                new Custumers("Иван", 31, 102,12211223),
                new Custumers("Дмитрий", 35, 103, 12332121),
                new Custumers("Сара", 30, 101, 12332121),
                new Custumers("Иван", 31, 102, 12332121),
                new Custumers("Дмитрий", 35, 103, 12332121)
        };

        Gamer[] gamers = {
                new Gamer("Сара", 30, 101, "PlayStation"),
                new Gamer("Иван", 31, 102,"PlayStation"),
                new Gamer("Дмитрий", 35, 103, "PlayStation"),
                new Gamer("Сара", 30, 101, "PlayStation"),
                new Gamer("Иван", 31, 102, "PlayStation"),
                new Gamer("Дмитрий", 35, 103, "PlayStation")
        };

//        Делаем перегрузку, это 2 метода которые делают одинаковые действия отличаются только аргументы которые
//        мы передаём

        PrintServices printServices = new PrintServices();
        printServices.print(people);
        printServices.print(custumerss);
        printServices.print(gamers);
    }
}