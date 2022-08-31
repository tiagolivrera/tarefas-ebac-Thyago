import fabricas.ChevroletFactory;
import fabricas.HyundaiFactory;
import fabricas.PorscheFactory;
import fabricas.RenaultFactory;
import fabricas.ToyotaFactory;
import fabricas.WolkswagenFactory;
import interfaces.AbstractCarFactory;
import interfaces.Car;

public class App {

    public static Car configuraCarro(String marca) {
        AbstractCarFactory fabrica;
        Car carro;
        String opcao = marca.toLowerCase();

        if (opcao.contains("chevrolet")) {
            fabrica = new ChevroletFactory();
        } else if (opcao.contains("hyundai")) {
            fabrica = new HyundaiFactory();
        } else if (opcao.contains("porsche")) {
            fabrica = new PorscheFactory();
        } else if (opcao.contains("renault")) {
            fabrica = new RenaultFactory();
        } else if (opcao.contains("toyota")) {
            fabrica = new ToyotaFactory();
        } else {
            fabrica = new WolkswagenFactory();
        }

        carro = fabrica.criaCarro();
        fabrica.enviaConcessionaria();

        return carro;

    }

    public static void main(String[] args) throws Exception {

        configuraCarro("chevrolet");
        configuraCarro("porsche");
        configuraCarro("renault");
        configuraCarro("toyota");
        configuraCarro("wolkswagen");       
    }
}
