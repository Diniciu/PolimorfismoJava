package org.example.interfaces;

public class Galo implements Animal{
    @Override
    public String emitirSom() {
        return "Cocó!";
    }

    @Override
    public String comer() {
        return "'Comendo sementes.'";
    }
}
