/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import javax.swing.JProgressBar;

/**
 *
 * @author ThunderKnight
 */
public class BarThread extends Thread {
    
    JProgressBar jProgressBar1 = Main.getMainScreen().getjProgressBar1();
    boolean pausa = false;
    int distance;
    
    Planet planet1;
    Planet planet2;

    public void setPlanet1(Planet planet1) {
        this.planet1 = planet1;
    }

    public void setPlanet2(Planet planet2) {
        this.planet2 = planet2;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public boolean isPausa() {
        return pausa;
    }
    
    @Override
    public void run(){  
        int cont = 0;
        while(true){
            while(!pausa){
                try{
                    jProgressBar1.setValue( jProgressBar1.getValue() + 1 );
                    if(cont % 2 == 0){
                        jProgressBar1.setValue( jProgressBar1.getValue() - 1 );
                    }
                    
                    if(cont == distance){
                        System.out.println("Termino");
                        pausa = true;
                        Main.getMainScreen().afterLoad(planet1, planet2);
                    }
                    cont++;
                    Thread.sleep(10);
                }catch(Exception ex){
                    System.out.println(ex);
                }
            }
        }
    }  
}
