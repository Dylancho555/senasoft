/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Resgistrar;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author SENA
 */
@WebService(serviceName = "Registrarmedico")
public class Registrarmedico {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }

    /**
     * Web service operation
     */
    @WebMethod(operationName = "operation")
    public Boolean operation(@WebParam(name = "idtipodedocumento") String idtipodedocumento, @WebParam(name = "idrol") String idrol, @WebParam(name = "nombre") String nombre, @WebParam(name = "apellido") String apellido, @WebParam(name = "telefono") String telefono, @WebParam(name = "numerodedocumento") String numerodedocumento, @WebParam(name = "direccion") String direccion, @WebParam(name = "correo") String correo, @WebParam(name = "fechadenacimineto") String fechadenacimineto, @WebParam(name = "clave") String clave) {
        //TODO write your implementation code here:
        
        
       
        return null;
    }
}
