package org.example.atividade;

public class Main {
    public static void main(String[] args){

        Motoboy motoboy = new Motoboy("SimasTurbo", "turbosimas@gov.com", 2345, "56984");
        Gerente gerente = new Gerente("Goku", "kugosayajin@dragon.com", 3456, 789654);

        System.out.println(motoboy.toString());
        System.out.println(gerente.toString());
    }
}
