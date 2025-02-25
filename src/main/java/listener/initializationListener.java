package listener;

import config.TemplateConfiguration;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import org.thymeleaf.TemplateEngine;

public class initializationListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext context = sce.getServletContext();

        TemplateEngine engine = TemplateConfiguration.getTemplateEngine();

    }
}
