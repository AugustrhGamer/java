public class Tarefa {
    private String titulo;
    private String descricao;
    private int prioridade;
    private String prazo;

    public Tarefa(String titulo, int prioridade) {
        this.titulo = titulo;
        this.prioridade = prioridade;
        this.descricao = "Descrição padrão"; 
        this.prazo = "Sem prazo definido";   
    }
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade);
        System.out.println("Prazo: " + prazo);
    }

    public static void main(String[] args) {
        Tarefa tarefa = new Tarefa("Comprar leite", 2);
        tarefa.exibirDetalhes();
    }
}
