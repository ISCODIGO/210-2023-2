module com.example.cap6_demo {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens com.example.cap6_demo to javafx.fxml;
    exports com.example.cap6_demo;
}