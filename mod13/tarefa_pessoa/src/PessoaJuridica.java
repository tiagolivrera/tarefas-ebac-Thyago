public class PessoaJuridica extends Pessoa {

    private String CNPJ;

    public PessoaJuridica(String nome, String endereco, String telefone, String CNPJ) {
        super(nome, endereco, telefone);
        this.CNPJ = CNPJ;
    }

    public String getCNPJ() {
        return CNPJ;
    }

    public void setCNPJ(String cNPJ) {
        CNPJ = cNPJ;
    }
}
