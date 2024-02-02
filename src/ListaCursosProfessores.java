import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCursosProfessores {

    /*------------------------------------------- FUNÇÕES -------------------------------------------*/
    public static void verCursos(List<String> listaCursos) {
        if (listaCursos.isEmpty()) {
            System.out.println("A lista está vazia, insira o número 3 no menu para adicionar um curso.");
        } else {
            for (int i = 0; i < listaCursos.size(); i++) {
                System.out.println(i + " - " + listaCursos.get(i));
            }
        }
    }

    public static void verProfessores(List<String> listaProfessores) {
        if (listaProfessores.isEmpty()) {
            System.out.println("A lista está vazia, insira o número 4 no menu para adicionar um professor.");
        } else {
            for (int i = 0; i < listaProfessores.size(); i++) {
                System.out.println(i + " - " + listaProfessores.get(i));
            }
        }
    }

    public static void addCurso(Scanner entrada, List<String> listaCursos) {
        System.out.print("Digite o curso a ser adicionado: ");
        String curso = entrada.next();
        listaCursos.add(curso);
    }

    public static void addProfessor(Scanner entrada, List<String> listaProfessores) {
        System.out.print("Digite o professor a ser adicionado: ");
        String professor = entrada.next();
        listaProfessores.add(professor);
    }

    public static List<String> iniciarListaCursos() {
        System.out.println("Bem vindo a lista de Cursos e Professores!");
        List<String> listaCursos = new ArrayList<>();
        return listaCursos;
    }

    public static List<String> iniciarListaProfessores() {
        System.out.println("Bem vindo a lista de Cursos e Professores!");
        List<String> listaProfessores = new ArrayList<>();
        return listaProfessores;
    }


    /*------------------------------------------- EXECUÇÃO MAIN -------------------------------------------*/
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("Bem vindo a lista de Cursos e Professores!");

        List<String> listaCursos = iniciarListaCursos();
        List<String> listaProfessores = iniciarListaProfessores();


        do {
            System.out.println("\n");
            System.out.println("+----------------+");
            System.out.println("|------MENU------|");
            System.out.println("|----------------|");
            System.out.println("| 1 - Ver Cursos |");
            System.out.println("| 2 - Ver Prof.  |");
            System.out.println("| 3 - ADD Curso  |");
            System.out.println("| 4 - ADD Prof.  |");
            System.out.println("|----------------|");
            System.out.println("| 0 -   Sair     |");
            System.out.println("+----------------+");
            System.out.println("\n");

            System.out.print("Insira a função desejada: ");
            int escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    verCursos(listaCursos);
                    break;

                case 2:
                    verProfessores(listaProfessores);
                    break;

                case 3:
                    addCurso(entrada, listaCursos);
                    break;

                case 4:
                    addProfessor(entrada, listaProfessores);
                    break;

                case 0:
                    System.out.println("Lista de Cursos: ");
                    verCursos(listaCursos);
                    System.out.println("\n");
                    System.out.println("Lista de Professores : ");
                    verProfessores(listaProfessores);
                    System.exit(0);

                default:
                    System.out.println("Código inválido");
                    break;

            }
        } while (true);


    }
}
