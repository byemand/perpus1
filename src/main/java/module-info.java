module com.example.perpus1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.perpus1 to javafx.fxml;
    exports com.example.perpus1;
}