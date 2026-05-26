module org.olmix.contriartfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.olmix.contriartfx to javafx.fxml;
    exports org.olmix.contriartfx;
}