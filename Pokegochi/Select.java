import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Select extends WindowAdapter implements ActionListener{

JFrame frame;
JPanel panel_options,panel_tittle,panel_select;
//JButton accept, cancel;
CheckboxGroup checkbox;
JCheckBox charmander, squirtle, bulbasaur;
GridLayout grid;

public Select(){
    
}

public void select(){
    frame = new JFrame("Pokegochi");
    panel_options = new JPanel();
    panel_select = new JPanel();
    grid = new GridLayout(1,3);
    /*accept = new JButton("Aceptar");
    cancel = new JButton("Cancelar");
    */
    charmander = new JCheckBox("Charmander",new ImageIcon(getClass().getResource("\\Image\\Charmander.png")),false);
    squirtle = new JCheckBox("Squirtle",new ImageIcon(getClass().getResource("\\Image\\Squirtle.png")),false);
    bulbasaur = new JCheckBox("Bulbasaur",new ImageIcon(getClass().getResource("\\Image\\Bulbasaur.png")),false);
    /*
    accept.setContentAreaFilled(false);
    cancel.setContentAreaFilled(false);
    accept.setBorderPainted(false); 
    cancel.setBorderPainted(false); 
    */
    frame.setLayout(new BorderLayout());
    panel_select.setLayout(grid);
    charmander.addActionListener(this); 
    squirtle.addActionListener(this); 
    bulbasaur.addActionListener(this); 
    /*
    accept.addActionListener(this); 
    cancel.addActionListener(this); 
    */
    frame.add(panel_options,BorderLayout.SOUTH);
    frame.add(panel_select,BorderLayout.CENTER);
    frame.addWindowListener(this);
    panel_select.add(charmander);
    panel_select.add(squirtle);
    panel_select.add(bulbasaur);
    /*panel_options.add(accept);
    panel_options.add(cancel);  
    */
    frame.setVisible(true);
    frame.setSize(600,600);
    frame.setLocationRelativeTo(null);
}

public void actionPerformed (ActionEvent e){
     if(e.getSource().equals(charmander)){
        int answer = JOptionPane.showConfirmDialog(null,"¿Seleccionarás a Charmander?");
        if (answer ==JOptionPane.YES_OPTION){
        Charmander charmander = new Charmander();
        charmander.Start(); 
        }
    }
    if(e.getSource().equals(squirtle)){
        int answer = JOptionPane.showConfirmDialog(null,"¿Seleccionarás a Squirtle?");
        if (answer ==JOptionPane.YES_OPTION){
        Charmander charmander = new Charmander();
        charmander.Start(); 
        }
    }
    if(e.getSource().equals(bulbasaur)){
        int answer = JOptionPane.showConfirmDialog(null,"¿Seleccionarás a Bulbasaur?");
        if (answer ==JOptionPane.YES_OPTION){
        Charmander charmander = new Charmander();
        charmander.Start(); 
        }
    }

    }

public void windowClosing (WindowEvent e){
    System.exit(0);
}

}