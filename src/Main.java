import java.util.Scanner;

public class Main {
    private static Scanner sc = new Scanner(System.in);
    private static int i=0;
    public static void main(String[] args) {
        Professor professor = new Professor(123, "José");

do {
login(professor);
} while(true);
    }

    private static void login(Professor professor) {
        do {

            System.out.println("""
                    SEJA BEM VINDO
                                    
                    Insira sua senha:        
                    """);
            if (professor.getSenha() == sc.nextInt()) {
                i=0;
                menu();
            } else {

                i++;
                System.out.println("Senha incorreta, lhe restam "+(3-i)+" chances.");
                if (i==3){
                    System.exit(0);
                }
            }
        }while (i<2);
    }

    private static void menu() {
        System.out.println("""
                Olá Professor, o que você deseja?
                
                1 - Cadastrar forma
                2 - Listar formas

                """);
switch (sc.nextInt()){
    case 1:
        System.out.println("""
                Qual forma você deseja cadastrar?
                
                1 - Circulo
                2 - Triângulo
                3 - Retângulo
                4 - Quadrado
                
                """);
        int opcao = sc.nextInt();
        break;
    case 2:
        break;
}
    }
}
