package com.joao.water;

import java.util.ArrayList;
import java.util.List;
import androidx.lifecycle.ViewModel;

public class AguaDiariaViewModel extends ViewModel {

    private AguaDiaria aguaDiaria;
    private List<CopoViewModel> copos;

    public AguaDiariaViewModel(int peso, int volumeCopo) {
        this.aguaDiaria = new AguaDiaria(peso, volumeCopo);
        this.copos = new ArrayList<>();
        for (Copo copo : aguaDiaria.getCopos()) {
            this.copos.add(new CopoViewModel(copo));
        }
    }

    public List<CopoViewModel> getCopos() {
        return copos;
    }

    public float litrosBebidosAteAgora() {
        float quantidadeBebida = 0;
        for (CopoViewModel copo : copos) {
            if (copo.isCheio()) {
                quantidadeBebida += copo.getVolume();
            }
        }
        return quantidadeBebida / 1000.0f; // Convert to liters
    }

    public float litrosFaltando() {
        float quantidadeFaltando = aguaDiaria.getVolumeTotal() - litrosBebidosAteAgora() * 1000;
        return Math.max(quantidadeFaltando, 0) / 1000.0f; // Garante que o valor não seja negativo
    }

    public int getPeso() {
        return aguaDiaria.getPeso();
    }

    public void reset() {
        aguaDiaria.reset();
        for (CopoViewModel copoViewModel : copos) {
            copoViewModel.desbeber();
        }
    }
}
