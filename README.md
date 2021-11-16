## shenanigans
Microservices communication from TaxHaven to ShellCompanies with Micronaut
#### 0. Create projects TaxHaven and ShellCompanies from CLI
```
mn create-app --features=reactor,graalvm example.TaxHaven --build=gradle --lang=java   
mn create-app --features=reactor,graalvm example.ShellCompanies --build=gradle --lang=java   
```
#### 1. Run it
```
 ./gradlew tasks run 
```
#### 2. Generate Fake ShellCompanies
We use `com.github.javafaker.Faker;`
also set ShellCompanies on port -> 8081
```
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
```
