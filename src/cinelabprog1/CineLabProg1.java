package cinelabprog1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class CineLabProg1 {

    public static void main(String[] args) {
        ArrayList<Pelicula> pelicula = new ArrayList();
        Scanner leer = new Scanner(System.in);
        String nuev;
        do {
            System.out.println("Ingrese titulo de la pelicula");
            String titu = leer.nextLine();
            System.out.println("Ingrese el director");
            String direc = leer.nextLine();
            System.out.println("Ingrese la duracion");
            double dura = leer.nextDouble();
            leer.nextLine();
            Pelicula peli = new Pelicula(titu, direc, dura);
            pelicula.add(peli);
            System.out.println("Quiere ingresar una nueva pelicula?");
            nuev = leer.nextLine();

        } while (nuev.equalsIgnoreCase("si"));

        System.out.println("---------------------------------------------------------------------------------");
        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);
        }
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("Las peliculas mayores a 1 hora son: ");
        for (Pelicula pelicula1 : pelicula) {
            if (pelicula1.getDuracion() > 1) {
                System.out.println(pelicula1);
            }

        }
        //Collections.sort(pelicula, Pelicula.durAsc); 
        pelicula.sort(Pelicula.durAsc);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("las peliculas ordenadas por duracion menor a mayor son: ");

        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);

        }
        Collections.sort(pelicula, Pelicula.durDes);
        //pelicula.sort(Pelicula.durDes);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por duracion Mayor a menor son: ");
        
        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);

        }
        //Collections.sort(pelicula, Pelicula.titu);
        pelicula.sort(Pelicula.titu);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por titulo son: ");
        
        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);

        }
        Collections.sort(pelicula, Pelicula.dire);
        //pelicula.sort(Pelicula.dire);
        System.out.println("--------------------------------------------------------------------------------");
        System.out.println("Las peliculas ordenadas por director es: ");
        
        for (Pelicula pelicula1 : pelicula) {
            System.out.println(pelicula1);

        }
    }

}
