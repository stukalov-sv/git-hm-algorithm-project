package Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Data.Brands.Brand;
import Data.impl.Notebook;
import Service.RandomizeService;
import Service.impl.NotebookPrintingService;
import Service.impl.NotebookSortingService;

public class ComputerController {
    
    private NotebookSortingService notebookSortingService;
    private NotebookPrintingService notebookPrintingService;

    
    public ComputerController() {
        this.notebookSortingService = new NotebookSortingService();
        this.notebookPrintingService = new NotebookPrintingService();
    }

    public void startButton(List<Notebook> notebookList) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("\nChoose action:\n" +
            "1 - get notebooks base info\n" +
            "2 - get sorted notebook base info\n");

        int action = iScanner.nextInt();

        switch (action) {
            case 1:
                notebookPrintingService.printLogs(notebookList);
                break;
            case 2:
                notebookPrintingService.printLogs(notebookSortingService.getSorted(notebookList));
                break;
            default:
                System.out.println("Incorrect data");
                break;
        }
        iScanner.close();
    }

    public List<Notebook> notebookListCreation() {
        Double[] prices = new Double[]{100.0, 200.0, 300.0, 400.0, 500.0, 600.0, 700.0, 800.0};
        Integer[] rams = new Integer[]{4, 8, 16, 20, 24, 28, 32};
        Brand[] brands = Brand.values();
        List<Notebook> notebookList = new ArrayList<>();
        RandomizeService randomiser = new RandomizeService();

        for (int i = 0; i < 10000; i++) {
            Notebook notebook = new Notebook(randomiser.getRandomValue(brands), 
                                                randomiser.<Double>getRandomValue(prices), 
                                                randomiser.<Integer>getRandomValue(rams));
            notebookList.add(notebook);
        }

        return notebookList;
    }
}