package Service;
import java.util.Comparator;

import Data.Computer;

public class ComputerComparator implements Comparator<Computer> {
    @Override
    public int compare(Computer computer1, Computer computer2) {
        if (computer1.getPrice() > computer2.getPrice())
            return 1;
        else if (computer1.getPrice() < computer2.getPrice())
            return -1;
        else {
            if (computer1.getRam() > computer2.getRam())
                return 1;
            else if (computer1.getRam() < computer2.getRam())
                return -1;
            else {
                if (computer1.getBrand().ordinal() > computer2.getBrand().ordinal())
                    return 1;
                else if (computer1.getBrand().ordinal() < computer2.getBrand().ordinal())
                    return -1;
                else return 0;
            }
        }
    }
}
