package edu.cibertec.capitulo2.service;

import org.aspectj.lang.JoinPoint;

public class AuditoriaAOP {

    public void antesAdvice(JoinPoint jp)
    {
        System.out.println("Auditoría ANTES del método "+jp.getSignature());
    }

    public void despuesAdvice(JoinPoint jp)
    {
        System.out.println("Auditoría DESPUÉS del método "+jp.getSignature());
    }

    public void despuesExcepcion(JoinPoint jp)
    {
        System.out.println("Auditoría DESPUÉS de excepción "+jp.getSignature());
    }
    
}
