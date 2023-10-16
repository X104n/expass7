module com.example.expass7 {
    requires javafx.controls;
    requires javafx.fxml;
    requires com.rabbitmq.client;


    opens com.example.expass7 to javafx.fxml;
    exports com.example.expass7;
}