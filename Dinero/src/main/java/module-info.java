module com.danielamar.dinero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.dinero to javafx.fxml;
    exports com.danielamar.dinero;
}
