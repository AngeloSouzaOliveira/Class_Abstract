public class PessoaFisica extends Pessoa {
    private Long CPF;

    public PessoaFisica(Long CPF, String nome, Long cep, String cidade, String estado) {
        super(nome, cep, cidade, estado);
        this.CPF = CPF;
    }

    public Long getCPF() {
        return CPF;
    }

    public void setCPF(Long CPF) {
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "PessoaFisica:\n" +
                "CPF=" + CPF +
                '}';
    }
}
