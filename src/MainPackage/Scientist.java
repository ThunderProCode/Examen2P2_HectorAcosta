/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ThunderKnight
 */
public class Scientist implements Serializable {
    
    private String name;
    private ArrayList<Planet> discoveredPlanets = new ArrayList();

    public Scientist(String name) {
        this.name = name;
    }
    
    public ArrayList<Planet> getDiscoveredPlanets() {
        return discoveredPlanets;
    }
    
    public void setDiscoveredPlanets(ArrayList<Planet> discoveredPlanets) {
        this.discoveredPlanets = discoveredPlanets;
    }
    
    public void addPlanet(Planet planet){
        this.discoveredPlanets.add(planet);
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

}
