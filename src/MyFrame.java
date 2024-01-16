import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame {

    JFrame frame;
    JButton buttonSend;

    /**
     * Erstellt eine JFrame GUI, auf der z.Z. noch nichts angezeigt wird
     */
    public void myFrame(){
        frame = new JFrame("Test");
        frame.setSize(600,500);
        frame.setVisible(true);
        frame.setLayout(null);

        buttonSend = new JButton("Senden");
        buttonSend.setLocation(30,30);
        buttonSend.setBounds(50,50,100,50);
        buttonSend.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Ich heiße Nikolas Pering :)");
            }
        });
        frame.add(buttonSend);
    }
}
