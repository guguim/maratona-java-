package academy.devdojo.maratonajava.javacore.Gassociacao.uexercicio.dominio;


public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public void imprime() {
        System.out.println("=======================================");
        System.out.println("Professor: " + this.nome);
        if (seminarios == null) return;
        System.out.println("## Seminarios cadastrados ##");
        for (Seminario seminario : seminarios) {
            System.out.println(seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println("## Alunos ##");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println("Aluno: " + aluno.getNome() + " Idade: " + aluno.getIdade());
            }

        }
        System.out.println("=======================================+");

    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
