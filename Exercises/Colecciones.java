package Exercises;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.HashMap;


public class Colecciones {
    ArrayList<String> cars ;
    String[] bikes;
    Set<String> bicicles;
    public HashMap<Integer, String> transport;

    public Colecciones(){
        this.cars = new ArrayList<String>();
        this.bikes = new String[10];
        this.bicicles = new HashSet<String>();
        this.transport= new HashMap<Integer, String>();
    }

    public void inicializar(){
        //carros
        cars.add("VW Vento");
        cars.add("Nisan Versa");
        cars.add("Ford Fiesta");
        cars.add("Mazda 2");
        //motos
        this.bikes[1]="Yamaha V-Star 250";
        this.bikes[2]="Royal Enfield Meteor 350";
        this.bikes[3]="Kawasaki Eliminator";
        this.bikes[4]="Honda CMX500A2 SE Rebel.";
        //bicicletas 
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("TREK MADONE 7 DIAMOND");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
        this.bicicles.add("AURUMANIA CRYSTAL EDITION GOLD BIKE");
    }

   public HashMap<Integer, String> obtenerHash(){

        this.transport.clear();
        Set<String> vistos = new HashSet<>();
        
        ArrayList<String> todos = new ArrayList<>();
        todos.addAll(this.cars);
        for(String moto : this.bikes) {
            todos.add(moto);
        }
        todos.addAll(this.bicicles);
        int clave = 1;

        for(String valor : todos){
            if(valor != null && !valor.trim().isEmpty()){

                if(!vistos.contains(valor)){
                    vistos.add(valor);
                    this.transport.put(clave, valor);
                    clave++; 
            }
        }
    }

    return this.transport;
    }
}
