module com.mycompany.agar {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mycompany.agar to javafx.fxml;
    exports com.mycompany.agar;
}
