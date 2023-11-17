package com.proyecto.practicas.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.proyecto.practicas.models.Usuario;
import com.proyecto.practicas.services.UserService;

import jakarta.validation.Valid;

@Controller
@RequestMapping(value = "/tecnopracticas")
public class AuthController {
	
    private static final String urlFormularioLogin="Formularios/Login/Login";
    private static final String urlFormularioSingUP="Formularios/Register/Register";
    private static final String urlRedirectCarreras="redirect:/tecnopracticas/programas";
    
	

    @GetMapping(value = "/login")
    public String getFormLogin(){

        return urlFormularioLogin;
    }


    @GetMapping(value = "/singup")
    public String getFormSingUp(){

        return urlFormularioSingUP;
    }


    @PostMapping(value = "/login/auth")
    public String authenticated() {
    	
    	return urlRedirectCarreras;
    }
	
    
    @PostMapping()
    public String crearCuenta(@Valid Usuario usuario,BindingResult bindingResult,Model model) {
		
		
    	return null;
    }
    
    
    
    @Autowired
    private UserService userService;
}
