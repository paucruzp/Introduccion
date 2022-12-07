public class Segundoex {
    public static void main (String[] args) {
        coche micoche = new coche();
        micoche.anadirpuerta();
        micoche.anadirpuerta();
        micoche.anadirpuerta();
        System.out.println(micoche.puertas);
    }

    }
    class coche {
            public int puertas = 0;

            public void anadirpuerta(){
                this.puertas++;
            }
        }


