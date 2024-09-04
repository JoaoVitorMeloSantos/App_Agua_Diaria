package com.joao.water;

public class Copo {

    private float volume;
    private boolean cheio;

    public Copo(float volume) {
        this.volume = volume;
        this.cheio = true;
    }

    public void beber() {
        if (cheio) {
            cheio = false;
        } else {
            System.out.println("O copo já está vazio.");
        }
    }

    public void desbeber() {
        if (!cheio) {
            cheio = true;
        } else {
            System.out.println("O copo já está cheio.");
        }
    }

    public boolean isCheio() {
        return cheio;
    }

    public float getVolume() {
        return volume;
    }
}