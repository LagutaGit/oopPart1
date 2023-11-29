public class PrintServices {
    public void print(Person[] people) {
        System.out.println("Размер списка " + people.length);
//        Распечатаем содержимое
        for (int i = 0; i < people.length; i++) {
            Person person = people[i];
            System.out.println("Имя: " + person.getName() + "; Возраст: " + person.getAge() + "; Телефон: " + person.getPhoneNumber());
        }
    }

    public void print(Custumers[] custumerss) {
        System.out.println("Размер массива кастомерс: " + custumerss.length);
        for (int i = 0; i < custumerss.length; i++) {
            Custumers custumers = custumerss[i];
            System.out.println("Имя: " + custumers.getName() + "; Возраст: " + custumers.getAge() + "; Телефон: "
                    + custumers.getPhoneNumber() + "; Номер карты " + custumers.getCardNumber());
        }
    }
}
