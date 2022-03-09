package Exe1;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Fernando", "masc", 20, true);
        Barbecue barbecue = new Barbecue();
        barbecue.consumptionVerifier(person);
    }
}
