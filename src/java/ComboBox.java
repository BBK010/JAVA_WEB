/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bibek Kunwar
 */
import javax.swing.*;
public class ComboBox {
    ComboBox(){
        JFrame f = new JFrame("ABC");
       f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        JLabel l = new JLabel("Country");
        l.setBounds(60, 50, 80, 20);
        String[] s = {"Nepal","USA","UAE"};
        JComboBox<String> cb = new JComboBox<>(s);
        cb.setBounds(170,50,50,20);
        f.add(cb);
    }
    public static void main(String[] args)
    {
        new ComboBox();
    }
}
