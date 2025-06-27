package components;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;


import guitools.Frame;
import guitools.Label;

public class Plot extends Frame implements MouseListener{   
    private int rowAddress = 0;
    private int colAddress = 0;
    private Label symbolLabel = new Label("", 0, 0)
                                .setFont( "", Font.BOLD, 20);
    
    public Plot(int x, int y, int width, int height){
        super(x, y, width, height, new BorderLayout());
        setBackGround(Color.CYAN);
        setBorder(Color.BLACK, 1);
        addMouseListener(this);

        add(this.symbolLabel);
    }

    public Plot setCor(int row, int col){
        this.rowAddress = row;
        this.colAddress = col;

        return this;
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mousePressed(MouseEvent e) {
        if (this.symbolLabel.getText().equals("")){
            Board.filledPlot++;

            if (Board.filledPlot % 2 != 0){
                this.symbolLabel.setText("X");
                Board.board[this.rowAddress][this.colAddress] = 'X';
            } 
            else{
                this.symbolLabel.setText("O");
                Board.board[this.rowAddress][this.colAddress] = 'O';
            }

            // for (int i = 0; i < 3; i++) {
            //     System.err.println(Arrays.toString(Board.board[i]));
            // }
            
            if (Board.filledPlot == 9 && !Board.checkWinner()) {
                MainWindow.confirm = MainWindow.drawNotif.showNotif();
            }
            else if ((Board.filledPlot <= 9) && Board.checkWinner()) {
                if (Board.filledPlot % 2 != 0) MainWindow.confirm = MainWindow.p1Notif.showNotif();

                else MainWindow.confirm = MainWindow.p2Notif.showNotif();

            }

            if (MainWindow.confirm != null){
                if (MainWindow.confirm == 0) App.reOpen();
                else App.close();
            }

        }
    }
    @Override
    public void mouseReleased(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseEntered(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
    @Override
    public void mouseExited(MouseEvent e) {
        // TODO Auto-generated method stub
        
    }
}