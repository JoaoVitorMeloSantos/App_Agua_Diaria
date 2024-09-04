package com.joao.water;

import java.util.ArrayList;
import java.util.List;

public class AguaDiaria {

    private List<Copo> copos;
    private float litrosNecessarios;

    public AguaDiaria(float peso, float volumeCopo) {
        float mililitrosNecessarios = peso * 35;
        this.litrosNecessarios = mililitrosNecessarios / 1000;

        int numCopos = (int) Math.ceil(litrosNecessarios / volumeCopo);
        copos = new ArrayList<>();

        for (int i = 0; i < numCopos; i++) {
            copos.add(new Copo(volumeCopo));
        }
    }

    public List<Copo> getCopos() {
        return copos;
    }

    public float litrosBebidosAteAgora() {
        float litrosBebidos = 0;
        for (Copo copo : copos) {
            if (!copo.isCheio()) {
                litrosBebidos += copo.getVolume();
            }
        }
        return litrosBebidos;
    }

    public List<Copo> getCoposFaltando() {
        List<Copo> coposFaltando = new ArrayList<>();
        for (Copo copo : copos) {
            if (copo.isCheio()) {
                coposFaltando.add(copo);
            }
        }
        return coposFaltando;
    }
}
