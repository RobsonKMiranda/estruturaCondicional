import java.util.Scanner;
/*
    Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
Exemplos:
Entrada:
12
Saída:
PAR
Entrada:
-27
Saída:
IMPAR
Entrada:
0
Saída:
PAR
 */
public class Exe02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }
        sc.close();
    }
}
