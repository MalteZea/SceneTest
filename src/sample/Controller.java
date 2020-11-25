package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;

public class Controller {
    @FXML
    TextArea textFelt2;

    public void visNoget() {
        //System.out.println("Knap er klikket.");
        textFelt2.appendText("HUrra! Det virker!\n");
    }
}
