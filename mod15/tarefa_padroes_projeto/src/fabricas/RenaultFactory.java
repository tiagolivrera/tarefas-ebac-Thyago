package fabricas;

import carros.Clio;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class RenaultFactory implements AbstractCarFactory {

    @Override
    public Car criaCarro() {
        System.out.println("Criando um Clio na fabrica da Renault");
        return new Clio();
    }

    @Override
    public void enviaConcessionaria() {
        System.out.println("Enviando a uma concessionaria da Renault");
        
    }
    
}
