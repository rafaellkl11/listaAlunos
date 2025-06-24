import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ListaAlunos lista = new ListaAlunos();
        int opcao, numMatricula, contato;
        String nome, curso, data;

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
                System.out.println("Digite o número da matricula: ");
                numMatricula = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Digite o nome do aluno: ");
                nome = teclado.nextLine();
                System.out.println("Digite o número de contato: ");
                contato = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Digite o nome do curso: ");
                curso = teclado.nextLine();
                System.out.println("Digite a data de admissão EX(dd/mm/aaaa): ");
                data = teclado.nextLine();

                /*lista.inserir(new Aluno (numMatricula, nome, contato, curso, admissão));*/
                lista.inserir(new Aluno (numMatricula, nome, contato, curso, data));
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
                System.out.print("Curso: "); String c = teclado.nextLine();
                lista.imprimirPorCurso(c);
            }
            case 6 ->{
                 System.out.print("Matrícula: "); int m = teclado.nextInt();
                    lista.buscarPorMatricula(m);

            }
            case 0 ->{
                System.out.println("Saindo");
                break;
            }
            default ->{
                System.out.println("Essa opção não existe!");
            }
        }
        teclado.close();
    }
}