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

        Person[] people = {
                new Person("Сара", 30, 101),
                new Person("Иван", 31, 102),
                new Person("Дмитрий", 35, 103), new Person("Сара", 30, 101),
                new Person("Иван", 31, 102),
                new Person("Дмитрий", 35, 103)
        };

        System.out.println("Размер списка " + people.length);
//        Распечатаем содержимое
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя: " + person.getName() + "; Возраст: " + person.getAge() + "; Телефон: " + person.getPhoneNumber());
        }
    }
}