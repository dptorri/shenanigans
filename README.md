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

```