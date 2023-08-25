import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);

    static Professor professor = new Professor(123, "Romário");

    public static void main(String[] args) {

        do {
            login(professor);
        } while (true);
    }

    private static void login(Professor professor) {
        int i = 0;
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
                if (i == 3) {
                    System.out.println("Acabaram as chances.");
                    System.exit(0);
                }
                System.out.println("Senha incorreta, lhe restam " + (3 - i) + " chances.");
            }
        } while (i < 3);
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
                            System.out.println("Informe o raio do circulo: ");
                            double raio = sc.nextDouble();

                            if (raio > 0) {
                                new Circulo(raio);
                                System.out.println("Circulo cadastrado.");
                            } else {
                                System.out.println("O raio é inferior ou igual a 0.");
                            }
                            break;

                        case 2:
                            double[] lados = new double[3];
                            System.out.println("Informe o lado A:");
                            lados[0] = sc.nextDouble();
                            System.out.println("Informe o lado B:");
                            lados[1] = sc.nextDouble();
                            System.out.println("Informe o lado C:");
                            lados[2] = sc.nextDouble();
                            //Triangulo novoTriangulo = new Triangulo(lados[0], lados[1], lados[2]);
                            if (Triangulo.verificaTriangulo(lados[0], lados[1], lados[2])) {
                                /*Vou instanciar um objeto que será um dos 3 tipos de triangulo
                                  numa "variavel" triangulo, então não é um objeto instanciado
                                 */
                                Triangulo triangulo = Triangulo.tipoTriangulo(lados[0], lados[1], lados[2]);
                                System.out.println("Triângulo cadastrado.");
                            } else {
                                System.out.println("Esses números não formam um triângulo válido.");
                            }
                            break;

                        case 3:
                            System.out.println("Informe o lado A: ");
                            double ladoA = sc.nextDouble();
                            System.out.println("Informe o lado B: ");
                            double ladoB = sc.nextDouble();
                            if (ladoA > 0 && ladoB > 0) {
                                new Retangulo(ladoA, ladoB);
                                System.out.println("Retângulo cadastrado.");
                            } else {
                                System.out.println("Esses números não formam um retângulo válido.");
                            }
                            break;

                        case 4:
                            System.out.println("Informe o lado do quadrado: ");
                            double ladoQuadrado = sc.nextDouble();
                            if (ladoQuadrado > 0) {
                                new Quadrado(ladoQuadrado);
                                System.out.println("Quadrado cadastrado.");
                            } else {
                                System.out.println("Esse número não forma um quadrado válido.");
                            }
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

                    if (opcao > 6 || opcao < 0) {
                        System.out.println("Número inválido.\n");
                    } else {
                        switch (opcao) {
                            case 5 -> System.out.println(Formas.mostrarObjetos());
                            case 6 -> System.out.println("Voltando...\n");
                            default -> {
                                System.out.println(Formas.mostrarObjetosFiltrados(opcao));
                            }
                        }
                    }
                    break;

                case 3:
                    System.out.println("Informe sua senha: ");
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
