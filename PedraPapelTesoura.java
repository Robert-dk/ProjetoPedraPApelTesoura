/*
Neste projeto, o usuario e o computador escolhem entre pedra, papel ou tesoura. Sabendo que pedra ganha de tesoura, papel ganha de pedra e tesoura ganha de papel, exiba na tela o ganhador: usuario ou computador.
*/
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        // Opções do jogo
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};

        // Entrada do jogador
        Scanner scanner = new Scanner(System.in);

        System.out.println("----------------");        
        System.out.println("| BEM VINDO!!! |");       
        System.out.println("----------------\n");
        System.out.println("Escolha uma opção: ");
        System.out.println("0 - Pedra, 1 - Papel, 2 - Tesoura");
        int escolhaJogador = scanner.nextInt();
        scanner.close();

        // Escolha do pc
        int escolhaComputador = (int) (Math.random() * 3);

        // Exibir escolhas
        System.out.println("\nvocê escolheu: " + opcoes[escolhaJogador]);
        System.out.println("o pc escolheu: " + opcoes[escolhaComputador]);

        // Verificar vencedor
        if (escolhaJogador == escolhaComputador) {
            System.out.println("empate!");
        } else if ((escolhaJogador == 0 && escolhaComputador == 2) || (escolhaJogador == 1 && escolhaComputador == 0) || (escolhaJogador == 2 && escolhaComputador == 1)) {
            System.out.println("você venceu!");
        } else {
            System.out.println("você perdeu!");
        }
    }
}
