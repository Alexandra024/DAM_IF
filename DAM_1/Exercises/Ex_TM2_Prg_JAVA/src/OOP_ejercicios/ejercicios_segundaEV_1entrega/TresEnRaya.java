package OOP_ejercicios.ejercicios_segundaEV_1entrega;
public class TresEnRaya {
    
    public static void main(System[] args){
    java.util.Scanner scanner = new java.util.Scanner(System.in);

        char[][] board = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        
        char currentPlayer = 'X';
        boolean gameWon = false;

        while (!gameWon) {
            printBoard(board);
            System.out.println("Player " + currentPlayer + ", enter your move (row and column): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            if (board[row][col] == ' ') {
            board[row][col] = currentPlayer;
            gameWon = checkWin(board, currentPlayer);
            currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
            } else {
            System.out.println("This move is not valid");
            }
        }

        printBoard(board);
        System.out.println("Player " + (currentPlayer == 'X' ? 'O' : 'X') + " wins!");
    }

    public static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
            System.out.print(board[i][j]);
            if (j < 2) System.out.print("|");
            }
            System.out.println();
            if (i < 2) System.out.println("-----");
        }
    }

    public static boolean checkWin(char[][] board, char player) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player) return true;
            if (board[0][i] == player && board[1][i] == player && board[2][i] == player) return true;
        }
        if (board[0][0] == player && board[1][1] == player && board[2][2] == player) return true;
        if (board[0][2] == player && board[1][1] == player && board[2][0] == player) return true;
        return false;
    }
    
}

