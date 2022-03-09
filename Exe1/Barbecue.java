package Exe1;

public class Barbecue {
    double qtdMeat;

    void consumptionVerifier(Person person) {
        if(person.age >= 0 || person.age <= 3 || person.vegetarian == true) {
            this.qtdMeat = 0.000;
        }
        if(person.age >= 4 || person.age <= 12) {
            this.qtdMeat = 1.000;
        }
        if(person.age >= 13) {
            this.qtdMeat = 2.000;
        }
        System.out.println(person.name + " consume " + this.qtdMeat + " Kg de carne");
    }
}
