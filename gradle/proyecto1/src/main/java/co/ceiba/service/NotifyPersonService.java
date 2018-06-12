package co.ceiba.service;
public class NotifyPersonService {
 private EmailService emailService;
 
 public NotifyPersonService(EmailService emailService){
	 	this.emailService= emailService;
 }
 
 public String notify(co.ceiba.domain.Person person){
	 String message = "Welcome" + person.getName();
	 return emailService.sendMail(message);
 }
}
