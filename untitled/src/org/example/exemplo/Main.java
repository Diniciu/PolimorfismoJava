package org.example.exemplo;

public class Main {
    public static void main(String[] args) {

        Fisica fisica = new Fisica("Marta", "1234", "6589", "568942", "11/09/2001");
        Juridica juridica = new Juridica("Fernando", "456", "56489", "123456");

        System.out.println(fisica.toString());
        System.out.println(juridica.toString());
    }
}