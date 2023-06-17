public class PessoaJuridica extends Pessoa {
    private Long cnpj;

    public PessoaJuridica(Long cnpj, String nome, Long cep, String cidade, String estado) {
        super(nome, cep, cidade, estado);
        this.cnpj = cnpj;
    }

    public Long getCnpj() {
        return cnpj;
    }

    public void setCnpj(Long cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "PessoaJuridica:\n" +
                "cnpj=" + cnpj +
                '}';
    }
}
