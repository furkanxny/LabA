module com.mycompany.module5lab.bjavafxml {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.module5lab.bjavafxml to javafx.fxml;
    exports com.mycompany.module5lab.bjavafxml;
}
