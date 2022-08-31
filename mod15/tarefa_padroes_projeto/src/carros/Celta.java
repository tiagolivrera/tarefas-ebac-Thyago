package carros;

import interfaces.Car;

public class Celta implements Car {

    @Override
    public void motor() {
        System.out.println("4 cilindros em v");

    }

    @Override
    public void chassi() {
        System.out.println("OK");

    }

    @Override
    public void bateria() {
        System.out.println("Moura");

    }

    @Override
    public void alcaPQP() {
        System.out.println("SIM");

    }

    @Override
    public void farol() {
        System.out.println("OK");

    }

    @Override
    public void cambio() {
        System.out.println("Manual de 5 marchas");

    }

    @Override
    public void suspensao() {
        System.out.println("OK");

    }

    @Override
    public void transmissao() {
        System.out.println("OK");

    }

    @Override
    public void mantaAcustica() {
        System.out.println("Nao precisa");

    }

    @Override
    public void centralMultimidia() {
        System.out.println("Nao precisa");

    }

}
