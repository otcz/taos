package TaosBackend.Taos.Controller;

import javax.mail.*;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

public class EnviarSOATGmail {


    private String sDestinatario, sAsunto, sCuerpo;
    public static String sCorreoQueEnvia = "soportearmamentomayor@gmail.com";
    private String sClaveCorreoQueEnvia = "Tecnica2020**";



    public EnviarSOATGmail(String sDestinatario, String sAsunto, String sCuerpo) {

        this.sDestinatario = sDestinatario;
        this.sAsunto = sAsunto;
        this.sCuerpo = sCuerpo;


    }

    public boolean enviarCorreo() {

        try {
            Properties props = new Properties();
            props.setProperty("mail.smtp.host", "smtp.gmail.com");
            props.setProperty("mail.smtp.starttls.enable", "true");
            props.setProperty("mail.smtp.port", "587");
            props.setProperty("mail.smtp.auth", "true");



            Session session = Session.getDefaultInstance(props);
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(getsCorreoQueEnvia()));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(getsDestinatario()));
            message.setSubject(getsAsunto());
            message.setText(getsCuerpo(), "ISO-8859-1", "html");

            Transport t = session.getTransport("smtp");
            t.connect(getsCorreoQueEnvia(), getsClaveCorreoQueEnvia());
            t.sendMessage(message, message.getRecipients(Message.RecipientType.TO));
            t.close();


        } catch (AddressException ex) {

        } catch (MessagingException ex) {
            ex.printStackTrace();
        }


        return true;

    }

    public String getsDestinatario() {
        return sDestinatario;
    }

    public void setsDestinatario(String sDestinatario) {
        this.sDestinatario = sDestinatario;
    }

    public String getsAsunto() {
        return sAsunto;
    }

    public void setsAsunto(String sAsunto) {
        this.sAsunto = sAsunto;
    }

    public String getsCuerpo() {
        return sCuerpo;
    }

    public void setsCuerpo(String sCuerpo) {
        this.sCuerpo = sCuerpo;
    }

    public String getsCorreoQueEnvia() {
        return sCorreoQueEnvia;
    }

    public void setsCorreoQueEnvia(String sCorreoQueEnvia) {
        this.sCorreoQueEnvia = sCorreoQueEnvia;
    }

    public String getsClaveCorreoQueEnvia() {
        return sClaveCorreoQueEnvia;
    }

    public void setsClaveCorreoQueEnvia(String sClaveCorreoQueEnvia) {
        this.sClaveCorreoQueEnvia = sClaveCorreoQueEnvia;
    }
}
