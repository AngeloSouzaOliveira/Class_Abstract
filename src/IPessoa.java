public interface IPessoa {

    default void endereco( Long cep, String cidade, String estado){
        System.out.println("Endereço: " +  cep + ", " + cidade + ", " + estado + "\n");
    }
}
