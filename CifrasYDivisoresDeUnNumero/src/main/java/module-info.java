module com.danielamar.cifrasydivisoresdeunnumero {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.danielamar.cifrasydivisoresdeunnumero to javafx.fxml;
    exports com.danielamar.cifrasydivisoresdeunnumero;
}
