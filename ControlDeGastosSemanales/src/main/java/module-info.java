module com.danielamar.controldegastossemanales {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.controldegastossemanales to javafx.fxml;
    exports com.danielamar.controldegastossemanales;
}
