package com.ceatformacion.empleados.controller;

import com.ceatformacion.empleados.controller.modell.Empleados;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.ArrayList;

@Controller
/*este archivo con el @Controller lo estamos declarando que es el que maneja todo entre el front y el backend*/

public class EmpleadosController {
    private static final ArrayList<Empleados> empleados= new ArrayList<>();
    @GetMapping("/")//llama el archivo que esta funcion nombra con lo indicado en el parentesis que le sigue
    public String llamarIndex(Model model) {
        model.addAttribute("empleado", new Empleados());
        model.addAttribute("puestos", Empleados.Puesto.values());
        return "index";//llama el archivo de la vista con el nombre index, y muestramelo...

    }
    @GetMapping("/empleados/guardar")
    public String guardarEmpleado(@ModelAttribute Empleados empleado, Model model) {
    //agregar ese empleado a una coleccion
        empleados.add(empleado);
        model.addAttribute("empleado", empleado);
        return ("crud");
    }



}
