package Animales;
public class PruebaA {
public static void main(String[] args) {
        Animal[] animales =new Animal[4];
        animales[0]=new Gato();
        animales[1]=new Perro();
        animales[2]=new Lobo();
        animales[3]=new Leon();
        
        for (int i=0;i<animales.length;i++){
            System.out.println(animales[i].getnCientifico());
            System.out.println("Sonido: " +animales[i].getSonido());
            System.out.println("Alimento: " + animales[i].getAlimento());
            System.out.println("Habitat: " + animales[i].getHabitat());
            System.out.println();
        }
        
    }
}
