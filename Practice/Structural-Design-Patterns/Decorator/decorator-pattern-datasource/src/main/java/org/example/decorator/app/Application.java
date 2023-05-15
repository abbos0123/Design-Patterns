package org.example.decorator.app;

public class Application {
    private ApplicationConfigurator applicationConfigurator;
    private boolean enableEncryption = true;
    private boolean enableCompression = true;

    public Application(ApplicationConfigurator applicationConfigurator) {
        this.applicationConfigurator = applicationConfigurator;
    }

    public void work() {
        applicationConfigurator.configure(enableEncryption, enableCompression);
    }
}
