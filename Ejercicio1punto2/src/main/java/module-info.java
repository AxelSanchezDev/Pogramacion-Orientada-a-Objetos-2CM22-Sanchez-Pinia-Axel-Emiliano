module com.mycompany.ejercicio1punto2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1punto2 to javafx.fxml;
    exports com.mycompany.ejercicio1punto2;
}
