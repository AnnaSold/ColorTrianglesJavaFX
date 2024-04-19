package anna.colortrianglesjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import java.io.FileNotFoundException;
import java.util.List;

public class HelloController {
    @FXML
    Button but1;

    @FXML
    Label lab1;
    @FXML
    TextField field1;
    @FXML
    VBox vboxForRecktangle;

    public void loadFile() throws FileNotFoundException {
        String fname = field1.getText();
        List<ColorRecktangle> colorRecktangles = ColorRecktangle.readFile(fname);
        for (int i = 0; i < colorRecktangles.size(); i++) {

            vboxForRecktangle.getChildren().add(colorRecktangles.get(i));
        }

    }
}