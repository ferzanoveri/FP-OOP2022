/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package snakegame;

import java.util.Random;
import javax.swing.Timer;

/**
 *
 * @author ferzanoveri
 */
public abstract interface GameInterface { //Abstract & Interface
    static final int SCREEN_WIDTH = 600;
    static final int SCREEN_HEIGHT = 600;
    static final int UNIT_SIZE = 25;
    static final int GAME_UNITS = (int) ((double)(SCREEN_WIDTH*SCREEN_HEIGHT)/UNIT_SIZE);//Casting / Convertion
    static final int DELAY = 75;
}
