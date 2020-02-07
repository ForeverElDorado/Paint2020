/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;

import java.awt.Color;

/**
 *
 * @author Guille López
 */
//al poner el codigo igual que en las formas regulares simplemente tenemos que ampliar el numero
//de lados para que parezca un circulo
public class Circulo extends Forma{
     public Circulo(int _posX, int _posY, int _lados, Color _color, boolean _relleno) {
        super(_posX, _posY, _lados, _color, _relleno);
    }
}
