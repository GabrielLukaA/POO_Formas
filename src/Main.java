import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int i = 0;
    static Professor professor = new Professor(123, "Romário");


    public static void main(String[] args) {


        // Formas forma2 = new Quadrado(3); == RUIM
        //Quadrado forma3 = new Quadrado(4);

        // forma2.calculaArea();
        //forma3.calculaArea();

        /*Instanciar um objeto forma geométrica na variável Quadrado
        Quadrado quadrado = (Quadrado) forma2;
         */
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
                            double[] lado = new double[3];
                            System.out.println("Informe o lado A:");
                            lado[0] = sc.nextDouble();
                            System.out.println("Informe o lado B:");
                            lado[1] = sc.nextDouble();
                            System.out.println("Informe o lado C:");
                            lado[2] = sc.nextDouble();
                            //Triangulo novoTriangulo = new Triangulo(lado[0], lado[1], lado[2]);
                            if (Triangulo.verificaTriangulo(lado[0], lado[1], lado[2])) {
                                /*Vou instanciar um objeto que será um dos 3 tipos de triangulo
                                  numa "variavel" triangulo, então não é um objeto instanciado
                                 */
                                Triangulo triangulo = Triangulo.tipoTriangulo(lado[0], lado[1], lado[2]);
                                Formas.adicionarForma(triangulo);
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
                    switch (opcao) {
                        case 1:
                            Formas.mostrarCirculos();
                            break;
                        case 2:
                            Formas.mostrarTriangulos();
                            break;
                        case 3:
                            Formas.mostrarRetangulos();
                            break;
                        case 4:
                            Formas.mostrarQuadrados();
                            break;
                        case 5:
                            Formas.mostrarTodos();
                            break;
                        case 6:
                            System.out.println("Voltando...\n");
                            break;
                        default:
                            System.out.println("Numero inválido");
                            break;
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
