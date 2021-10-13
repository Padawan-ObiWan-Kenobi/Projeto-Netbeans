
package ModeloBeans;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class EnviarEmail {
    
    public static void main(String[] args) {
        
        String meuEmail = "joaoelias.reis@outlook.com";
        String minhaSenha = "";
        
        SimpleEmail email = new SimpleEmail();
        email.setHostName("smtp-mail.outlook.com");
        email.setSmtpPort(587);
        email.setAuthenticator(new DefaultAuthenticator(meuEmail, minhaSenha));
        email.setSSLOnConnect(true);
        
        try {
            email.setFrom(meuEmail);
            email.setSubject("Reset de Senha");
            email.setMsg("Testando o envio de e-mail atraves do java");
            email.addTo(meuEmail);
            email.send();
            System.out.println("E-mail foi enviado com sucesso!");
            
        } catch (EmailException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possivel enviar seu email");
        }
        
        
        
    }
    
}
