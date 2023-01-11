module com.example.calculjavafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculjavafx to javafx.fxml;
    exports com.example.calculjavafx;
}