/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lightsoff_mallassagne_desgeorge;

import java.util.ArrayList;

/**
 *
 * @author rom
 */
public class Joueur { 
    int nbpieces=500;
    int nbcoups; 
    ArrayList <String> Bonus = new ArrayList<>();
    int nbbonus_unecase=0;
    int nbbonus_uneligne=0;
    int nbbonus_unecolonne=0;
    int nbbonus_toutecase=0;
    
    public void obtenirnbbonus_unecase(){
        nbbonus_unecase +=1;
    }
    public void obtenirnbbonus_toutecase(){
        nbbonus_toutecase +=1;
    }
    public void obtenirnbbonus_unecolonne(){
        nbbonus_unecolonne +=1;
    }
    public void obtenirnbbonus_uneligne(){
        nbbonus_uneligne +=1;
    }
    public void utilisernbbonus_unecase(){
        nbbonus_unecase -=1;
    }
    public void utilisernbbonus_toutecase(){
        nbbonus_toutecase -=1;
    }
    public void utilisernbbonus_unecolonne(){
        nbbonus_unecolonne -=1;
    }
    public void utilisernbbonus_uneligne(){
        nbbonus_uneligne -=1;
    }
    public void setmoney(){
        nbpieces = 500;
    }
    public void initbonus(){
        nbbonus_uneligne = 0;
        nbbonus_unecolonne = 0;
        nbbonus_toutecase = 0;
        nbbonus_unecase = 0;
    }
}
