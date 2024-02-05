import java.util.ArrayList;
import java.util.Scanner;

public class ListaCursosProfessores {
    /*------------------ FUNCÕES ------------------*/

    //Função para listar os cursos
    public static void listarCursos(ArrayList<String> listaCurso) {
        if (listaCurso.isEmpty()) {
            System.out.println("A lista de cursos está vazia.");
        } else {
            for (int i = 0; i < listaCurso.size(); i++) {
                System.out.println(i + " - " + listaCurso.get(i));
            }
        }
    }

    //Função para listar os professores
    public static void listarProf(ArrayList<String> listaProf) {
        if (listaProf.isEmpty()) {
            System.out.println("A lista de professores está vazia.");
        } else {
            for (int i = 0; i < listaProf.size(); i++) {
                System.out.println(i + " - " + listaProf.get(i));
            }
        }
    }

    //Função para adicionar um curso
    public static void addCurso(Scanner entrada, ArrayList<String> listaCurso) {
        System.out.print("Informe o curso: ");
        String curso = entrada.next();
        listaCurso.add(curso);
    }

    //Função para adicionar um professor
    public static void addProf(Scanner entrada, ArrayList<String> listaProf) {
        System.out.print("Informe o curso: ");
        String prof = entrada.next();
        listaProf.add(prof);
    }

    //Função para adicionar ou um curso ou um professor
    public static void escolhaAdd(Scanner entrada, ArrayList<String> listaCurso, ArrayList<String> listaProf) {
        System.out.println("+---------- ADICIONAR -----------+");
        System.out.println("|   1 - Curso                    |");
        System.out.println("|   2 - Professor                |");
        System.out.println("+--------------------------------+");
        System.out.print("Informe o número: ");

        int escolha = entrada.nextInt();

        switch (escolha) {
            case 1:
                addCurso(entrada, listaCurso);
                break;
            case 2:
                addProf(entrada, listaProf);
                break;
            default:
                System.out.println("Opção inválida.");
                System.out.print("\n");
                escolhaAdd(entrada, listaCurso, listaProf);
                break;
        }
    }

    /*--------------------- EXECUÇÃO --------------------- */
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo a lista de Cursos e Professores");

        ArrayList<String> listaCurso = new ArrayList<>();
        ArrayList<String> listaProf = new ArrayList<>();

        do {
            System.out.println("+------------- MENU -------------+");
            System.out.println("|   1 - Adicionar                |");
            System.out.println("+--------------------------------+");
            System.out.println("|   0 - Sair                     |");
            System.out.println("+--------------------------------+");
            System.out.print("Informe o número: ");

            int escolha = entrada.nextInt();

            System.out.print("\n");

            switch (escolha) {

                case 1:
                    escolhaAdd(entrada, listaCurso, listaProf);
                    System.out.print("\n");
                    break;

                case 0:
                    System.out.println("lISTA DE CURSOS: ");
                    listarCursos(listaCurso);
                    System.out.print("\n");
                    System.out.println("lISTA DE PROFESSORES: ");
                    listarProf(listaProf);
                    System.out.print("\n");
                    System.out.print("Finalizando o programa.");
                    System.exit(0);

                default:
                    System.out.println("Opção inválida.");
                    System.out.print("\n");
                    break;
            }
        } while (true);


    }
}
