public class Wolksvagen extends Carro {

    public Wolksvagen(String modelo, int ano) {
        super(modelo, ano);
    }

    @Override
    public int max_velocimetro() {
        return 210;
    }

    @Override
    public int max_volume_tanque() {
        return 40;
    }

    @Override
    public int max_qtde_passageiros() {
        return 5;
    }

}
