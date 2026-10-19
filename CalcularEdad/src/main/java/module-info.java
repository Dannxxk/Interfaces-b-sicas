module com.danielamar.calcularedad {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.calcularedad to javafx.fxml;
    exports com.danielamar.calcularedad;
}
