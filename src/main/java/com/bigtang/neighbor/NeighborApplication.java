package com.bigtang.neighbor;

import javafx.application.Application;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.Environment;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Slf4j
@SpringBootApplication
public class NeighborApplication {
    public static void main(String[] args) throws UnknownHostException {
        ConfigurableApplicationContext application = SpringApplication.run(NeighborApplication.class, args);
        Environment env = application.getEnvironment();
        String port = env.getProperty("server.port");
        String appName = env.getProperty("spring.application.name");
        String context = env.getProperty("server.servlet.context-path");
        String host = InetAddress.getLocalHost().getHostAddress();
        log.info("\n----------------------------------------------------------\n\t" + "Application '{}' is running! Access URLs:\n\t" + "Local: \t\thttp://localhost:{}{}\n\t" + "External: \thttp://{}:{}{}\n\t" + "----------------------------------------------------------", appName, port, context, host, port, context);
    }
}
