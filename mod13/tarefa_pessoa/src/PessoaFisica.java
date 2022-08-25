public class PessoaFisica extends Pessoa {

    private String CPF;

    public PessoaFisica(String nome, String endereco, String telefone, String CPF) {
        super(nome, endereco, telefone);
        this.CPF = CPF;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String cPF) {
        CPF = cPF;
    }

}
