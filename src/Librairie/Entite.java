/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Librairie;

/**
 *
 * @author p1506559
 */
public class Entite {
<<<<<<< HEAD
    protected int x,y;
    protected Grille grille;
    protected boolean modeTueur=false;
=======
    private int x,y;
    private Grille grille;
>>>>>>> fc558fd1d2a1c736e0b99ee27c58588e7a145ebc
    
    public Entite(Grille grille){
        this.x = 0;
        this.y = 0;
        this.grille = grille;
    }
    
     public Entite(int x, int y, Grille grille){
        this.x = x;
        this.y = y;
        this.grille = grille;
    }
    
    public boolean deplacement(Dir deplacement){
<<<<<<< HEAD
=======
        System.out.println(deplacement);
>>>>>>> fc558fd1d2a1c736e0b99ee27c58588e7a145ebc
        boolean rencontreMur = false;
        int tab[][] = this.grille.getTab();
        switch(deplacement){
            case h:
                if(this.getX()-1>=0){
<<<<<<< HEAD
                    if(tab[x-1][y]==1){
=======
                    if(tab[x-1][y]==0){
>>>>>>> fc558fd1d2a1c736e0b99ee27c58588e7a145ebc
                        rencontreMur = true;
                    }else{
                        this.setX(x-1);
                        rencontreMur = false;
                    }
                }
<<<<<<< HEAD
                
            case b:
                if(this.getX()+1<this.grille.getVerticale()){
                   if(tab[x+1][y]==1){
=======
            break;
            case b:
                if(this.getX()+1<this.grille.getVerticale()){
                   if(tab[x+1][y]==0){
>>>>>>> fc558fd1d2a1c736e0b99ee27c58588e7a145ebc
                        rencontreMur = true;
                    }else{
                        this.setX(x+1);
                        rencontreMur = false;
                    } 
                }
<<<<<<< HEAD
                
            case d:
                if(this.getY()+1<this.grille.getHorizontale()){
                    if(tab[x][y+1]==1){
                        rencontreMur = true;
                    }else{
                        this.setX(y+1);
                        rencontreMur = false;
                    }
                }
                
            case g:
                if(this.getY()-1>=0){
                   if(tab[x][y-1]==1){
                        rencontreMur = true;
                    }else{
                        this.setX(y-1);
                        rencontreMur = false;
                    } 
                }
                
=======
            break;
            
            case d:
                if(this.getY()+1<this.grille.getHorizontale()){
                    if(tab[x][y+1]==0){
                        rencontreMur = true;
                    }else{
                        this.setY(y+1);
                        rencontreMur = false;
                    }
                }
            break;
            
            case g:
                if(this.getY()-1>=0){
                   if(tab[x][y-1]==0){
                        rencontreMur = true;
                    }else{
                        this.setY(y-1);
                        rencontreMur = false;
                    } 
                }
            break;
            
>>>>>>> fc558fd1d2a1c736e0b99ee27c58588e7a145ebc
        }
        
        return rencontreMur;
    }
    
    public int getX(){
        return this.x;
    }
    
    public int getY(){
        return this.y;
    }
    
    public Grille getGrille(){
        return this.grille;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setGrille(Grille grille) {
        this.grille = grille;
    }
<<<<<<< HEAD
        
    public void changeMode(){
            modeTueur=!modeTueur;
            if(modeTueur==true){
                int i =0;
                while(i<2000)
                {
                    i++;
                }
                modeTueur=!modeTueur;
            }
    }
=======
    
>>>>>>> fc558fd1d2a1c736e0b99ee27c58588e7a145ebc
  
}
