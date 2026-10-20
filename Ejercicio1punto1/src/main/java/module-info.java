module com.mycompany.ejercicio1punto1 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.ejercicio1punto1 to javafx.fxml;
    exports com.mycompany.ejercicio1punto1;
}
