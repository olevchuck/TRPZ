module de.javaakademie.cb.gui {
    requires de.javaakademie.cb.api;

    requires javafx.base;
    requires javafx.graphics;
    requires javafx.controls;
    requires javafx.fxml;
    uses de.javaakademie.cb.api.ConferenceService;    
}