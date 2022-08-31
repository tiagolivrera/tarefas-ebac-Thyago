public class App {
    public static void main(String[] args) throws Exception {
        
        Pessoa p1 = new PessoaFisica("Joao", "Rua das Flores", "98765-1234", "12345665412");
        Pessoa p2 = new PessoaJuridica("Maria", "Rua da Areia", "98123-7645", "12964538712");

        PessoaFisica pf = (PessoaFisica) p1;
        PessoaJuridica pj = (PessoaJuridica) p2;

        System.out.println("Pessoa Fisica: " + p1.getNome() + ", " + p1.getEndereco() + ", " + p1.getTelefone() + ", " + pf.getCPF());
        System.out.println("Pessoa Juridica: " + p2.getNome() + ", " + p2.getEndereco() + ", " + p2.getTelefone() + ", " + pj.getCNPJ());
    }
} 