package guitools;

import java.awt.Component;
import java.awt.LayoutManager;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Window extends JFrame{

    public Window(){
        super();
        this.init();
    }

    public Window(int width, int height, boolean resizeable){
        this();
        setSize(width, height);
        setResizable(resizeable);
    }

    public Window(String title, int width, int height, boolean resizeable){
        this(width, height, resizeable);
        setTitle(title);
    }

    public Window setLayOut(LayoutManager manager) {
        setLayout(manager);
        return this;
    }

    public Window setTitleApp(String title){
        super.setTitle(title);
        return this;
    }

    public Window setIconApp(String url){
        ImageIcon icon = new ImageIcon(url);
        setIconImage(icon.getImage());
        return this;
    }

    public Window setIconApp(ImageIcon icon){
        setIconImage(icon.getImage());
        return this;
    }

    public void addComponents(Component...components) {
        for (Component component : components) add(component);
    }
    public void init(){
        setLayOut(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public Component getComponent() {
        return this;
    }
}
