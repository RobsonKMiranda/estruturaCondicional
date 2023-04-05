import java.util.Scanner;
/*
    Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
Exemplos:
Entrada:
16 2 O
Saída:
JOGO DUROU 10 HORA(S)
Entrada:
0 0 O
Saída:
JOGO DUROU 24 HORA(S)
Entrada:
2 16 O
Saída:
JOGO DUROU 14 HORA(S)
 */
public class Exe04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int horaInicial = sc.nextInt();
        int horaFinal = sc.nextInt();
        int duracao;
        if (horaInicial < horaFinal) {
            duracao = horaFinal -  horaInicial;
        } else {
            duracao = 24 - horaInicial + horaFinal;
        }
        System.out.println("O jogo durou: " + duracao + "HORA(S)");
        sc.close();
    }
}
