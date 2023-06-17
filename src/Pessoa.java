public abstract class Pessoa implements IPessoa {
    private String nome;
    private Long cep;
    private String cidade;
    private  String estado;

    public Pessoa(String nome, Long cep, String cidade, String estado) {
        this.nome = nome;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getCep() {
        return cep;
    }

    public void setCep(Long cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", \ncep='" + cep + '\'' +
                ", \ncidade='" + cidade + '\'' +
                ", \nestado='" + estado + '\'' +
                '}';
    }
}
