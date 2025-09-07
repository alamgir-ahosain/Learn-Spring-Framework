                      _______  configuration metadata ________

                      
    Where we declare beans and it's dependency,The container knows what to instantiate and configure using configuration metadata, which can be defined in three ways:
    1. XML
            1. Beans and their dependencies are declared in an XML file (commonly config.xml or applicationContext.xml).
            2. Spring container reads the XML file and creates objects accordingly.
    2. Java annotations
            1. Done by annotating classes, methods, or fields.
            2. Use @Component,Autowired
            2. @Autowired – Most common annotation; tells the IoC container to inject dependencies.

    3. Java code
            1. @Configuration – Marks a class as a source for bean definitions.
            2. @Bean – Indicates that a method’s return object should be managed by the IoC container.
            3.@Bean(name = {"bean1", "alias1", "alias2"})


   A single bean can have multiple names (aliases).
        1. In @Bean (Java Config)
           @Bean(name = {"bean1", "alias1", "alias2"})
        2. In @Component 
           @Component({"bean1", "alias1", "alias2"})
        3. In XML 
          <bean id="bean1" name="alias1,alias2" class="com.example.A2"/>



