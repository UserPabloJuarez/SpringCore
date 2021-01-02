package edu.cibertec.capitulo2.service;

import edu.cibertec.capitulo2.Imprimible;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ImpresoraService {

    @Autowired
    @Qualifier("documentoTextoBeanAnotation")
    private Imprimible documento;

    public ImpresoraService() {
    }
    
    public ImpresoraService(Imprimible documento) {
        this.documento = documento;
    }
    
    public Imprimible getDocumento() {
        return documento;
    }

    public void setDocumento(Imprimible documento) {
        this.documento = documento;
    }
    
    public void imprimirDocumento()
    {
        System.out.println(documento.imprimir());
    }
    
}
