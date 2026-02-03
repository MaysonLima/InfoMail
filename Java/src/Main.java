import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome:");
        String nome = scanner.nextLine();

        System.out.println("Digite a sua cidade:");
        String cidade = scanner.nextLine();

        System.out.println("Digite o seu E-mail:");
        String email = scanner.nextLine();

        Usuario usuario = new Usuario(nome,cidade,email);

        System.out.println(usuario.resumo());
        scanner.close();
    }
}