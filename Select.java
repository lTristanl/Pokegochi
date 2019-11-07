import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;
public class Select{

JFrame frame;
JLabel label;
JButton accept, cancel;

public Select(){
    

}

public void select(){
    frame = new JFrame("Pokegochi");
    label = new JLabel("¡Pokegochi!");
    frame.setLayout(new BorderLayout());
    frame.add(label,BorderLayout.NORTH);
    frame.setVisible(true);
    frame.setSize(600,600);
}
}