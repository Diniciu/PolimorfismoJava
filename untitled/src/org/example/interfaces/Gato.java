package org.example.interfaces;

public class Gato implements Animal{
    @Override
    public String emitirSom() {
        return "Miau!";
    }

    @Override
    public String comer() {
        return "'Comendo ração.'";
    }
}
