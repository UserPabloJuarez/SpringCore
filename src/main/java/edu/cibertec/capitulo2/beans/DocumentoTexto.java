package edu.cibertec.capitulo2.beans;

import edu.cibertec.capitulo2.Imprimible;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("documentoTextoBeanAnotation")
public class DocumentoTexto implements Imprimible {

    public void iniciar()
    {
        System.out.println("iniciando la construcción del bean TEXTO!!!!!");
    }
    
    public void destruir()
    {
        System.out.println("destruyendo la instancia creada TEXTO!!!!!");
    }
    
    
    @Override
    public String imprimir() {
        String abc = null;
        abc.toLowerCase();
        return "Imprimiendo desde archivo de texto!";
    }
    
}
