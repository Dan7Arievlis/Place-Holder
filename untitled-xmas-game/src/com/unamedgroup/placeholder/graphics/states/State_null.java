package com.unamedgroup.placeholder.graphics.states;

import java.awt.Graphics;

import com.unamedgroup.placeholder.interfaces.State;
import com.unamedgroup.placeholder.main.StateManager;

// Uso esse State para instanciar a classe player em game
// Ele � instanciado ao trocar de state
// Esse state s� � usado para trocar de state
public class State_null implements State {
    public static int ID;

    public State_null(int id){
        this.ID = id;
        StateManager.setState(1);
    }

    @Override
    public void init() {
        // TODO Auto-generated method stub

    }

    @Override
    public void tick() {
        // TODO Auto-generated method stub

    }

    @Override
    public void render(Graphics g) {
        // TODO Auto-generated method stub

    }
    
}
