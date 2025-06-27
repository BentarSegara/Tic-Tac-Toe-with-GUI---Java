import javax.swing.SwingUtilities;

public class App {
    public static MainWindow mainWindow;

    public static void open(){
        new Thread(() -> {
            App.mainWindow = new MainWindow();
            SwingUtilities.invokeLater(() -> App.mainWindow.setVisible(true));
        }).start();
    }

    public static void close(){
        App.mainWindow.dispose();
    }

    public static void reOpen(){
        new Thread(() -> {
            App.close();
            App.reset();
            SwingUtilities.invokeLater(() -> App.open());
        }).start();
    }

    public static void reset(){
        MainWindow.confirm = null;
        Board.board = Board.boardInit();
        Board.filledPlot = 0;
    }
    
    public static void main(String[] args) throws Exception {
      App.open();
    }
}
