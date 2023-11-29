public class Main {
    public static void main(String[] args) {

        Person sarah = new Person("Sarah", 30, 101);
//        Так он не выведет, потому что данные приватные.
//        System.out.println(sarah.age);
//        Так правильно, через геттер
        System.out.println(sarah.getAge());
//        Меняем возраст Саре
        sarah.setAge(28);
        System.out.println(sarah.getAge());
        /*Этот пример наглядно показывает принцип инкапсуляции, где мы
        * не даём напрямую доступ к переменным
        * */

    }
}