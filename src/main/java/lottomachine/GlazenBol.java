package lottomachine;

import java.util.ArrayList;
import java.util.Random;

public class GlazenBol {
    private ArrayList<Lottobal> ballen = new ArrayList<Lottobal>();

    public GlazenBol() {
        for (int i = 0; i < 45; i++) {
            ballen.add(new Lottobal(i + 1));
        }
    }

    public GlazenBol(int capaciteit) {
        for (int i = 0; i < capaciteit; i++) {
            ballen.add(new Lottobal(i + 1));
        }
    }

    public Lottobal schepBal() {
        Random r = new Random();
        int willekeurig = r.nextInt(ballen.size());
        Lottobal bal = ballen.get(willekeurig);
        ballen.remove(bal);
        return bal;
    }
}
