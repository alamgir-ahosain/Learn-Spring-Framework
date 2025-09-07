


                __________ Stereotype Annotations ______________
    1. Special annotations to auto-detect and register beans.
    2. Removes need for explicit XML  <bean> in Configuration.
    Examples:
        1. @Component : Generic spring bean
        2. @Service  : Service layer bean
        3. @Repository : DAO(Data Access Object) bean
        4. @Controller : Web Controller bean


1. @Component*
    1. Generic stereotype annotation.
    2. Marks class as Spring-managed bean.
    3. Works with component scanning (<context:component-scan> / @ComponentScan).

            @Component
            public class MyBean { ... }


3. @Value
    1. Injects values into fields, methods, or constructors.
    2. Supports:
        1. Literals
        2.Property file values (${key})
        3. SpEL expressions

            @Value("Alamgir")
            private String name;

            @Value("${db.url}")
            private String dbUrl;

             @Value("#{myListBean}")
             private List<String> myList;

