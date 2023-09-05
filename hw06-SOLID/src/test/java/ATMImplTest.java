import org.junit.jupiter.api.Test;
import ru.archipov.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static ru.archipov.Banknota.*;

public class ATMImplTest {

        @Test
    public void loadMoney() {

            Map<Integer, Cell> cells = new HashMap<>();
            cells.put(N_10.nominal, new Cell(10));
            cells.put(N_50.nominal, new Cell(50));
            cells.put(N_100.nominal, new Cell(100));
            cells.put(N_500.nominal, new Cell(500));
            cells.put(N_1000.nominal, new Cell(1000));
            cells.put(N_5000.nominal, new Cell(5000));

            Algorithm algorithm = new AlgorithmImpl();

            ATM atm = new ATMImpl(cells, algorithm);

            Banknota n_10 = N_10;
            Banknota n_50 = N_50;
            Banknota n_100 = N_100;
            Banknota n_500 = N_500;
            Banknota n_1000 = N_1000;
            Banknota n_5000 = N_5000;

            List<Banknota> banknotaList = new ArrayList<>();
            banknotaList.add(n_10);
            banknotaList.add(n_50);
            banknotaList.add(n_100);
            banknotaList.add(n_500);
            banknotaList.add(n_1000);
            banknotaList.add(n_5000);

        atm.loadMoney(banknotaList);
        assertEquals(6660, atm.getBalance());
        atm.getMoney(10);
        assertEquals(6650, atm.getBalance());
        atm.getMoney(5650);
        assertEquals(1000, atm.getBalance());
    }

    @Test
    public void getMoney() {

        Map<Integer, Cell> cells = new HashMap<>();
        cells.put(10, new Cell(10));
        cells.put(50, new Cell(50));
        cells.put(100, new Cell(100));
        cells.put(500, new Cell(500));
        cells.put(1000, new Cell(1000));
        cells.put(5000, new Cell(5000));

        Algorithm algorithm = new AlgorithmImpl();

        ATM atm = new ATMImpl(cells, algorithm);

        Banknota n_10 = N_10;
        Banknota n_50 = N_50;
        Banknota n_100 = N_100;
        Banknota n_500 = N_500;
        Banknota n_1000 = N_1000;
        Banknota n_5000 = N_5000;

        List<Banknota> banknotaList = new ArrayList<>();
        banknotaList.add(n_10);
        banknotaList.add(n_50);
        banknotaList.add(n_100);
        banknotaList.add(n_500);
        banknotaList.add(n_1000);
        banknotaList.add(n_5000);

        atm.loadMoney(banknotaList);
        atm.getMoney(10);
        assertEquals(6650, atm.getBalance());
        atm.getMoney(5650);
        assertEquals(1000, atm.getBalance());
    }
}
