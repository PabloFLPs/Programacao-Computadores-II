/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formas;

/**
 *
 * @author FELPs
 */
public class NaoExisteVolumeException extends Exception{

    public NaoExisteVolumeException() {
        super("Tal forma nao possui volume.");
    }
    
}
