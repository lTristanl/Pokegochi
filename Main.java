import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.io.*;
public class Main{


    public static void main (String []args){
        Menu menu = new Menu();
        Select select = new Select();
        menu.menu();
        select.select();
        
    }
}