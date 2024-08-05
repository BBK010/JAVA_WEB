/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bibek Kunwar
 */
import javax.swing.*;
public class TextArea {
    TextArea()
    {
        JFrame f = new JFrame("ABC");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        JLabel l = new JLabel("Comment");
        l.setBounds(60,80,80,20);
        JTextArea ta = new JTextArea();
        ta.setBounds(60,120,200,200);
        f.add(l);
        f.add(ta);
    }
    public static void main(String[] args)
    {
        new TextArea();
    
}
}