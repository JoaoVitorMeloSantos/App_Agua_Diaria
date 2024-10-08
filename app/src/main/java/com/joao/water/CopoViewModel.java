package com.joao.water;

public class CopoViewModel {

    private final Copo copo;
    private boolean isCheio;

    public CopoViewModel(Copo copo) {
        this.copo = copo;
        this.isCheio = copo.isCheio(); // Inicializa o estado com base no copo
    }

    public void beber() {
        if (!isCheio) {
            isCheio = true;
        }
    }

    public void desbeber() {
        if (isCheio) {
            isCheio = false;
        }
    }

    public boolean isCheio() {
        return isCheio;
    }

    public int getVolume() {
        return copo.getVolume();
    }
}


