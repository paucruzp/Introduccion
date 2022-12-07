public class Main {
    public static void main(String[] args) {
        suma( 10, 20 , 5);
    }

    public static void suma(int a, int b, int c) {

        System.out.println(a + b + c);

        // Esto está mla, ya que el código se repite al hacer la función. Se le llama paso por valor. También
        // se duplican los estilos de los números (int) y se ocupa el doble de memoria en ambos casos
        // Las funciones deben ser útiles y no muy largas
        // Las funciones siempre deberán llamrse dentrode sus correspondientes {}, sino no se podrán invocar
    }

}

//public class Principal {
   // public static void Principal (String[] args) {
// Potato MiPotato = new Potato();
   //     MiPotato.Quitarbrazo();
     //   class Potato {
       //     public int brazos = 0;

        //}

