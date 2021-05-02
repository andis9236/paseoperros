package com.umanizales.paseoperros.controller;

import com.umanizales.paseoperros.model.Empleado;
import com.umanizales.paseoperros.service.ListaSEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RequestMapping(path = "/capacitacion")
@Validated
@RestController
public class CapacitacionController

{
    private ListaSEService listaSEService;

    @Autowired
    public CapacitacionController(ListaSEService listaSEService)
    {
        this.listaSEService = listaSEService;
    }




    @GetMapping(path="/count")
    public int getCountEmployees()
    {
        return listaSEService.contarNodos();
    }

    @GetMapping(path="/listar")
    public String getTotalEmployees()
    {
        return listaSEService.listarNodos();
    }

    /* @GetMapping
    public Empleado getEmployee()
    {
        Empleado andis= new Empleado("Andis Andres Cardenas","56845613",
                1500000);
        return andis;
    }
    @GetMapping(path="/empleados")
    public Empleado[] getAllEmployees(){
        Empleado[] empleados= new Empleado[3];
        empleados[0]= new Empleado("Andis Cardenas","56845613",
                3500000);
        empleados[1]= new Empleado("Luisa Mora","105845816",
                1500000);
        empleados[2]= new Empleado("Maria Gonzalez","854651658",
                2500000);
        return empleados;
    }

    @PostMapping
    public Empleado crearEmpleado(@RequestBody Empleado employee)
    {
        employee.setSalario(employee.getSalario()*1.15);
        return employee;
    }

     */


}
