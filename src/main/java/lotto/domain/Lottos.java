package lotto.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lottos {

    private List<Lotto> lottos;

    public Lottos() {
        this.lottos = new ArrayList<>();
    }

    public Lottos(List<Lotto> lottos) {
        this.lottos = lottos;
    }

    public List<Lotto> createLottos(int count, NumberStrategy numberStrategy) {
        for (int i = 0; i < count; i++) {
            this.lottos.add(Lotto.createFromNumbers(numberStrategy.generateNumber()));
        }
        return this.lottos;
    }


    public List<Lotto> getAllLotto() {
        return this.lottos;
    }

    public int size() {
        return this.lottos.size();
    }
}