package com.example.restservice;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LogController {


    @RequestMapping("/log") public String log()
    {
        // Logging various log level messages
        log.trace("Log level: TRACE");
        log.info("Log level: INFO");
        log.debug("Log level: DEBUG");
        log.error("Log level: ERROR");
        log.warn("Log level: WARN");

        return "Hey! You can check the output in the logs";
    }
}
