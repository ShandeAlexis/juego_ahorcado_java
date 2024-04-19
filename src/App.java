import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
       //Clase escaner permite el usuario escriba
        Scanner escaner= new Scanner(System.in);

        // Declaraciones y asignaciones
        String palabraSecreta="fiesta";
        int intentosMaximos= 10;
        int intentos= 0;
        boolean palabraAdivinada= false;

        //arreglos
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        //Estructura de control: Iterativa (Bucle)
        for(int i=0;i<letrasAdivinadas.length;i++){
            letrasAdivinadas[i]='_';
        }

        //Estructura de control: Iterativa (Bucle)
        while (!palabraAdivinada&& intentos<intentosMaximos){
            System.out.println("Palabra a adivinar: "+ String.valueOf(letrasAdivinadas)+" ("+palabraSecreta.length()+" letras)");

            System.out.println("Introduce una letra, por favor:");
            //con la clase escaner pedimos una letra
            char letra= Character.toLowerCase(escaner.next().charAt(0));

            boolean letraCorrecta=false;

            //Estructura de control: Iterativa (Bucle)
            for(int i=0;i<palabraSecreta.length();i++){
                //Estructura de control : condicional
                if(palabraSecreta.charAt(i)==letra){
                    letrasAdivinadas[i]=letra;
                    letraCorrecta=true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.out.println("Incorrecto! Te quedan "+ (intentosMaximos-intentos)+" intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada=true;
                System.out.println("Felicidades!, has adivinado la palabra secreta: "+ palabraSecreta);
                
            }


            
        }

        if (!palabraAdivinada) {
            System.out.println("¡Que pena, te has quedado sin intentos! GAME OVER");
        }


    }
}
