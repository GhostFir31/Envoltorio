import java.util.ArrayList;
import java.util.Random;

public class Envoltorio {

    ArrayList<Integer> listaAleatorios;

    public Envoltorio() {

        listaAleatorios = new ArrayList<>();

    }

    public void llenarlista() {

        Random numeroAleatorio = new Random();

        int numeroGenerado;

        for (int i = 0; i < 10; i++) {

            numeroGenerado = numeroAleatorio.nextInt(11);

            listaAleatorios.add(numeroGenerado);

            System.out.print(" " + listaAleatorios.get(i)+" ");

        }
        System.out.println(" ");

    }

    public void numerosRepetidos() {
        
     
        int contador = 0;

        for (int i = 0; i < listaAleatorios.size(); i++) {
            
            contador=0;

        
            for (int j = 0; j < listaAleatorios.size(); j++) {

                if (listaAleatorios.get(i) == listaAleatorios.get(j)) {

                    contador++;

                }
                
            }
         
            System.out.println("El número " + listaAleatorios.get(i) + " se repite " + contador + " veces.");
            
        }

    }

    public String toString(int posicion) {

        return "  " + listaAleatorios.get(posicion);

    }

}
