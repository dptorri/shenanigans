package example.controller;

import com.github.javafaker.Faker;
import example.model.ShellCompany;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Controller("rx/")
public class ShellCompanyController {
    private static final Logger logger = LoggerFactory.getLogger(ShellCompany.class);

    @Get("shellcompanies")
    public Collection<String> shellcompanies(){
        Faker fake = new Faker();
        List<String> listShellcompanies = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            var shellcompany= fake.company();
            listShellcompanies.add(shellcompany.name()+" - "+shellcompany.industry());
        }
        return listShellcompanies;
    }
}
