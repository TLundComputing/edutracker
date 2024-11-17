module edutracker {
    requires javafx.controls;
    requires javafx.fxml;
    
    opens io.github.tlundcomputing to javafx.fxml;
    exports io.github.tlundcomputing;
}