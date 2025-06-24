
public class Aluno {
    private int matricula;
    private String nome;
    private String contato;
    private String curso;
    private String data;

    public Aluno(int matricula, String nome, String contato, String curso, String data) {
        this.matricula = matricula;
        this.nome = nome;
        this.contato = contato;
        this.curso = curso;
        this.data = data;
    }

    public int getMatricula() { return matricula; }
    public String getNome() { return nome; }
    public String getContato() { return contato; }
    public String getCurso() { return curso; }
    public String getData() { return data; }

    public void setContato(String contato) { this.contato = contato; }

    @Override
    public String toString() {
        return "Matrícula: " + matricula + ", Nome: " + nome + ", Contato: " + contato +
               ", Curso: " + curso + ", Data admissão: " + data;
    }
}
