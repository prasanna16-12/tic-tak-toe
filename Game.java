import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter name of player one : ");
        String p1 = input.nextLine();
        System.out.print("enter name of player two : ");
        String p2 = input.nextLine();
        TicTacToe game = new TicTacToe(p1,p2);
        game.StartGame();
        input.close();
    }
    
}


class TicTacToe{
    private String playerOne;
    private String playerTwo;
    private String player;
    private int counter;
    private char[] OX= {'-','-','-','-','-','-','-','-','-'};
    public TicTacToe(String Name_1,String Name_2){
        playerOne = Name_1;
        playerTwo = Name_2;
        player = playerOne;
        counter = 0;
        }
    public void StartGame(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------Game is started-------");
        System.out.print(" 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9 \n");
        System.out.println("BOARD DOWN HERE");
        String board = String.format(" %c | %c | %c \n-----------\n %c | %c | %c \n-----------\n %c | %c | %c \n",
         OX[0],OX[1],OX[2],OX[3],OX[4],OX[5],OX[6],OX[7],OX[8]);
        System.out.println(board);
        boolean status = true;
        while(status){
            System.out.print("enter postion " + player + " : " );
            int pos = input.nextInt();
            if(player.equals(playerOne)){
                if(pos > 0 && pos <= 9){
                    if(OX[pos-1] != '-' ){
                        System.out.println("it's already ! taken \n try something else");
                    }
                    else{
                        OX[pos-1] = 'O';
                        toggle_player();
                        counter++;
                    }
                }
                else{
                    System.out.println("out of range");
                }
            }
            else{
                
                if(pos > 0 && pos <= 9){
                    if(OX[pos-1] != '-'){
                        System.out.println("it's already ! taken \n try something else");
                    }
                    else{
                        OX[pos-1] = 'X';
                        toggle_player();
                        counter++;
    
                    }
                }
                else{
                    System.out.println("out of range");
                }
            }
            System.out.print(" 1 | 2 | 3 \n-----------\n 4 | 5 | 6 \n-----------\n 7 | 8 | 9 \n\n");
            board = String.format(" %c | %c | %c \n-----------\n %c | %c | %c \n-----------\n %c | %c | %c \n", 
            OX[0],OX[1],OX[2],OX[3],OX[4],OX[5],OX[6],OX[7],OX[8]);
            System.out.println(board);
            char win = CheackWinner();
            if(win != '-'){
                if(win == 'X'){
                    System.out.println("awsome ! @" + playerTwo +" is winner\n\n");
                }
                else{
                    System.out.println("awsome ! @" + playerOne +" is winner\n\n");
                }
                status = false;
            }
            if(counter == 9){
                System.out.println("it's draw\n\n");
                status = false;
            }
            
            
        }
        input.close();
    }
    private void toggle_player(){
        if(player == playerOne){
            player = playerTwo;
        }
        else{
            player = playerOne; 
        }
    }
    private char CheackWinner(){
        if(OX[0] == OX[1] && OX[1] == OX[2] && OX[0] != '-'){
            return OX[0];
        }
        else{
            if(OX[0] == OX[3] && OX[3] == OX[6] && OX[0] != '-'){
                return OX[0];
            }
            else{
                if(OX[6] == OX[7] && OX[7] == OX[8] && OX[6] != '-'){
                    return OX[6];
                }
                else{
                    if(OX[2] == OX[5] && OX[5] == OX[8] && OX[2] != '-'){
                        return OX[2];
                    }
                    else{
                        if(OX[0] == OX[4] && OX[4] == OX[8] && OX[0] != '-'){
                            return OX[0];
                        }
                        else{
                            if(OX[2] == OX[4] && OX[4] == OX[6] && OX[2] != '-'){
                                return OX[2];
                            }
                            else{
                                if(OX[1] == OX[4] && OX[4] == OX[7] && OX[1] != '-'){
                                    return OX[1];
                                }
                                else{
                                    if(OX[3] == OX[4] && OX[4] == OX[5] && OX[3] != '-'){
                                        return OX[3];
                                    }
                                    else{
                                        return '-'; 
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public String getPlayerOne() {
        return playerOne;
    }

    public void setPlayerOne(String playerOne) {
        this.playerOne = playerOne;
    }

    public String getPlayerTwo() {
        return playerTwo;
    }

    public void setPlayerTwo(String playerTwo) {
        this.playerTwo = playerTwo;
    }

    public String getPlayer() {
        return player;
    }

    public void setPlayer(String player) {
        this.player = player;
    }

    public int getCounter() {
        return counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public char[] getOX() {
        return OX;
    }

    public void setOX(char[] oX) {
        OX = oX;
    }

}