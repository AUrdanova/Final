package com.company;

public class Main {

    public static void main(String[] args) {
        giveMeAdvice();
        giveMeAdvice();
        giveMeAdvice();
        giveMeAdvice();
        giveMeAdvice();

    }


    public static int giveMeAdvice() {
        int ageOfPerson = 15;
        int temperature = 21;
        if ((ageOfPerson > 20 && ageOfPerson < 45) && (temperature > -20 && temperature < 30)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfPerson < 20) && (temperature > 0 && temperature < 28)) {
            System.out.println("Можно идти гулять");
        } else if ((ageOfPerson > 45) && (temperature > -10 && temperature < 25)) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайтесь дома");

        }

        return ageOfPerson;
    }
    public static int generateRandomAge(){
        int  = Math.random() * (45 - 20) + 20;
        System.out.println("Можно ли идти гулять");


    }
}












