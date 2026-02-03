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

        System.out.println("Selecione o seu interesse em notícias:");
        System.out.println("1- TECNOLOGIA");
        System.out.println("2- RELIGIAO");
        System.out.println("3- FINANCAS");
        System.out.println("4- ESPORTE");
        System.out.println("5- POLITICA");

        Usuario usuario = new Usuario(nome,cidade,email);

        int opcao = Integer.parseInt(scanner.nextLine());



        switch (opcao){
            case 1: usuario.adicionarInteresse(Categoria.TECNOLOGIA);
            break;
            case 2: usuario.adicionarInteresse(Categoria.RELIGIAO);
            break;
            case 3: usuario.adicionarInteresse(Categoria.FINANCAS);
            break;
            case 4: usuario.adicionarInteresse(Categoria.ESPORTE);
            break;
            case 5: usuario.adicionarInteresse(Categoria.POLITICA);
            default:
                System.out.println("Essa opção não é valida!");

        }





        System.out.println(usuario.resumo());
        scanner.close();
    }
}