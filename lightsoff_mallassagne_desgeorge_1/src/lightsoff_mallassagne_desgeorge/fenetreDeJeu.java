package lightsoff_mallassagne_desgeorge;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author rom
 */
public class fenetreDeJeu extends javax.swing.JFrame {
    private Joueur joueurCourant = new Joueur();
    private PlateauDeJeu plateau = new PlateauDeJeu();
    private Cellulegraph [][] tabl = new Cellulegraph[5][5];
    private int clic = 0;
    private int Score = 5000;
    private boolean bon1 = false;
    private boolean bon2 = false;
    private boolean bon3 = false;
    private boolean bon4 = false;
    
    /**
     * Creates new form fenetreDeJeu
     */
    public fenetreDeJeu() {
        initComponents();
        placerlumiere();
        if (joueurCourant.nbbonus_unecase ==0){
            jButton3.setEnabled(false);
        }
        if (joueurCourant.nbbonus_toutecase ==0){
            jButton4.setEnabled(false);
        }
        if (joueurCourant.nbbonus_uneligne ==0){
            jButton5.setEnabled(false);
        }
        if (joueurCourant.nbbonus_unecolonne ==0){
            jButton6.setEnabled(false);
        }  
        
        for (int i = 4; i >= 0; i--) {
            for (int j = 0; j < 5; j++) {
               
                Cellulegraph cellgraph = new Cellulegraph(plateau.grille[j][i]);                               
                tabl[i][j] = cellgraph;
                cellgraph.addActionListener(new java.awt.event.ActionListener() {
                    public void actionPerformed(java.awt.event.ActionEvent evt) {
                        clic ++;
                        clicss.setText(clic+"");
                        Score=Score - 10;
                        score.setText(Score+"");
                        System.out.println(clic);
                        Cellule c = cellgraph.celluleassociee;
                       
                                                
                        if (plateau.etregagnant()==false){
                            if(bon1==false){
                            plateau.Changementlumiere(c.x,c.y);
                            }
                            if(bon1==true){
                                plateau.Changementlumiere1(c.x,c.y);
                                bon1 = false;
                                if (joueurCourant.nbbonus_unecase !=0){
                                    jButton3.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_toutecase !=0){
                                    jButton4.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_uneligne !=0){
                                    jButton5.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_unecolonne !=0){
                                    jButton6.setEnabled(true);
                                }                                  
                            }
                            if(bon2==true){
                                plateau.Changementlumiere1(c.x,c.y);
                                bon1 = false;
                                if (joueurCourant.nbbonus_unecase !=0){
                                    jButton3.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_toutecase !=0){
                                    jButton4.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_uneligne !=0){
                                    jButton5.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_unecolonne !=0){
                                    jButton6.setEnabled(true);
                                }                                  
                            }
                            if(bon3==true){
                                plateau.Changementlumiere1(c.x,c.y);
                                bon1 = false;
                                if (joueurCourant.nbbonus_unecase !=0){
                                    jButton3.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_toutecase !=0){
                                    jButton4.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_uneligne !=0){
                                    jButton5.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_unecolonne !=0){
                                    jButton6.setEnabled(true);
                                }                                  
                            }
                            if(bon4==true){
                                plateau.Changementlumiere1(c.x,c.y);
                                bon1 = false;
                                if (joueurCourant.nbbonus_unecase !=0){
                                    jButton3.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_toutecase !=0){
                                    jButton4.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_uneligne !=0){
                                    jButton5.setEnabled(true);
                                }
                                if (joueurCourant.nbbonus_unecolonne !=0){
                                    jButton6.setEnabled(true);
                                }                                  
                            }                            
                            jPanel3.repaint();
                        
                        }
                        
                        
                    }
                });
                jPanel3.add(cellgraph);
                
            }
        }
        jPanel3.repaint();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        clicss = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        score = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        nbbonus1case = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        achat1case = new javax.swing.JButton();
        achattoutecase = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nbbonustoutecase = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nbbonusligne = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        nbbonuscolonne = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        nbpieces = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        nouvellepartie = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new java.awt.GridLayout(5, 5));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("nombre de clics : ");

        clicss.setText("0");

        jLabel8.setText("Score :");

        score.setText("5000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(score))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clicss)))
                .addContainerGap(77, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(clicss))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(score))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre de bonus 1case : ");

        nbbonus1case.setText("0");

        jLabel3.setText("Boutique");

        achat1case.setText("Achat Bonus 1 case");
        achat1case.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achat1caseActionPerformed(evt);
            }
        });

        achattoutecase.setText("Achat Bonus toute case");
        achattoutecase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                achattoutecaseActionPerformed(evt);
            }
        });

        jButton1.setText("Achat Bonus Ligne");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Achat Bonus Colonne");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel4.setText("Nombre de bonus toute case :");

        nbbonustoutecase.setText("0");

        jLabel5.setText("Nombre de bonus ligne :");

        nbbonusligne.setText("0");

        jLabel6.setText("Nombre de bonus colonne :");

        nbbonuscolonne.setText("0");

        jLabel7.setText("Nombre de pièces :");

        nbpieces.setText("500");

        jLabel10.setText("100 pièces");

        jLabel11.setText("150 pièces");

        jLabel12.setText("150 pièces");

        jLabel9.setText("250 pièces");

        jButton3.setText("jouerbon1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("jouerbon2");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("jouerbon3");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("jouerbon4");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(69, 69, 69)
                                    .addComponent(jLabel3))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(26, 26, 26)
                                    .addComponent(achat1case))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(17, 17, 17)
                                    .addComponent(achattoutecase))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(31, 31, 31)
                                    .addComponent(jButton1))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nbbonuscolonne)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jButton6)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nbbonus1case)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nbpieces))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nbbonusligne)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton5))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(nbbonustoutecase)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton4)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(achat1case)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(achattoutecase)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nbbonus1case)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nbbonustoutecase)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(nbbonusligne)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(nbbonuscolonne)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nbpieces))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        nouvellepartie.setText("Nouvelle partie");
        nouvellepartie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nouvellepartieActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(nouvellepartie)))
                .addGap(0, 55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(nouvellepartie)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void achat1caseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achat1caseActionPerformed
        if(joueurCourant.nbpieces - 250 >= 0){
            joueurCourant.nbpieces -= 250;
            joueurCourant.obtenirnbbonus_unecase();
            nbbonus1case.setText(joueurCourant.nbbonus_unecase + "");
            nbpieces.setText(joueurCourant.nbpieces + "");
        }
        if (joueurCourant.nbpieces - 250 < 0){
            achat1case.setEnabled(false);
        }
        if (joueurCourant.nbpieces - 100 < 0){
            achattoutecase.setEnabled(false);
        }                        
        if (joueurCourant.nbpieces - 150 < 0){
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }
        jButton3.setEnabled(true);
        
    }//GEN-LAST:event_achat1caseActionPerformed

    private void achattoutecaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_achattoutecaseActionPerformed
        // TODO add your handling code here:
        if(joueurCourant.nbpieces - 100 >= 0){
            joueurCourant.nbpieces -= 100;
            joueurCourant.obtenirnbbonus_toutecase();
            nbbonustoutecase.setText(joueurCourant.nbbonus_toutecase + "");
            nbpieces.setText(joueurCourant.nbpieces + "");
        }
        if (joueurCourant.nbpieces - 250 < 0){
            achat1case.setEnabled(false);
        }
        if (joueurCourant.nbpieces - 100 < 0){
            achattoutecase.setEnabled(false);
        }                        
        if (joueurCourant.nbpieces - 150 < 0){
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        }  
        jButton4.setEnabled(true);
     
    }//GEN-LAST:event_achattoutecaseActionPerformed

    private void nouvellepartieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nouvellepartieActionPerformed
        // TODO add your handling code here:
        joueurCourant.setmoney();
        joueurCourant.initbonus();
        plateau.vidergrille();
        placerlumiere();
        achat1case.setEnabled(true);
        achattoutecase.setEnabled(true);
        jButton1.setEnabled(true);
        jButton2.setEnabled(true);
        jPanel3.repaint();
        if (joueurCourant.nbbonus_unecase ==0){
            jButton3.setEnabled(false);
        }
        if (joueurCourant.nbbonus_toutecase ==0){
            jButton4.setEnabled(false);
        }
        if (joueurCourant.nbbonus_uneligne ==0){
            jButton5.setEnabled(false);
        }
        if (joueurCourant.nbbonus_unecolonne ==0){
            jButton6.setEnabled(false);
        }          
    }//GEN-LAST:event_nouvellepartieActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(joueurCourant.nbpieces - 150 >= 0){
            joueurCourant.nbpieces -= 150;
            joueurCourant.obtenirnbbonus_uneligne();
            nbbonusligne.setText(joueurCourant.nbbonus_uneligne + "");
            nbpieces.setText(joueurCourant.nbpieces + "");
        }
        if (joueurCourant.nbpieces - 250 < 0){
            achat1case.setEnabled(false);
        }
        if (joueurCourant.nbpieces - 100 < 0){
            achattoutecase.setEnabled(false);
        }                        
        if (joueurCourant.nbpieces - 150 < 0){
            jButton1.setEnabled(false);
            jButton2.setEnabled(false);
        } 
        jButton5.setEnabled(true);
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
            if(joueurCourant.nbpieces - 150 >= 0){
                joueurCourant.nbpieces -= 150;
                joueurCourant.obtenirnbbonus_unecolonne();
                nbbonuscolonne.setText(joueurCourant.nbbonus_unecolonne + "");
                nbpieces.setText(joueurCourant.nbpieces + "");
            }
            if (joueurCourant.nbpieces - 250 < 0){
                achat1case.setEnabled(false);
            }
            if (joueurCourant.nbpieces - 100 < 0){
                achattoutecase.setEnabled(false);
            }                        
            if (joueurCourant.nbpieces - 150 < 0){
                jButton1.setEnabled(false);
                jButton2.setEnabled(false);
            }
            jButton6.setEnabled(true);

            
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        bon1 = true;
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton5.setEnabled(false);
        joueurCourant.nbbonus_unecase -=1;
        nbbonus1case.setText(joueurCourant.nbbonus_unecase+"");        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        bon2 = true;
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton5.setEnabled(false);
        joueurCourant.nbbonus_toutecase -=1;
        nbbonustoutecase.setText(joueurCourant.nbbonus_toutecase+"");                      
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        bon3 = true;
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton5.setEnabled(false);
        joueurCourant.nbbonus_uneligne -=1;
        nbbonusligne.setText(joueurCourant.nbbonus_uneligne+"");        
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        bon4 = true;
        jButton3.setEnabled(false);
        jButton4.setEnabled(false);
        jButton5.setEnabled(false);
        jButton5.setEnabled(false);
        joueurCourant.nbbonus_unecolonne -=1;
        nbbonuscolonne.setText(joueurCourant.nbbonus_unecolonne+""); 
    }//GEN-LAST:event_jButton6ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fenetreDeJeu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fenetreDeJeu().setVisible(true);
            }
        });
    }
        public void placerlumiere(){
        int a =0;
        int u=0;
        while (a==0){
        a =(int) (Math.random() * (26));
        
        /**
         * while(a!=0){
            for (int i=0;i<5;i++){
                for (int j=0;j<5;j++){
                    if(plateau.Luminosite(i, j) == false){
                        
                    }
                }
                
            }
            * */
        while (u<a){
            int x ;
            x= (int) (Math.random() * (5));
            int y = (int) (Math.random() * (5));
            if(plateau.Luminosite(x, y) == false){
                plateau.Changementlumiere(x, y);
                u+=1;
            }
        }
        
        
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton achat1case;
    private javax.swing.JButton achattoutecase;
    private javax.swing.JLabel clicss;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel nbbonus1case;
    private javax.swing.JLabel nbbonuscolonne;
    private javax.swing.JLabel nbbonusligne;
    private javax.swing.JLabel nbbonustoutecase;
    private javax.swing.JLabel nbpieces;
    private javax.swing.JButton nouvellepartie;
    private javax.swing.JLabel score;
    // End of variables declaration//GEN-END:variables

}

