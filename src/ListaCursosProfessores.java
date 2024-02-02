import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaCursosProfessores {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Bem vindo a lista de Cursos e Professores");

        List<String> listaCurso = new ArrayList<>();
        List<String> listaProf = new ArrayList<>();

        do {
            System.out.println("1 - Adicionar Curso");
            System.out.println("2 - Adicionar Professor");
            System.out.print("\n");
            System.out.println("0 - Sair");
            System.out.print("\n");
            System.out.print("Informe o número: ");

            int escolha = entrada.nextInt();

            switch (escolha) {

                case 1:
                    System.out.print("Informe o curso: ");
                    String curso = entrada.next();
                    System.out.print("\n");
                    listaCurso.add(curso);
                    break;

                case 2:
                    System.out.print("Informe o professor: ");
                    String prof = entrada.next();
                    System.out.print("\n");
                    listaProf.add(prof);
                    break;

                case 0:
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
