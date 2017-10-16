package com.andreyhome;

class Submarine extends Vechile {
    @Override
    public int getActualspeed(int flow) {
        return (int) (speed * 0.3) - flow;
    }
}
