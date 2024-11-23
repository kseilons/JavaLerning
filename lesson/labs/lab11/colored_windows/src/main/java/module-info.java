module kseilons.colored_windows {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.media;


    opens kseilons.colored_windows to javafx.fxml;
    exports kseilons.colored_windows;
    exports goaltest;
    exports housings;
}