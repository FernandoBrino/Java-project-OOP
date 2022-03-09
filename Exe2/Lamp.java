package Exe2;

public class Lamp {
    boolean isOn;
    int numberClicks;

    public void activeLamp() {
        if(numberClicks >= 5) {
            isOn = false;
            System.out.println("A lampada queimou!!");
        }
        if(!isOn) {
            isOn = true;
            System.out.println("lampada ligada!");
        }else {
            isOn = false;
            System.out.println("lampada desligada!");
        }
        numberClicks += 1;
    }
}
