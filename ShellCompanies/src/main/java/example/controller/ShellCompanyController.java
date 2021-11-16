package example.controller;

import example.model.ShellCompany;
import io.micronaut.http.annotation.Controller;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller("rx/")
public class ShellCompanyController {
    private static final Logger logger = LoggerFactory.getLogger(ShellCompany.class);
}
