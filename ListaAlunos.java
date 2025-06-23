public class ListaAlunos{
    private Aluno primeiro;
    public ListaAlunos(){
        primeiro = null;
    }
    public boolean vazia(){
        return primeiro == null;
    }
    public void inserir(Aluno aluno){
        Aluno nova = new Aluno(aluno);
        nova.prox = primeiro;
        primeiro = nova;
    }

    public void imprimir(){
        Aluno aux = primeiro;
        while(aux != null){
            System.out.println(aux.valor);
            aux = aux.prox;
        }
    }
    public Aluno pesquisar(int elemento){
        return null;
    }
    public void removerInicio(){

    }
}