# Documentação - Classes de Pessoa em Java

Este repositório contém um código em Java que implementa uma hierarquia de classes para representar pessoas, incluindo pessoas físicas e jurídicas. O código utiliza interfaces, classes abstratas e herança para criar uma estrutura flexível e extensível.

## Estrutura do Projeto
O projeto está organizado em quatro classes:

- IPessoa (Interface): Essa interface define um método default de endereco que pode ser implementado por classes que representam pessoas. O método endereco recebe informações de endereço (CEP, cidade e estado) e exibe essas informações na saída padrão.

- Pessoa (Classe Abstrata): Essa classe abstrata implementa a interface IPessoa e define os atributos comuns a todas as pessoas, como nome, CEP, cidade e estado. A classe possui um construtor para inicializar esses atributos e métodos getter e setter para acessá-los. Além disso, a classe sobrescreve o método toString para retornar uma representação em string dos atributos da pessoa.

- PessoaFisica (Classe): Essa classe estende a classe Pessoa e representa uma pessoa física. Ela adiciona o atributo CPF e possui um construtor para inicializar todos os atributos. A classe também implementa um método getter e setter para o CPF e sobrescreve o método toString para retornar uma representação em string da pessoa física.

- PessoaJuridica (Classe): Essa classe também estende a classe Pessoa e representa uma pessoa jurídica. Ela adiciona o atributo CNPJ e possui um construtor para inicializar todos os atributos. A classe também implementa um método getter e setter para o CNPJ e sobrescreve o método toString para retornar uma representação em string da pessoa jurídica.

Além das classes mencionadas acima, o código também contém uma classe Main com um método main. Esse método cria instâncias de PessoaFisica e PessoaJuridica e demonstra o uso das classes, chamando métodos e exibindo informações na saída padrão.


## Exemplo de uso
```
PessoaFisica pf = new PessoaFisica(12345678902L, "Angelo", 23025200L, "Niterói", "RJ");
PessoaJuridica pj = new PessoaJuridica(54559230000114L, "Empresa S&A", 24030522L, "Rio de Janeiro", "RJ");

imprimir("****  PESSOA FÍSICA  ****");
imprimir("Nome: " + pf.getNome());
imprimir("CPF: " + pf.getCPF());
pf.endereco(pf.getCep(), pf.getCidade(), pf.getEstado());

imprimir("****  PESSOA JURÍDICA  ****");
imprimir("Nome: " + pj.getNome());
imprimir("CNPJ: " + pj.getCnpj());
pj.endereco(pj.getCep(), pj.getCidade(), pj.getEstado());
```