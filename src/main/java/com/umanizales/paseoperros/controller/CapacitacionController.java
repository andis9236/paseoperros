package com.umanizales.paseoperros.controller;

import com.umanizales.paseoperros.model.Empleado;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/capacitacion")
@Validated
@RestController
public class CapacitacionController
{
    @GetMapping
    public Empleado getEmployee()
    {
        Empleado orozco= new Empleado("Andrés Orozco","1053478965",
                3500000);
        return orozco;
    }
    @GetMapping(path="/empleados")
    public Empleado[] getAllEmployees(){
        Empleado[] empleados= new Empleado[3];
        empleados[0]= new Empleado("Andrés Orozco","1053478965",
                3500000);
        empleados[1]= new Empleado("Carlos Loaiza","75147569",
                1500000);
        empleados[2]= new Empleado("Camila Castaño","24987547",
                2500000);
        return empleados;
    }
    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado employee)
    {
        employee.setSalario(employee.getSalario()*1.15);
        return employee;
    }
}
