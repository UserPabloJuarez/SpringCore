package edu.cibertec.capitulo2;

import edu.cibertec.capitulo2.beans.HolaMundo;
import edu.cibertec.capitulo2.service.ImpresoraService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Ejecutora {

    public static void main(String[] args) {
        ApplicationContext appContext = new ClassPathXmlApplicationContext("beans.xml");
        //ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);
        HolaMundo hm = (HolaMundo)appContext.getBean("holaMundoBean");
        System.out.println(hm.getSaludo());
        HolaMundo hm2 = (HolaMundo)appContext.getBean("holaMundoBean");
        System.out.println(hm2.getSaludo());
        hm2.setSaludo("Segundo saludo");
        System.out.println(hm2.getSaludo());
        System.out.println("---- posiciones de memoria ----");
        System.out.println(hm+" - "+hm2);
        System.out.println("El valor del saludo 1 es "+hm.getSaludo());
        
        ImpresoraService is = (ImpresoraService)appContext.getBean("impresoraServiceBean");
        is.imprimirDocumento();
        
        ((ConfigurableApplicationContext)appContext).close();
    }
    
    
}
