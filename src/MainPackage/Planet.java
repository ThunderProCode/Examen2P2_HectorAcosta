/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.Serializable;
import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author ThunderKnight
 */
public class Planet implements Serializable {
    
    private String name;
    private int size;
    private int weight;
    private int xPosition;
    private int yPosition;
    private boolean gaseous;
    
    public Planet(int size, int weight,String name, int xPosition, int yPosition, boolean gasesous) {
        this.name = name;
        this.size = size;
        this.weight = weight;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.gaseous = gaseous;
    }

    public Planet collision(Planet planetToCollisionate){
        Random r = new Random(); 
        int prop = r.nextInt(10-1) + 1;
        if( this.isGaseous() && planetToCollisionate.isGaseous()){
            if(prop > 0 && prop < 2){
                return createNewPlanet(planetToCollisionate, true);
            }
        }else if( !this.isGaseous() && !planetToCollisionate.isGaseous() ){
            if(prop > 0 && prop < 2.5){
                return createNewPlanet(planetToCollisionate, false);
            }
        }else {
            if(prop > 0 && prop < 3){
                return createNewPlanet(planetToCollisionate, this.gaseous);
            }
        }
        return null;
    }
    
    public Planet createNewPlanet(Planet planetToCollisionate, boolean type){
        String newName = JOptionPane.showInputDialog("Type new planets name: ");
        int newSize = (this.size + planetToCollisionate.getSize())/2;
        int newWeight = (this.weight + planetToCollisionate.getWeight())/2;
        int x = (this.xPosition + planetToCollisionate.getxPosition())/2;
        int y = (this.yPosition + planetToCollisionate.getyPosition())/2;
        return new Planet(size,weight,newName,x,y,type);
    }
    
    public boolean isGaseous() {
        return gaseous;
    }

    public void setGaseous(boolean gaseous) {
        this.gaseous = gaseous;
    }
    
    /**
     * Get the value of yPosition
     *
     * @return the value of yPosition
     */
    public int getyPosition() {
        return yPosition;
    }

    /**
     * Set the value of yPosition
     *
     * @param yPosition new value of yPosition
     */
    public void setyPosition(int yPosition) {
        this.yPosition = yPosition;
    }


    /**
     * Get the value of xPosition
     *
     * @return the value of xPosition
     */
    public int getxPosition() {
        return xPosition;
    }

    /**
     * Set the value of xPosition
     *
     * @param xPosition new value of xPosition
     */
    public void setxPosition(int xPosition) {
        this.xPosition = xPosition;
    }

    
    /**
     * Get the value of weight
     *
     * @return the value of weight
     */
    public int getWeight() {
        return weight;
    }

    /**
     * Set the value of weight
     *
     * @param weight new value of weight
     */
    public void setWeight(int weight) {
        this.weight = weight;
    }

    
    /**
     * Get the value of size
     *
     * @return the value of size
     */
    public int getSize() {
        return size;
    }

    /**
     * Set the value of size
     *
     * @param size new value of size
     */
    public void setSize(int size) {
        this.size = size;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planet{" + "name=" + name + ", size=" + size + ", weight=" + weight + ", xPosition=" + xPosition + ", yPosition=" + yPosition + ", gaseous=" + gaseous + '}';
    }

}
