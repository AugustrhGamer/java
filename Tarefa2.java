public class Tarefa2 {
    private int prioridade;
    public Tarefa2(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade deve estar entre 1 e 5.");
        }
    }
    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }
    public int getPrioridade() {
        return prioridade;
    }
    public void setPrioridade(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade deve estar entre 1 e 5.");
        }
    }

    public static void main(String[] args) {
        try {
            Tarefa2 minhaTarefa = new Tarefa2(3);
            System.out.println("Prioridade da tarefa: " + minhaTarefa.getPrioridade());
            Tarefa2 tarefaInvalida = new Tarefa2(6); 
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
