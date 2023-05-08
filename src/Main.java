import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int i = 0;
    static Professor professor = new Professor(123, "José");

    public static void main(String[] args) {


        do {
            login(professor);
        } while (true);
    }

    private static void login(Professor professor) {
        do {

            System.out.println("""
                    SEJA BEM VINDO
                                    
                    Insira sua senha:        
                    """);
            if (professor.getSenha() == sc.nextInt()) {
                i = 0;
                menu();
            } else {

                i++;
                System.out.println("Senha incorreta, lhe restam " + (3 - i) + " chances.");
                if (i == 3) {
                    System.exit(0);
                }
            }
        } while (i < 2);
    }

    private static void menu() {
        do {


            System.out.println("""
                    Olá Professor, o que você deseja?
                                    
                    1 - Cadastrar forma
                    2 - Listar formas
                    3 - Logout
                    """);
            switch (sc.nextInt()) {
                case 1:
                    System.out.println("""
                            Qual forma você deseja cadastrar?
                                            
                            1 - Circulo
                            2 - Triângulo
                            3 - Retângulo
                            4 - Quadrado
                                            
                            """);
                    int opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            break;
                        case 2:
                            double[] lado = new double[3];
                            System.out.println("Informe o lado A:");
                            lado[0] = sc.nextInt();
                            System.out.println("Informe o lado B:");
                            lado[1] = sc.nextInt();
                            System.out.println("Informe o lado C:");
                            lado[2] = sc.nextInt();
                            Triangulo novoTriangulo = new Triangulo(lado[0],lado[1],lado[2]);
                            if(novoTriangulo.verificaTriangulo(lado[0],lado[1],lado[2])){
                                System.out.println("Triangulo cadastrado.");
                                Triangulo.triangulos.add(novoTriangulo);
                                System.out.println(Triangulo.triangulos);
                            } else {
                                System.out.println("Esses números não fazem um triangulo válido.");
                            }
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        default:
                            System.out.println("Número inválido.");
                            break;

                    }
                    break;
                case 2:
                    System.out.println("""
                            Qual forma você deseja Listar?
                                            
                            1 - Circulo
                            2 - Triângulo
                            3 - Retângulo
                            4 - Quadrado
                            5 - Todos
                            6 - Voltar ao menu principal    
                            """);
                    opcao = sc.nextInt();
                    switch (opcao) {
                        case 1:
                            break;
                        case 2:
                            break;
                        case 3:
                            break;
                        case 4:
                            break;
                        case 5:
                            break;
                        case 6:

                            break;
                        default:
                            System.out.println("Numero inválido");
                            break;
                    }
                    break;
                case 3:
                    System.out.println("Informe sua senha:");
                    if (professor.getSenha() == sc.nextInt()) {
                        System.exit(0);
                    } else {
                        System.out.println("Senha inválida");
                    }
                    break;
                default:
                    System.out.println("Número  inválido");

            }
        } while (true);
    }
}
