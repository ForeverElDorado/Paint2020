/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo.formas;


import java.awt.Color;
import java.awt.image.BufferedImage;
/**
 *
 * @author fabio
 */
public class Pipeta {
    public int x = 0;
    public int y = 0;
    public Pipeta (int posX, int posY, BufferedImage buffer){
        this.x = posX;
        this.y = posY;
    }
    public Color copiarColor(int posX, int posY, BufferedImage buffer, Color color) {
        color = new Color(buffer.getRGB(posX, posY));
        //buffer.getRGB sirve para seleccionar el color del pixel
        return color;
    }
}
