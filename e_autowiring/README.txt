
                        _________ Autowiring ______
                        
Autowiring is automatic injection of dependencies by Spring. 
Instead of manually linking beans in XML or Java config, Spring can detect and inject them automatically.

Ways to Do Autowiring
  Autowiring can be done in two main ways:
    1. XML-based Autowiring
        Autowire Modes:
        1. no → No autowiring (manual).
        2. byName : 
           1. Matches bean id with property name.
           2. Setter property name = bean id  
           3. If no bean with that id : property=null
        3. byType : 
           1. Matches by property type(check class name).
           2. Only one bean of matching type must exist .  
           3. If 0 beans -> null; if 1 beans -> exception
        4. constructor : 
           1. Injects via constructor.
           2. Parameter type (and order) must match beans 
           3. If >1 beans of same type -> ambiguity error
        5. autodetect : (deprecated) Chooses constructor or byType.

    2. Annotation-based Autowiring (@Autowired)
            1. @Autowired
                1. @Autowired tells Spring to automatically inject a bean into another bean,
                2. letting the IoC container resolve and provide the dependency at runtime.  
                3. Injects only reference types (beans), not primitives or Strings.
                4. It can be applied to: Fields,Setter methods and Constructors.
                5. No control of Programmer.
    
            2.  @Qualifier
                1. @Qualifier resolves conflicts(ambiguity) when multiple beans of the same type exist.
                2. Must match bean id or bean name exactly.
                3. used with @Autowired for constructor, setter, or field/property  injection.
