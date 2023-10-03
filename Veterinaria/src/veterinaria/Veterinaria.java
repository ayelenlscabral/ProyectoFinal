package veterinaria;

import veterinaria.AccesoADatos.ClienteData;
import veterinaria.Entidades.Cliente;

public class Veterinaria {

    public static void main(String[] args) {
        ClienteData clienteData = new ClienteData();
        
        Cliente cliente1 = new Cliente(25145269, "Sastre", "Maximiliano", "Arcoiris 2072", 1166529746, "Perez Bruno Mariana", true);
        
        clienteData.guardarCliente(cliente1);
        
        cliente1.setTelefono(1131899378);
        clienteData.modificarCliente(cliente1);
        
    }
    
}
