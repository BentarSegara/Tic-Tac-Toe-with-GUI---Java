import java.awt.LayoutManager;

import javax.swing.BoxLayout;

import guicomponents.Frame;

public class Board extends Frame{
    protected static char[][] board = Board.boardInit();

    protected static int filledPlot = 0;


    private Frame[] rowFrames = { new Frame(null), new Frame(null), new Frame(null)};

    public Board(LayoutManager layout){
        super(null);
        init();

        this.colFramesInit();
        addComponents(this.rowFrames);
    }

    protected static boolean checkWinner(){
        //cek vertical and horizontal
        for (int i = 0; i < 3; i++) {
            if ( Board.board[0][i] != '*' && ((Board.board[0][i] == Board.board[1][i]) && (Board.board[0][i] == Board.board[2][i]))) return true;

            if (Board.board[i][0] != '*' && ((Board.board[i][0] == Board.board[i][1]) && (Board.board[i][0] == Board.board[i][2]))) return true;
        }
        
        //cek diagonal
        if (Board.board[0][0] != '*' && ((Board.board[0][0] == Board.board[1][1]) && (Board.board[0][0] == Board.board[2][2])))return true;
        if (Board.board[0][2] != '*' && ((Board.board[0][2] == Board.board[1][1]) && (Board.board[0][2] == Board.board[2][0]))) return true;

        return false;
    }


    private void init(){
        setBounds(90, 10, 180, 180);
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    }

    protected static char[][] boardInit(){
        char[][] board = {
            {'*', '*', '*'},
            {'*', '*', '*'},
            {'*', '*', '*'}
        };
        
        return board;
    }

    private void colFramesInit(){
        Frame[] frames = new Frame[9];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                frames[(i * 3) + j] = new Plot(j * 60, 0, 60, 60)
                                      .setCor(i, j);
                this.rowFrames[i].add(frames[(i * 3) + j]);
            }
        }
    }
}
