
import java.util.Scanner; 

public class Codigo5 {
    public static void main(String[] args) { 
        Scanner s = new Scanner(System.in); 

        System.out.print("Introduzca un numero: "); 
        int ni = s.nextInt(); 

        int numeroOriginal = ni; 
        int afo = 0; 
        int noAfo = 0; 

        while (ni > 0) {
            int digito = ni % 10; 

            if (digito == 3 || digito == 7 || digito == 8 || digito == 9) {
                afo++;
            } else {
                noAfo++;
            }

            ni /= 10; 
        }

        if (afo > noAfo) {
            System.out.println("El " + numeroOriginal + " es un numero afortunado.");
        } else {
            System.out.println("El " + numeroOriginal + " no es un numero afortunado.");
        }

        s.close(); 
    }
}
