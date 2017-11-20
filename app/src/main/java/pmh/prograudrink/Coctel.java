package pmh.prograudrink;

import java.util.ArrayList;

public class Coctel {

    private ArrayList<String> licores;
    private ArrayList<String> ingredientes;
    private String nombre;
    private String descripcion;
    private String preparacion;

    public Coctel(String nombre){

        this.licores = new ArrayList<>();
        this.ingredientes = new ArrayList<>();

    }

    public void definirCoctel(String n,String prep,String desc){
        this.nombre = n;
        this.preparacion = prep;
        this.descripcion = desc;

    }

    public void test(){

        licores.add("Cerveza");
        licores.add("Ron");
        ingredientes.add("Menta");
    }
    //aaa

    public ArrayList<String> getLicores() {
        return this.licores;
    }

    public ArrayList<String> getIngredientes() {
        return this.ingredientes;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getDescripcion() {
        return this.descripcion;
    }

    public String getPreparacion() {
        return this.preparacion;
    }

}
