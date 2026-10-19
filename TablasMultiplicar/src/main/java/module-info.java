module com.danielamar.tablasmultiplicar {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.tablasmultiplicar to javafx.fxml;
    exports com.danielamar.tablasmultiplicar;
}
