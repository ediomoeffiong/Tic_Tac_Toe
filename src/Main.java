import java.util.Scanner;

public class Main {
    static String[][] var = new String[3][3];

    public Main() {
        var[0][0] = "1";
        var[0][1] = "2";
        var[0][2] = "3";
        var[1][0] = "4";
        var[1][1] = "5";
        var[1][2] = "6";
        var[2][0] = "7";
        var[2][1] = "8";
        var[2][2] = "9";
    }

    public static void checkWinX() {
        if (var[0][0].equals("X") && var[1][1].equals("X") && var[2][2].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[0][0].equals("X") && var[1][0].equals("X") && var[2][0].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[0][0].equals("X") && var[0][1].equals("X") && var[0][2].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[0][1].equals("X") && var[1][1].equals("X") && var[2][1].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[0][2].equals("X") && var[1][2].equals("X") && var[2][2].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[1][0].equals("X") && var[1][1].equals("X") && var[1][2].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[2][0].equals("X") && var[2][1].equals("X") && var[2][2].equals("X")) {
            System.out.println("Player X Wins");
        } else if (var[0][2].equals("X") && var[1][1].equals("X") && var[2][0].equals("X")) {
            System.out.println("Player X Wins");
        }
    }

    public static void checkWinY() {
        if (var[0][0].equals("Y") && var[1][1].equals("Y") && var[2][2].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[0][0].equals("Y") && var[1][0].equals("Y") && var[2][0].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[0][0].equals("Y") && var[0][1].equals("Y") && var[0][2].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[0][1].equals("Y") && var[1][1].equals("Y") && var[2][1].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[0][2].equals("Y") && var[1][2].equals("Y") && var[2][2].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[1][0].equals("Y") && var[1][1].equals("Y") && var[1][2].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[2][0].equals("Y") && var[2][1].equals("Y") && var[2][2].equals("Y")) {
            System.out.println("Player Y Wins");
        } else if (var[0][2].equals("Y") && var[1][1].equals("Y") && var[2][0].equals("Y")) {
            System.out.println("Player Y Wins");
        }
    }

    public static void main(String[] args) {
        Main main = new Main();
        System.out.println("------------------Tic Tac Toe------------------");


        for (int i = 0; i < var.length; i++) {
            for (int j = 0; j < var[i].length; j++) {
                System.out.print(var[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nPlayer 1 Choose X or O: ");
        Scanner player1s = new Scanner(System.in);
        String player1 = player1s.nextLine();
        String player2 = "O";

        if (player1.equals("X") || player1.equals("x")) {
            player2 = "O";
            player1 = "X";
        } else if (player1.equals("O") || player1.equals("o")) {
            player2 = "X";
            player1 = "O";
        }

        System.out.println("Player 1 is " + player1 + " and Player 2 is " + player2);
        System.out.println("Player 1 plays first");
        String play;


        for (int k = 0; k < 9; k++) {
            Scanner scanPlay = new Scanner(System.in);
            play = scanPlay.nextLine();

            if (k % 2 == 0) {
                if (play.equals("1")) {
                    var[0][0] = "X";
                } else if (play.equals("2")) {
                    var[0][1] = "X";
                } else if (play.equals("3")) {
                    var[0][2] = "X";
                } else if (play.equals("4")) {
                    var[1][0] = "X";
                } else if (play.equals("5")) {
                    var[1][1] = "X";
                } else if (play.equals("6")) {
                    var[1][2] = "X";
                } else if (play.equals("7")) {
                    var[2][0] = "X";
                } else if (play.equals("8")) {
                    var[2][1] = "X";
                } else if (play.equals("9")) {
                    var[2][2] = "X";
                } else {
                    System.out.println("You are trying to cheat! Game restarts..");
                    String[] call = {"call"};
                    Main.main(call);
                }
            }

            if (k % 2 != 0) {
                if(play.equals("1")) {
                    var[0][0] = "O";
                } else if (play.equals("2")) {
                    var[0][1] = "O";
                } else if (play.equals("3")) {
                    var[0][2] = "O";
                } else if (play.equals("4")) {
                    var[1][0] = "O";
                } else if (play.equals("5")) {
                    var[1][1] = "O";
                } else if (play.equals("6")) {
                    var[1][2] = "O";
                } else if (play.equals("7")) {
                    var[2][0] = "O";
                } else if (play.equals("8")) {
                    var[2][1] = "O";
                } else if (play.equals("9")) {
                    var[2][2] = "O";
                }
            }

            System.out.println("\n\n");
            for (int i = 0; i < var.length; i++) {
                for (int j = 0; j < var[i].length; j++) {
                    System.out.print(var[i][j] + " ");
                }
                System.out.println();
            }
            checkWinX();
            checkWinY();
        }

        System.out.println("Do you want to play again(Y/N)");
        Scanner playAgainS = new Scanner(System.in);
        String playAgain = playAgainS.nextLine();

        if (playAgain.equals("Y") || playAgain.equals("y")) {
            System.out.println("\n\n\n\n\n");
            String[] call = {"call"};
            Main.main(call);
        } else {
            System.out.println("Goodbye!");
        }
    }
}