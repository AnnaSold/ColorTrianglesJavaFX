module anna.colortrianglesjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens anna.colortrianglesjavafx to javafx.fxml;
    exports anna.colortrianglesjavafx;
}