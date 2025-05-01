public class questao_3 {

    private int codigo;
    
    private String nome;
    
    private double preco;
    
    private int estoque;

    // Construtor que recebe os quatro parâmetros
    public questao_3(int codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }


    // Getters para todos os atributos
    public int getCodigo() {
        return codigo;
    }


    public String getNome() {
        return nome;
    }


    public double getPreco() {
        return preco;
    }


    public int getEstoque() {
        return estoque;
    }


    // Setter para o preço com validação para não aceitar valores negativos
    public void setPreco(double novoPreco) {
        if (novoPreco >= 0) {
            this.preco = novoPreco;
        } else {
            System.out.println("Erro: O preço não pode ser negativo.");
        }
    }


    // Método exibirInfo() que imprime todas as informações do produto
    public void exibirInfo() {
        System.out.println("Código: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + String.format("%.2f", preco));
        System.out.println("Estoque: " + estoque + " unidades");
    }


    public static void main(String[] args) {
        // Exemplo de uso da classe Produto
        questao_3 produto1 = new questao_3(123, "Notebook", 4899.99, 10);
        produto1.exibirInfo();
 
        System.out.println("\nPreço atual: R$" + produto1.getPreco());

        // Atualiza o preço
        produto1.setPreco(2750.50);
 
        System.out.println("Novo preço: R$" + produto1.getPreco());

        questao_3 produto2 = new questao_3(456, "Mouse", 25.99, 50);
        System.out.println("\nInformações do segundo produto:");
        produto2.exibirInfo();
    }
}