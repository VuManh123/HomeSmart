module com.example.project {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    requires java.sql;
    // requires mysql.connector.java;


    opens com.example.project to javafx.fxml;
    exports com.example.project;
}