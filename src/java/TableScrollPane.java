/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Bibek Kunwar
 */
import javax.swing.*;
public class TableScrollPane {
    TableScrollPane(){
        JFrame f = new JFrame("ABC");
        f.setSize(350,400);
        f.setVisible(true);
        f.setLayout(null);
        String[] title = { "id", "name", "address"};
        String[][] data = { {"1", "Ram", "GDKT"},{"2","Hari","CTWN"},{"3", "Shyam","PKR"}};
        JTable t = new JTable(data,title);
        JScrollPane sp = new JScrollPane(t);
        sp.setBounds(170,50,50,20);
        f.add(sp);
    }
    public static void main(String[] args)
    {
        new TableScrollPane();
    }
}
