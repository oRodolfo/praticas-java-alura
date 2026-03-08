import pratica.atividade.POO.*;

public class ExecutavelAtividadePOO {
    public static void main(String[] args) {
        //passo 1: Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
        //atribuindo valore aos atributos com o metodos setters(atribuindo valores)
        ContaBancaria contaBancaria = new ContaBancaria();
        contaBancaria.titulo = "Rodolfo";
        contaBancaria.setNumeroConta(125);
        contaBancaria.setSaldoConta(1950.00);

        //executando os metodos getters (buscando algum valor)
        System.out.println(contaBancaria.getNumeroConta());
        System.out.println(contaBancaria.getSaldoConta());

        //passo 2: Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Rodolfo");
        idadePessoa.setIdade(18);
        idadePessoa.verificaIdade();

        //passo 3: Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
        Produto produto = new Produto();
        produto.setNome("Junta Homocinetica");
        produto.setPreco(195.50);
        System.out.println("Valor Total com 5% de desconto: R$" + produto.aplicarDesconto(5));

        //passo 4: Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
        Aluno aluno = new Aluno();
        aluno.setNome("Rodolfo");
        aluno.setNota1(9.8);
        aluno.setNota2(8.1);
        System.out.println("Media Nota: " + aluno.calcularMedia());

        //passo 5: Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
        Livro livro = new Livro();
        livro.setTitulo("Arquitetura Limpa");
        livro.setAutor("Robert C. Martin");

        livro.exibirDetalhes();
    }
}
