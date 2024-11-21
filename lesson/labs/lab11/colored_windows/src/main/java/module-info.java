module kseilons.colored_windows {
    requires javafx.controls;
    requires javafx.fxml;


    opens kseilons.colored_windows to javafx.fxml;
    exports kseilons.colored_windows;
}