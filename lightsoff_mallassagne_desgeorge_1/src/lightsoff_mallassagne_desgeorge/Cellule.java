package lightsoff_mallassagne_desgeorge;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author rom
 */
public class Cellule {
    int x;
    int y;
    public Cellule(int a,int b){
        lumi = lumi;
        x=a;
        y=b;
    }
    Lampe lumi = new Lampe();
    
    public boolean Luminosite(){
        boolean verif = false;
        if (lumi.lumiere == true){
            verif = true;
        }
        return verif;
    }
    public void Changementlumiere(){
        lumi.changementlumiere();
    }
}
