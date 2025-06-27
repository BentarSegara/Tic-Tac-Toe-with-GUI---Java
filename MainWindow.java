package components;

import guitools.Window;

public class MainWindow extends Window{
    protected static Integer confirm;

    protected static Notif p1Notif = new Notif("Player 1 Win, Do you want to restart the game ?", "src/assets/icon/X.png");
    protected static Notif p2Notif = new Notif("Player 2 Win, Do you want to restart the game ?", "src/assets/icon/O.png");
    protected static Notif drawNotif = new Notif("Draw, Do you want to restart the game ?", "src/assets/icon/XO.png");

    public MainWindow(){
        super("TicTacToe", 380, 270, false);
        setIconApp("src/assets/icon/XO.png");
        setLocationRelativeTo(null);

        Board board = new Board(null);        
        add(board);
    } 
}
