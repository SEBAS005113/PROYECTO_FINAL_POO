package co.edu.udistrital.entity;


	import java.io.FileInputStream;
	import java.io.IOException;
	import java.io.InputStream;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.net.Authenticator;
import java.net.PasswordAuthentication;
import java.security.InvalidParameterException;
	import java.util.Properties;
	import javax.mail.Message;
	import javax.mail.MessagingException;
import javax.mail.NoSuchProviderException;
import javax.mail.Session;
	import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
	import javax.mail.internet.MimeMessage;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

	public class EnvioCorreos extends JFrame {

		private static String emailFrom = "vanoyortizj@gmail.com";
	    private static String passwordFrom = "rrvtlhargrwyngcp";
	    private String emailTo;
	    private String subject;
	    private String content;

	    private Properties mProperties;
	    private Session mSession;
	    private MimeMessage mCorreo;
	    
	    public EnvioCorreos() {
			mProperties=new Properties();
			crearCorreo();
			enviarCorreo();
		}
	    
	    private void crearCorreo() {
	    	emailTo = "vanoyortizj@gmail.com";
	        subject = "Prueba";
	        content = "Este es un mensaje de prueba";
	        
	         // Simple mail transfer protocol
	        mProperties.put("mail.smtp.host", "smtp.gmail.com");
	        mProperties.put("mail.smtp.ssl.trust", "smtp.gmail.com");
	        mProperties.setProperty("mail.smtp.starttls.enable", "true");
	        mProperties.setProperty("mail.smtp.port", "587");
	        mProperties.setProperty("mail.smtp.user",emailFrom);
	        mProperties.setProperty("mail.smtp.ssl.protocols", "TLSv1.2");
	        mProperties.setProperty("mail.smtp.auth", "true");
	        
	        mSession = Session.getDefaultInstance(mProperties);
	        
	        try {
	            mCorreo = new MimeMessage(mSession);
	            mCorreo.setFrom(new InternetAddress(emailFrom));
	            mCorreo.setRecipient(Message.RecipientType.TO, new InternetAddress(emailTo));
	            mCorreo.setSubject(subject);
	            mCorreo.setText(content, "ISO-8859-1", "html");
	                     
	            
	        } catch (AddressException ex) {
	            ex.printStackTrace();
	        } catch (MessagingException ex) {
	        	ex.printStackTrace();
	        }
	                     
	            
	        
	    }
	    private void enviarCorreo() {
	    	
	            Transport mTransport;
				try {
					mTransport = mSession.getTransport("smtp");
					mTransport.connect(emailFrom, passwordFrom);
					mTransport.sendMessage(mCorreo, mCorreo.getRecipients(Message.RecipientType.TO));
					mTransport.close();
					System.out.println("Correo enviado");
				} catch (NoSuchProviderException e) {
					e.printStackTrace();
				}
					
				catch (MessagingException e) {
					e.printStackTrace();
				}

	    
	    }
	    
	}
	
