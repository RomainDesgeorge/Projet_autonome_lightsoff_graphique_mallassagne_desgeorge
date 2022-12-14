/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

import javax.swing.ImageIcon;

/**
 *
 * @author rom
 */
public class Cellulegraph {
    Cellule celluleassociee;
    ImageIcon img_vide = new javax.swing.ImageIcon(getClass().getResource("/images/celluleVide.png"));
     ImageIcon img_jetonJaune = new javax.swing.ImageIcon(getClass().getResource("/images/jetonJaune.png"));
    public Cellulegraph(Cellule uneCellule){
        celluleassociee = uneCellule;
    }
}
