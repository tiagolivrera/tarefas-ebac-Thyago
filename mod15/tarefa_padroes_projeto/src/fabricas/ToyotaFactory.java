package fabricas;

import carros.Corolla;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class ToyotaFactory implements AbstractCarFactory {

    @Override
    public Car criaCarro() {
        System.out.println("Criando um Corolla na fabrica da Toyota");
        return new Corolla();
    }

    @Override
    public void enviaConcessionaria() {
        System.out.println("Enviando a uma concessionaria da Toyota");

    }

}
