module com.mycompany.ejercicio1punto3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1punto3 to javafx.fxml;
    exports com.mycompany.ejercicio1punto3;
}
