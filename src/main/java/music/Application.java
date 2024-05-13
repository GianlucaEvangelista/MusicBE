package music;

import music.app.AppController;
import music.config.AppConfiguration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "music")
public class Application implements ApplicationRunner {

    private final AppController appController;

    @Autowired
    public Application(AppController appController) {
        this.appController = appController;
    }

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(AppConfiguration.class);
        app.run(args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        appController.startApp();
    }
}
