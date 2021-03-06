/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simple.gui.movement;

import javax.swing.JLabel;


/**
 *
 * @author bowen
 */
public class Object{
    
    float posx;
    float posy;
    boolean isBox;
    String text;
    JLabel aLabel;
    
    public Object(){
        this.posx=0;
        this.posy=0;
        this.isBox=false;
    }
    
    public Object(int posx, int posy) {
        this.posx=posx;
        this.posy=posy;
        this.isBox=false;
    }

    public Object(int posx, int posy, boolean isBox, String text) {
        this.posx = posx;
        this.posy = posy;
        this.isBox = isBox;
        this.text = text;
    }
    
    public void initObjectDisplay(){
        if (this.text!=null) { // Not yet created box label.
            this.aLabel=Gui.newLabel(this.text, this.posx, this.posy);
        }
        else{
            Gui.newLabel();
        }
        
    }
    
    //public void displayTranslatedObject(Player player){
    //    Gui.newLabel(this.text, this.posx+player.posx, this.posx+player.posy);
    //}
    
    
    public void updateObjectDisplay(){
        Gui.updateLabel(aLabel, (int)posx, (int)posy);
    }
    
    public void updateObjectDisplayTranslated(Player player){
        Gui.updateLabel(this.aLabel, this.posx-player.posx, this.posy-player.posy);
    }

    public float getPosx() {
        return posx;
    }

    public void setPosx(float posx) {
        this.posx = posx;
    }

    public float getPosy() {
        return posy;
    }

    public void setPosy(float posy) {
        this.posy = posy;
    }

    public boolean isIsBox() {
        return isBox;
    }

    public void setIsBox(boolean isBox) {
        this.isBox = isBox;
    }
    
    
    
}
