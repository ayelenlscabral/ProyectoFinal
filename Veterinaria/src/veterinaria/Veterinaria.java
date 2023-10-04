package veterinaria;

import veterinaria.AccesoADatos.ClienteData;
import veterinaria.Entidades.Cliente;

public class Veterinaria {

    public static void main(String[] args) {
        ClienteData clienteData = new ClienteData();
        
        Cliente cliente1 = new Cliente(25145267, "Bocalon", "Ernesto", "15 y 93", 2214811399L, "Perez Bruno Mariana", true);
        
        clienteData.guardarCliente(cliente1);
        
        System.out.println("el nuevo cliente: " + cliente1);
    //   cliente1.setTelefono(1131899378);
    //    clienteData.modificarCliente(cliente1);
        
    }
    
}
