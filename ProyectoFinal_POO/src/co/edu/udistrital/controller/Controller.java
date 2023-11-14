package co.edu.udistrital.controller;

import co.edu.udistrital.entity.*;
import java.io.IOException;
import java.security.InvalidParameterException;

import javax.mail.MessagingException;

public class Controller {
	
	
	public Controller() {
		// TODO Auto-generated constructor stub
		try {
            EnvioEmail m = new EnvioEmail("co.edu.udistrital.entity/EnvioEmail.init");

            m.enviarEmail("Test", "Hola mundo", "administrador@discoduroderoer.es");
            
            String correos[] = {"administrador@discoduroderoer.es", "pikao3000@gmail.com"};
            
            m.enviarEmail("Test", "Hola mundo", correos);

            System.out.println("Se ha enviado!!");
        } catch (InvalidParameterException | IOException | MessagingException ex) {
            System.out.println(ex.getMessage());
        }
	}
}
