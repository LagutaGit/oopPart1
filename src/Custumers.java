public class Custumers extends Person {
    private String name;
    private int age;
    private int phoneNumber;
    private int cardNumber;

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Custumers(String name, int age, int phoneNumber, int cardNumber) {
        super(name, age, phoneNumber);
        this.cardNumber = cardNumber;
    }
}
