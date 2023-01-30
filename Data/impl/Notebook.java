package Data.impl;
import Data.Computer;
import Data.Brands.Brand;

public class Notebook extends Computer{

    public Notebook(Brand brand, double price, int ram) {
        super(brand, price, ram);
    }

    @Override
    public String toString() {

        return "Notebook{" + getBrand() + " " + getRam() + " " + getPrice() + "}";
    }
}
