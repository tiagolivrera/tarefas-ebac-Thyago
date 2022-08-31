package fabricas;

import carros.Crossfox;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class WolkswagenFactory implements AbstractCarFactory {

    @Override
    public Car criaCarro() {
        System.out.println("Criando um Crossfox na fabrica da Wolkswagen");
        return new Crossfox();
    }

    @Override
    public void enviaConcessionaria() {
        System.out.println("Enviando a uma concessionaria da Wolkswagen");
        
    }
    
}
