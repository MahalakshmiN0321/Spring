package App.beans;

import org.springframework.context.MessageSource;

import java.util.Locale;

public class I18NBean {
    private MessageSource messageSource;

    public void setMessageSource(MessageSource messageSource) {
        this.messageSource = messageSource;
    }

    public void DisplayMessage() {
        Locale l=new Locale("en","US");
        System.out.println("Message : " + messageSource.getMessage("welcome",new Object[]{"en","US"},Locale.ENGLISH));
    }
}
