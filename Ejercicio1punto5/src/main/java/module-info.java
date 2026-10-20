module com.mycompany.ejercicio1punto5 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1punto5 to javafx.fxml;
    exports com.mycompany.ejercicio1punto5;
}
