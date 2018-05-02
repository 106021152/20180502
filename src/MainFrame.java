import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrame extends JFrame {
    private int count = 0;
    private JButton jbtnAdd = new JButton("Add");
    private JButton jbtnSub = new JButton("Sub");
    private JButton jbtnExit = new JButton("Exit");
    public MainFrame(){
        this.init();
        this.setTitle("Class1");
    }
    public void init(){
        this.add(jbtnAdd);
        this.add(jbtnSub);
        this.add(jbtnExit);
        this.setLayout(null);
        this.setLocation(80,60);
        this.setSize(800,600);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jbtnAdd.setBounds(80,60,100,100);
        jbtnSub.setBounds(280,60,100,100);
        jbtnExit.setBounds(480,60,100,100);
        jbtnAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count ++;
                setTitle(Integer.toString(count));
            }
        });
        jbtnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                count --;
                setTitle(Integer.toString(count));
            }
        });
        jbtnExit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }
}
