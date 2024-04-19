package anna.colortrianglesjavafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

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
    @FXML
    Rectangle reckt;

    public void loadFile() throws FileNotFoundException {
        String fname = field1.getText();
        List<ColorRecktangle> colorRecktangles = ColorRecktangle.readFile(fname);
        for (int i = 0; i < colorRecktangles.size(); i++) {
            ColorRecktangle r = colorRecktangles.get(i);
            Paint p = new Paint();
            Rectangle rect = new Rectangle(r.getLength(),r.getWidth(),);
            vboxForRecktangle.getChildren().add(rect);
        }

    }
}