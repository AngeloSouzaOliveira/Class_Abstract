public class Main {
    public static void main(String[] args) {

        PessoaFisica pf = new PessoaFisica(12345678902L, "Angelo", 23025200L, "Niterói", "RJ");
        PessoaJuridica pj = new PessoaJuridica(54559230000114L, "Empresa S&A", 24030522L, "Rio de Janeiro", "RJ");

        imprimir("****  PESSOA FÍSICA  ****");
        imprimir("Nome : " + pf.getNome());
        imprimir("CPF: " + pf.getCPF());
        pf.endereco(pf.getCep(), pf.getCidade(), pf.getEstado());

        imprimir("****  PESSOA JURÍDICA  ****");
        imprimir("Nome : " + pj.getNome());
        imprimir("CNPJ: " + pj.getCnpj());
        pj.endereco(pj.getCep(), pj.getCidade(), pj.getEstado());
    }

    public static  void imprimir(String value){
        System.out.println(value);
    }
}