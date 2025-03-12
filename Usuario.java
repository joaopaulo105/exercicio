class Usuario {
    @SuppressWarnings("unused")
    private String nome;
    @SuppressWarnings("unused")
    private String matricula;
    @SuppressWarnings("unused")
    private String turma;

    public Usuario(String nome, String matricula, String turma) {
        this.nome = nome;
        this.matricula = matricula;
        this.turma = turma;
    }

    // Getters e Setters
}

class Aluno extends Usuario {
    @SuppressWarnings("unused")
    private int pontosGamificacao;
    @SuppressWarnings("unused")
    private double mediaNotas;

    public Aluno(String nome, String matricula, String turma) {
        super(nome, matricula, turma);
        this.pontosGamificacao = 0;
        this.mediaNotas = 0.0;
    }

    // Métodos para manipular pontos e notas
}

class Professor extends Usuario {
    public Professor(String nome, String matricula, String turma) {
        super(nome, matricula, turma);
    }

    // Métodos para cadastro de alunos, atribuição de pontos, etc.
}

class Login {
    // Método para realizar login
    public void realizarLogin(String matricula, String senha) {
        // Validação de login
    }
}
