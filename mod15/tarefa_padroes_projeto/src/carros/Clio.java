package carros;

import interfaces.Car;

public class Clio implements Car{

    @Override
    public void motor() {
        System.out.println("140 CV");
        
    }

    @Override
    public void chassi() {
        System.out.println("OK");
        
    }

    @Override
    public void bateria() {
        System.out.println("Heliar");
        
    }

    @Override
    public void alcaPQP() {
        System.out.println("OK");
        
    }

    @Override
    public void farol() {
        System.out.println("OK");
        
    }

    @Override
    public void cambio() {
        System.out.println("Automatico");
        
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
        System.out.println("OK");
        
    }

    @Override
    public void centralMultimidia() {
        System.out.println("OK");
        
    }
    
}
