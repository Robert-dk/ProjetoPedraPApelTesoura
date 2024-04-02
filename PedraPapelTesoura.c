/*
Neste projeto, o usuario e o computador escolhem entre pedra, papel ou tesoura. Sabendo que pedra ganha de tesoura, papel ganha de pedra e tesoura ganha de papel, exiba na tela o ganhador: usuario ou computador.
*/
#include <stdio.h>

int main() {
    // Opções do jogo
    char *opcoes[] = {"Pedra", "Papel", "Tesoura"};

    // Entrada do jogador
    printf("----------------\n");
    printf("| BEM VINDO!!! |\n");
    printf("----------------\n\n");
    printf("Escolha uma opção: \n");
    printf("0 - Pedra, 1 - Papel, 2 - Tesoura\n");
    int escolhaJogador;
    scanf("%d", &escolhaJogador);

    // Escolha do pc
    srand(time(NULL));
    int escolhaComputador = rand() % 3;

    // Exibir escolhas
    printf("\nVocê escolheu: %s\n", opcoes[escolhaJogador]);
    printf("O computador escolheu: %s\n", opcoes[escolhaComputador]);

    // Verificar vencedor
    if (escolhaJogador == escolhaComputador) {
        printf("Empate!\n");
    } else if ((escolhaJogador == 0 && escolhaComputador == 2) || (escolhaJogador == 1 && escolhaComputador == 0) || (escolhaJogador == 2 && escolhaComputador == 1)) {
        printf("Você venceu!\n");
    } else {
        printf("Você perdeu!\n");
    }

    return 0;
}
