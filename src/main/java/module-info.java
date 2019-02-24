module fxapp {
    requires java.base;
    requires java.logging;

    requires transitive javafx.base;
    requires transitive javafx.graphics;
    requires transitive javafx.controls;

    exports fxapp;
}
