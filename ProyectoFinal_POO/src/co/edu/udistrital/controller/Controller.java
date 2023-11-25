package co.edu.udistrital.controller;

import co.edu.udistrital.entity.*;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.security.InvalidParameterException;

import javax.mail.MessagingException;

public class Controller {
	private EnvioCorreos envioCorreos;
	
	public Controller() {

		envioCorreos=new EnvioCorreos();
	}
}
