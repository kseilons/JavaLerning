module kseilons.batton2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kseilons.batton2 to javafx.fxml;
    exports kseilons.batton2;
}