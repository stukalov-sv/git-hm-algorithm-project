import java.util.ArrayList;
import java.util.List;

import Controller.ComputerController;
import Data.impl.Notebook;

public class Main {
    public static void main(String[] args) {
        ComputerController controller = new ComputerController();
        List<Notebook> notebookList = new ArrayList<Notebook>(controller.notebookListCreation());

        controller.startButton(notebookList);
    }
}