package com.mycompany.gestiondeempleados;

/*
Ejercicio de Programación en Java: Sistema de Gestión de Empleados
Descripción:
Implementa un sistema de gestión de empleados en Java que utilice los conceptos de
herencia, polimorfismo, encapsulamiento y abstracción. Deberás definir una clase 
abstracta Empleado que encapsule los atributos comunes a todos los empleados, como
el nombre, la edad y el salario. Además, la clase Empleado deberá tener un método
abstracto calcularSalario() que deberá ser implementado por las clases concretas
que hereden de ella.
Crea dos clases concretas que hereden de Empleado: EmpleadoTiempoCompleto y
EmpleadoTiempoParcial. La clase EmpleadoTiempoCompleto representará a un empleado
a tiempo completo y deberá tener un atributo adicional para almacenar las horas
trabajadas. La clase EmpleadoTiempoParcial representará a un empleado a tiempo parcial
y deberá tener un atributo para almacenar las horas trabajadas también.
Implementa el método calcularSalario() en ambas clases concretas de acuerdo con
las siguientes reglas:
1.Para un empleado a tiempo completo, el salario se calculará sumando el salario
base más el pago por horas trabajadas.
2.Para un empleado a tiempo parcial, el salario se calculará multiplicando las horas
trabajadas por una tarifa por hora.
Finalmente, en la función main(), crea instancias de ambas clases utilizando 
polimorfismo y guárdalas en un array de tipo Empleado. Luego, recorre el array 
e imprime la información de cada empleado, incluyendo su nombre, edad y salario.


*/
abstract class Empleado {
    private String nombre;
    private int edad;
    private double salario;
    
    public Empleado() {
    }
    
    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //Retornar nombre
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
    public double getSalario() {
        return salario;
    }
    //Agg metodo abstracto
    public abstract double calcularSalario();
    
    
    
}
