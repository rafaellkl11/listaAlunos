import java.util.Scanner;

public class Pricipal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaAlunos lista = new ListaAlunos();
        int opcao = 1;

        while (opcao != 0) {
            System.out.println("=====Menu=====");
            System.out.println("1. Novo aluno");
            System.out.println("2. Alterar contato");
            System.out.println("3. Remover aluno");
            System.out.println("4. Listar todos os alnos");
            System.out.println("5. Listar por curso");
            System.out.println("6. Buscar matricula");
            System.out.println("0. Sair");
            System.out.print("Digite a opção: ");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1 ->{
                    System.out.print("Digite o número da matricula: ");
                        int numMatricula = teclado.nextInt();
                        teclado.nextLine();
                        System.out.print("Digite o nome do aluno: ");
                        String nome = teclado.nextLine();
                        System.out.print("Digite o número de contato: ");
                        String contato = teclado.nextLine();
                        System.out.print("Digite o nome do curso: ");
                        String curso = teclado.nextLine();
                        System.out.print("Digite a data de admissão EX(dd/mm/aaaa): ");
                        String data = teclado.nextLine();

                        lista.inserir(new Aluno(numMatricula, nome, contato, curso, data));
                    }
                case 2 ->{
                    System.out.print("Matrícula do aluno: "); int m = teclado.nextInt(); teclado.nextLine();
                    System.out.print("Novo contato: "); String novo = teclado.nextLine();
                    if (lista.alterarContato(m, novo)) {
                        System.out.println("Contato atualizado com sucesso.");
                    } else {
                        System.out.println("Aluno não encontrado.");
                    }
                }
                case 3 ->{
                    System.out.print("Matricula a remover: ");
                    int matricula = teclado.nextInt();
                    if (lista.remover(matricula)){
                        System.out.println("Aluno removido");
                    }
                    else{
                        System.out.println("Aluno não encontrado");
                    }
                }
                case 4 -> lista.imprimirTodos();
                case 5 ->{
                    System.out.print("Curso: "); 
                    teclado.nextLine();
                    String curs = teclado.nextLine();
                    lista.imprimirPorCurso(curs);
                }
                case 6 ->{
                    System.out.print("Matrícula: "); int m = teclado.nextInt();
                        lista.buscarPorMatricula(m);

                }
                case 0 ->{
                    System.out.println("Saindo...");
                    break;
                }
                default ->{
                    System.out.println("Essa opção não existe!");
                }
            }
        }
        teclado.close();
    }
}