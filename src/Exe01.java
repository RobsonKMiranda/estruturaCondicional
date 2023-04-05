import java.util.Scanner;
/*
    Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Exemplos:
Entrada:
-10
Saída:
NEGATIVO
Entrada:
8
Saída:
NAO NEGATIVO
Entrada:
0
Saída:
NAO NEGATIVO
 */
public class Exe01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N < 0) {
            System.out.println("Negativo");
        } else {
            System.out.println("Não negativo");
        }
        sc.close();
    }
}
