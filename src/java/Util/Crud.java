/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

/**
 *2.
 * @author DELL
 */

//2.SE CREA EL CRUD Y SE DECLARAN LOS MÉTODOS QUE TODO EL SISTEMA VA A UTILIZAR
public interface Crud {
    
//    DEFINO LA PLANTILLA MÉTODO ABSTRACTOSD Y PUBLICO
    public abstract boolean agregarRegistro();
    public abstract boolean actualizarRegistro();
    public abstract boolean eliminarRegistro();
    
    
    
}
