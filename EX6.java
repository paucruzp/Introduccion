

public class EX6 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();

        System.out.println(cliente.credito = 20);
        System.out.println (cliente.Edad = 18);
        System.out.println (cliente.Nombre = "Juan");
        System.out.println (cliente.telefono = 73434344);

        Trabajador trabajador = new Trabajador();

        System.out.println(trabajador.Salario = 200000);
        System.out.println (trabajador.Edad = 54);
        System.out.println (trabajador.Nombre = "Cristiano eliminado");
        System.out.println (trabajador.telefono = 736367);
    }
}
class Persona{
    int Edad;
    String Nombre;
    int telefono;
    }
class Cliente extends Persona{
    int credito;
}

class Trabajador extends Persona{
    int Salario;
}








