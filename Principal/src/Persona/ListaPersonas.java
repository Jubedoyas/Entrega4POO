package Persona;
import java.util.*;
public class ListaPersonas {
    Vector listaPersonas;
    public ListaPersonas(){
        listaPersonas = new Vector();
    }
    public void añadirPersona(Personas p){
        listaPersonas.add(p);
        
    }
    public void eliminarPersona(int indice){
        listaPersonas.removeElementAt(indice);
    }
    public void borrarLista(){
        listaPersonas.removeAllElements();
    }
}
