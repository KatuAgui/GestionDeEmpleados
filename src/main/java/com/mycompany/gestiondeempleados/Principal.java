
package com.mycompany.gestiondeempleados;


public class Principal {
    public static void main(String[] args) {
        EmpleadoTiempoCompleto nuevo = new EmpleadoTiempoCompleto("Lucia",23,2000,20);
        EmpleadoTiempoParcial parcial = new EmpleadoTiempoParcial("Maria", 24,0,180);
        //String nombre = "Katia";
        
        Empleado[] empleados = {nuevo, parcial};
        
        for(Empleado empleado : empleados){
            System.out.println("Nombre: " + empleado.getNombre());
            System.out.println("Edad: " + empleado.getEdad());
            System.out.println("Salario: " + empleado.calcularSalario());
            System.out.println("------------------------------");
        }
        
    
    }
    
    
}
