import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {

        public Window(String Title,int x,int y)
 {
        super(Title);
        this.setSize(x,y);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container contentPanel = this.getContentPane() ;

        JMenuBar m= new JMenuBar();

        JMenu menu1= new JMenu("File");
        JMenu menu2= new JMenu("Edit");
        JMenu menu3= new JMenu("View");
        JMenu menu4= new JMenu("Window");
        JMenu menu5= new JMenu("Help");
        JMenuItem open = new JMenuItem("Open") ;
        menu1.add(open);
        m.add(menu1);
        m.add(menu2);
        m.add(menu3);
        m.add(menu4);
        m.add(menu5);
        contentPanel.add(m,"North");

        JButton OkButton= new JButton("Que viva ENSEA !");
        JButton Red= new JButton("Red");
        Red.setBackground(Color.RED);
        JButton Blue= new JButton("Blue");
        Blue.setBackground(Color.BLUE);
        JButton Yellow= new JButton("Yellow");
        Yellow.setBackground(Color.YELLOW);

        JPanel southPanel = new JPanel();
        southPanel.setLayout(new GridLayout(2,2));
        southPanel.add(OkButton);
        southPanel.add(Red);
        southPanel.add(Blue);
        southPanel.add(Yellow);
        contentPanel.add(southPanel,"South");


        //contentPanel.add(OkButton);

        this.setVisible(true);
        }
        public static void main (String args[]){
        Window win = new Window("Paint it black",800,600);
        }
        }
