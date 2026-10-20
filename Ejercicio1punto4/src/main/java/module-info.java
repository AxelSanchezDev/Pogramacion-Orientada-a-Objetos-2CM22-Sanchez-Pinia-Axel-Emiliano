module com.mycompany.ejercicio1punto4 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1punto4 to javafx.fxml;
    exports com.mycompany.ejercicio1punto4;
}
