package fabricas;

import carros.Creta;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class HyundaiFactory implements AbstractCarFactory {

    @Override
    public Car criaCarro() {
        System.out.println("Criando um Creta na fabrica da Hyundai");
        return new Creta();
    }

    @Override
    public void enviaConcessionaria() {
        System.out.println("Enviando a uma concessionaria da Hyundai");
        
    }
    
}
