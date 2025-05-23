module Beto {
    requires javafx.controls;
    requires javafx.fxml;

    exports beto;
    opens beto to javafx.fxml;
}
