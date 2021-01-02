package edu.cibertec.capitulo2.beans;

import edu.cibertec.capitulo2.Imprimible;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("documentoExcelBean")
public class DocumentoExcel implements Imprimible {

    public void iniciar()
    {
        System.out.println("iniciando la construcción del bean");
    }
    
    public void destruir()
    {
        System.out.println("destruyendo la instancia creada");
    }
    
    
    @Override
    public String imprimir() {
        String abc = null;
        abc.toCharArray();
        return "Imprimiendo desde archivo EXCEL!";
    }
    
}
