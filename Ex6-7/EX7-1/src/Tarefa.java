// Criando a classe
public class Tarefa {

    private int codigo;
    private String titulo;

    public Tarefa(int codigo, String titulo) {
        this.codigo = codigo;
        this.titulo = titulo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }



    @Override
    public String toString() {
        return "Código: " + codigo +
               " | Título: " + titulo;
    }


    
}
