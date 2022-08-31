package fabricas;

import carros.Cayenne;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class PorscheFactory implements AbstractCarFactory {

    @Override
    public Car criaCarro() {
        System.out.println("Criando um Cayenne na fabrica da Porsche");
        return new Cayenne();
    }

    @Override
    public void enviaConcessionaria() {
        System.out.println("Enviando a uma concessionaria da Porsche");

    }
}
