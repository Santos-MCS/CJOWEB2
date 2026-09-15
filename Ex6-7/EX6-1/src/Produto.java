public class Produto {

    private int codigo;
    private String nome;
    private double preco;

    public Produto(int codigo, String nome) {
        this.codigo = codigo; 
        this.nome = nome;
    }
 
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
    public String getNome() {
        return nome;
    }
 
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPreco() {
        return preco;
    }



    @Override
    public String toString() {
        return "Codigo: " + codigo +
               "\nNome: " + nome +
               "\nPreco: R$ " + preco;
    }


    
}
