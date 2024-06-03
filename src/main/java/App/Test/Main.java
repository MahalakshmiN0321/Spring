package App.Test;

import App.beans.I18NBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        I18NBean i18NBean=(I18NBean) context.getBean("i18nbean");
        i18NBean.DisplayMessage();
    }
}
