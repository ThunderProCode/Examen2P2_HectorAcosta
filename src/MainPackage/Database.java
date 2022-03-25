/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MainPackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Database {
    ArrayList<Planet> publicPlanets = new ArrayList();
    ArrayList<Scientist> scientistsList = new ArrayList();
    
    public void init(){
//        Planet p1 = new Planet(5000,13000,"Mercurio",400,300,false);
//        Planet p2 = new Planet(100000,15000,"Venus",640,260, false);
//        Planet p3 = new Planet(140000,17000,"Tierra",760,570, false);
//        Planet p4 = new Planet(90000,12000,"Marte",360,360, false);
//        Planet p5 = new Planet(400000,40000,"Jupiter",340,310, false);
//        Planet p6 = new Planet(300000,30000,"Saturno",560,450, false);
//        Planet p7 = new Planet(200000,20000,"Urano",670,690, false);
//        Planet p8 = new Planet(200000,20000,"Neptuno",840,900, false);
//        
//        publicPlanets.add(p1);
//        publicPlanets.add(p2);
//        publicPlanets.add(p3);
//        publicPlanets.add(p4);
//        publicPlanets.add(p5);
//        publicPlanets.add(p6);
//        publicPlanets.add(p7);
//        publicPlanets.add(p8);
//        
//        savePlanets();


//        Scientist scientist = new Scientist("Hector");
//        Planet newPlanet = new Planet(600400,20600,"Hean",900,400, false);
//        scientist.addPlanet(newPlanet);
//        scientistsList.add(scientist);
//        saveScientists();
        
    }
    
    //Scientists
    public void saveScientists(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ThunderKnight\\Documents\\CODE 2022\\LabP2\\Lab10P2_HectorAcosta_12041087\\scientists.pl");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            for (Scientist scientist : scientistsList) {
//                System.out.println(scientist);
                oos.writeObject(this.scientistsList);   
            }
            oos.close();
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }
    }
          
    public void loadScientists(){
        try{
            FileInputStream inFile = new FileInputStream("C:\\Users\\ThunderKnight\\Documents\\CODE 2022\\LabP2\\Lab10P2_HectorAcosta_12041087\\scientists.pl");
            ObjectInputStream objInput = new ObjectInputStream(inFile);
            ArrayList<Scientist> newScientistsList = (ArrayList<Scientist>) objInput.readObject();
            this.scientistsList = newScientistsList;
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    //Planets
    public void savePlanets(){
        try{
            FileOutputStream fos = new FileOutputStream("C:\\Users\\ThunderKnight\\Documents\\CODE 2022\\LabP2\\Lab10P2_HectorAcosta_12041087\\publicPlanets.pl");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Planet planet : publicPlanets) {
//                System.out.println(planet);
                oos.writeObject(this.publicPlanets);   
            }
            
            oos.close();
        
        }catch(FileNotFoundException e){
            e.printStackTrace();
        } catch (IOException e){
            e.printStackTrace();
        }

    }
      
    public void loadPlanets(){
        try{
            FileInputStream inFile = new FileInputStream("C:\\Users\\ThunderKnight\\Documents\\CODE 2022\\LabP2\\Lab10P2_HectorAcosta_12041087\\publicPlanets.pl");
            ObjectInputStream objInput = new ObjectInputStream(inFile);
            
            ArrayList<Planet> newPlanetsList = (ArrayList<Planet>) objInput.readObject();
            this.publicPlanets = newPlanetsList;
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
    
    //Getters & Setters

    public Scientist getScientistByName(String name){
        for (Scientist scientist : scientistsList) {
            if(scientist.getName().equals(name)){
                return scientist;
            }
        }
        return null;
    }
    
    public Planet getPlanetByName(String name){
        for (Planet publicPlanet : publicPlanets) {
            if(publicPlanet.getName().equals(name)){
                return publicPlanet;
            }
        }
        return null;
    }
    
    public void addScientist(Scientist scientist){
        this.scientistsList.add(scientist);
    }
    
    public ArrayList<Planet> getPublicPlanets() {
        return publicPlanets;
    }

    public void setPublicPlanets(ArrayList<Planet> publicPlanets) {
        this.publicPlanets = publicPlanets;
    }

    public ArrayList<Scientist> getScientistsList() {
        return scientistsList;
    }

    public void setScientistsList(ArrayList<Scientist> scientistsList) {
        this.scientistsList = scientistsList;
    }
    
    
}
