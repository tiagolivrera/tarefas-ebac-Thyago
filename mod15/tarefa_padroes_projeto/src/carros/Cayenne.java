package carros;

import interfaces.Car;

public class Cayenne implements Car {

    @Override
    public void motor() {
        System.out.println("6 cilindros em V");

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
        System.out.println("Nao");

    }

    @Override
    public void farol() {
        System.out.println("Bom");

    }

    @Override
    public void cambio() {
        System.out.println("Automatico de 8 marchas");

    }

    @Override
    public void suspensao() {
        System.out.println("Bom");

    }

    @Override
    public void transmissao() {
        System.out.println("Bom");

    }

    @Override
    public void mantaAcustica() {
        System.out.println("Deve ter");

    }

    @Override
    public void centralMultimidia() {
        System.out.println("Sim");

    }

}
