public class ListaAlunos {
    private class Node {
        Aluno aluno;
        Node next;
        Node(Aluno aluno) { this.aluno = aluno; }
    }

    private Node head;

    public void inserir(Aluno aluno) {
        Node novo = new Node(aluno);
        if (head == null) {
            head = novo;
            head.next = head;
        } else {
            Node temp = head;
            while (temp.next != head) temp = temp.next;
            temp.next = novo;
            novo.next = head;
        }
    }

    public boolean alterarContato(int matricula, String novoContato) {
        Node temp = head;
        if (temp == null) return false;
        do {
            if (temp.aluno.getMatricula() == matricula) {
                temp.aluno.setContato(novoContato);
                return true;
            }
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public boolean remover(int matricula) {
        if (head == null) return false;
        Node temp = head, prev = null;
        do {
            if (temp.aluno.getMatricula() == matricula) {
                if (prev != null) prev.next = temp.next;
                else { // Removendo a cabeça
                    Node last = head;
                    while (last.next != head) last = last.next;
                    if (head.next == head) head = null;
                    else {
                        last.next = head.next;
                        head = head.next;
                    }
                }
                return true;
            }
            prev = temp;
            temp = temp.next;
        } while (temp != head);
        return false;
    }

    public void imprimirTodos() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Lista vazia.");
            return;
        }
        do {
            System.out.println(temp.aluno);
            temp = temp.next;
        } while (temp != head);
    }

    public void imprimirPorCurso(String curso) {
        Node temp = head;
        boolean found = false;
        if (temp != null) {
            do {
                if (temp.aluno.getCurso().equalsIgnoreCase(curso)) {
                    System.out.println(temp.aluno);
                    found = true;
                }
                temp = temp.next;
            } while (temp != head);
        }
        if (!found) System.out.println("Nenhum aluno do curso " + curso);
    }

    public void buscarPorMatricula(int matricula) {
        Node temp = head;
        if (temp == null) {
            System.out.println("Lista vazia.");
            return;
        }
        do {
            if (temp.aluno.getMatricula() == matricula) {
                System.out.println(temp.aluno);
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Aluno não encontrado.");
    }
}