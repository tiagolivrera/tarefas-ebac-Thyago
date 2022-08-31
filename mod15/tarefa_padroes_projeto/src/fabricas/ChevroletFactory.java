package fabricas;

import carros.Celta;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class ChevroletFactory implements AbstractCarFactory {

    @Override
    public Car criaCarro() {
        System.out.println("Criando um Celta na fabrica da Chevrolet");
        return new Celta();
    }

    @Override
    public void enviaConcessionaria() {
        System.out.println("Enviando a uma concessionaria da Chevrolet");
        
    }
    
}
