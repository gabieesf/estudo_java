import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Main {
    //função
    public static int menu() {

        // comando de saída
        System.out.println("Escolha qual programa você gostaria de iniciar:");
        System.out.println("1. Calculadora simples");
        System.out.println("2. Projete os lados de um triângulo");
        System.out.println("3. Leitor de pensamento");
        System.out.println("4. Contador");
        // comando de entrada
        Scanner teclado = new Scanner(System.in);
        int opc = teclado.nextInt();
        return opc;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //tipos primitivos e manipulação de dados
        String resp;

        //estrutura de repetição
        do {
            //tipos primitivos e manipulação de dados
            int escolha;
            //chamada da função
            escolha = menu();
            //estruturas condicionais
            switch (escolha) {
                case 1:
                    System.out.println("Digite um valor: ");
                    int n = scanner.nextInt();
                    int resto = n % 2;
                    System.out.println("Resto da divisão por 2: " + resto);
                    // classe Math
                    int elev = (int) Math.pow(n, 3);
                    System.out.println("Elevado ao cubo: " + elev);
                    double quad = (int) Math.sqrt(n);
                    System.out.println("Raiz quadrada: " + quad);
                    double cub = Math.cbrt(n);
                    System.out.println("Raiz cúbica: " + cub);
                    double abs = Math.abs(n);
                    System.out.println("Valor absoluto: " + abs);
                break;
                case 2:
                    double l1, l2, l3;
                    boolean eq, es, tri;


                    System.out.print("Digite o primeiro lado: ");
                    l1 = scanner.nextDouble();
                    System.out.print("Digite o segundo lado: ");
                    l2 = scanner.nextDouble();
                    System.out.print("Digite o terceiro lado: ");
                    l3 = scanner.nextDouble();

                    //operadores relacionais e aritiméticos
                    tri = (l1 < l2 + l3) && (l2 < l1 + l3) && (l3 < l1 + l2);
                    System.out.println("Pode formar um triângulo? " + (tri ? "Sim" : "Não"));

                    //operadores lógicos e operadores relacionais
                    if (tri == true) {
                        eq = (l1 == l2) && (l2 == l3);
                        System.out.println("O triângulo é Equilátero? " + (eq ? "Sim" : "Não"));
                        es = (l1 != l2) && (l2 != l3) && (l1 != l3);
                        System.out.println("O triângulo é Escaleno? " + (es ? "Sim" : "Não"));
                    }
                break;
                case 3:
                    Random random = new Random();
                    System.out.println("Vou pensar em um valor entre 1 e 5. Tente adivinhar!");

                    //vetor
                    int v[] =new int[5];
                    int nP = (int) (1 + Math.random() * (5-1));
                    int tentativas = 0;
                    int palpite;


                    do {
                        System.out.print("Digite o seu palpite: ");
                        palpite = scanner.nextInt();
                        System.out.print("Digite a posição (de 0 a 4): ");
                        int posicao = scanner.nextInt();
                        v[posicao] = palpite;
                        tentativas++;


                        if (palpite < nP) {
                            System.out.println("O número pensado é maior. Tente novamente.");
                        } else if (palpite > nP) {
                            System.out.println("O número pensado é menor. Tente novamente.");
                        } else {
                            System.out.println("Você acertou!!!");
                        }

                    } while (palpite != nP);
                        Arrays.sort(v);
                        System.out.print("Os valores do vetor ordenado é: ");
                        for (int valor: v) {
                            System.out.print(valor+ " ");
                    }
                break;
                case 4:
                    System.out.print("Digite o início: ");
                    int i = scanner.nextInt();
                    System.out.print("Digite o fim: ");
                    int vf = scanner.nextInt();
                    System.out.print("Digite o intervalo: ");
                    int passo = scanner.nextInt();
                        if (i<vf){
                            for (int j = i; j <= vf; j += passo) {
                                System.out.println(j);
                            }
                        } else if (i>vf){
                            for (int j = i; j >= vf; j -= passo) {
                                System.out.println(j);
                            }

                        }
                break;
                default:
                    System.out.print("Digite uma opção valida");
            }
        System.out.println(" ");
        System.out.println("Quer continuar? [s/n]");
        resp = scanner.next();
        } while (resp.equals("s"));
    }
}