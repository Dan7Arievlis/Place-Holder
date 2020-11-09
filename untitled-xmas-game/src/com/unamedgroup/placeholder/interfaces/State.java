package com.unamedgroup.placeholder.interfaces;

import java.awt.Graphics;


/**
 * Interface com os metodos necess�rios para implementar todo um state
 * @author Nathan
 */
public interface State {
    
    void init();
    void tick();
    void render(Graphics g);

}
