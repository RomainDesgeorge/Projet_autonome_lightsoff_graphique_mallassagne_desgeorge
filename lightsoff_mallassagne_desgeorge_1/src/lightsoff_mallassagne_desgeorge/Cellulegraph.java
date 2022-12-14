/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

import java.awt.Graphics;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;

/**
 *
 * @author rom
 */
public class Cellulegraph extends JButton{
    Cellule celluleassociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
    ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    public Cellulegraph(){
       
    }
    public void paintComponent (Graphics G){
        super.paintComponent(G);
        if (celluleassociee.Luminosite() == true){
            setIcon(img_jetonJaune);
        }else
        {
            setIcon(img_vide);
        }

    }

    public void addActionListener(ActionListener actionListener) {
       
    }
}
