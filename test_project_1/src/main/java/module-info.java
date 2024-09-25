module com.firstprogrampawel.test_project_1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.firstprogrampawel.test_project_1 to javafx.fxml;
    exports com.firstprogrampawel.test_project_1;
}