import java.util.Scanner;

public class main{
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
                lista.inserir(new Aluno (numMatricula, nome, contato,curso, data));
            }
            case 2 ->{

            }
            case 3 ->{

            }
            case 4 ->{

            }
            case 5 ->{

            }
            case 6 ->{

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