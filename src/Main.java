import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int i = 0;
    static Professor professor = new Professor(123, "Romário.");

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
                            System.out.println("Informe o raio do circulo: ");
                            Circulo novoCirculo = new Circulo(sc.nextDouble());
                            if (novoCirculo.verificaCirculo()) {
                                System.out.println("Circulo cadastrado.");
                                Circulo.setCirculos(novoCirculo);
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
                            Triangulo novoTriangulo = new Triangulo(lado[0], lado[1], lado[2]);
                            if (novoTriangulo.verificaTriangulo()) {
                                String tipo = Triangulo.tipoTriangulo(lado[0], lado[1], lado[2]);
                                if (tipo == "Equilátero") {
                                    Equilatero novoEquilatero = new Equilatero(lado[0], lado[1], lado[2]);
                                    Equilatero.setEquilateros(novoEquilatero);
                                } else if (tipo == "Isósceles") {
                                    Isosceles novoIsosceles = new Isosceles(lado[0], lado[1], lado[2]);
                                    Isosceles.setIsosceles(novoIsosceles);
                                } else {
                                    Escaleno novoEscaleno = new Escaleno(lado[0], lado[1], lado[2]);
                                    Escaleno.setEscaleno(novoEscaleno);
                                }
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
                            Retangulo novoRetangulo = new Retangulo(ladoA, ladoB);
                            if (novoRetangulo.verificaRetangulo()) {
                                System.out.println("Retângulo cadastrado.");
                                Retangulo.setRetangulos(novoRetangulo);
                            } else {
                                System.out.println("Esses números não formam um retângulo válido.");
                            }
                            break;
                        case 4:
                            System.out.println("Informe o lado do quadrado: ");
                            Quadrado novoQuadrado = new Quadrado(sc.nextDouble());
                            if (novoQuadrado.verificaQuadrado()) {
                                System.out.println("Quadrado cadastrado.");
                                Quadrado.setQuadrados(novoQuadrado);
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
                            System.out.println(Circulo.getCirculos());
                            break;
                        case 2:
                            System.out.println(Equilatero.getEquilateros());
                            System.out.println(Isosceles.getIsosceles());
                            System.out.println(Escaleno.getEscalenos());
                            break;
                        case 3:
                            System.out.println(Retangulo.getRetangulos());
                            break;
                        case 4:
                            System.out.println(Quadrado.getQuadrados());
                            break;
                        case 5:
                            mostrarLista();

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

    private static void mostrarLista() {
        Formas.lista.add(Quadrado.getQuadrados());
        Formas.lista.add(Circulo.getCirculos());
        Formas.lista.add(Retangulo.getRetangulos());
        Formas.lista.add(Isosceles.getIsosceles());
        Formas.lista.add(Escaleno.getEscalenos());
        Formas.lista.add(Equilatero.getEquilateros());
        System.out.println(Formas.lista);
        Formas.lista.remove(Quadrado.getQuadrados());
        Formas.lista.remove(Circulo.getCirculos());
        Formas.lista.remove(Retangulo.getRetangulos());
        Formas.lista.remove(Isosceles.getIsosceles());
        Formas.lista.remove(Escaleno.getEscalenos());
        Formas.lista.remove(Equilatero.getEquilateros());
    }
}
