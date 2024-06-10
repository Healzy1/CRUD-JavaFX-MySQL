module com.mycompany.crudtesla {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires java.sql;
    opens com.mycompany.crudtesla to javafx.fxml;
    exports com.mycompany.crudtesla;
    exports com.mycompany.crudtesla.model;
}
