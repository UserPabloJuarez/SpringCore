package edu.cibertec.capitulo2.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("holaMundoBean")
public class HolaMundo {
    
    @Value("Hola mundo desde anotaciones!")
    private String saludo;

    public String getSaludo() {
        return saludo;
    }

    public void setSaludo(String saludo) {
        this.saludo = saludo;
    }
    
}
