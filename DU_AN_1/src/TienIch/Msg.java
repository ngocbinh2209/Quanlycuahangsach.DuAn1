/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TienIch;

import java.awt.Component;
import javax.swing.JOptionPane;
/**
 *
 * @author QUAN
 */
public class Msg {
    public void alert(Component parent, String tb){
        JOptionPane.showMessageDialog(parent, tb, "Mua sách online", JOptionPane.INFORMATION_MESSAGE);
    }
    public int alertComfirm(Component parent, String tb){
        int tf = JOptionPane.showConfirmDialog(parent, tb, "Mua sach online", JOptionPane.YES_NO_CANCEL_OPTION);
        return tf;
    }
}
