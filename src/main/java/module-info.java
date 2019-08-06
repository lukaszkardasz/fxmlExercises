module fxmlExercises {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    exports pl.n2god.mvc to javafx.graphics;
    opens pl.n2god.mvc to javafx.fxml; //refleksja i dostęp do prywatnych pól obietków
}