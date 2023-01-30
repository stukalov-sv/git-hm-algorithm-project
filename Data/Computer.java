package Data;

import Data.Brands.Brand;

public abstract class Computer {
    Brand brand;
    double price;
    int ram;
    
    public Computer(Brand brand, double price, int ram) {
        this.brand = brand;
        this.price = price;
        this.ram = ram;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
