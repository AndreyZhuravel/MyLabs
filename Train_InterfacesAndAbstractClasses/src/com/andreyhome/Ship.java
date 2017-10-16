package com.andreyhome;

class Ship extends Vechile {
    @Override
    public int getActualspeed(int flow) {
        return speed - flow;
    }
}
