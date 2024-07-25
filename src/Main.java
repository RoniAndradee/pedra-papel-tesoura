import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while(true) {
            String[] rps = {"pedra", "papel", "tesoura"};
            String computerMove = rps[new Random().nextInt(rps.length)];

            String playerMove;

            while(true) {
                System.out.println("Por favor faça sua jogada (pedra, papel ou tesoura)");
                playerMove = scanner.nextLine();

                if(playerMove.equals("pedra") || playerMove.equals("papel") || playerMove.equals("tesoura")) {
                    break;
                }
                System.out.println("'" + playerMove + "'" + " não é uma jogada válida!");
            }

            System.out.println("Jogada do computador: " + computerMove);

            if(playerMove.equals(computerMove)) {
                System.out.println("O jogo empatou!");
            } else if(playerMove.equals("pedra")) {
                if(computerMove.equals("papel")) {
                    System.out.println("Você perdeu!");
                } else if(computerMove.equals("tesoura")) {
                    System.out.println("Você ganhou!");
                }
            }

            else if(playerMove.equals("papel")) {
                if(computerMove.equals("tesoura")) {
                    System.out.println("Você perdeu!");
                } else if(computerMove.equals("pedra")) {
                    System.out.println("Você ganhou!");
                }
            }

            else if(playerMove.equals("tesoura")) {
                if(computerMove.equals("pedra")) {
                    System.out.println("Você perdeu!");
                } else if(computerMove.equals("papel")) {
                    System.out.println("Você ganhou!");
                }
            }

            System.out.println("Deseja jogar novamente? (s/n)");
            String playAgain = scanner.nextLine();

            if(!playAgain.equals("s")) {
                System.out.println("Te aguardo para jogar mais vezes!");
                break;
            }
        }

        scanner.close();
    }
}