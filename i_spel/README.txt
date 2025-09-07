                _____________________ SpEL(Spring-Expression Language) _____________________


      1. Expression language for searching/querying/manipulating objects at runtime.
      2. Supports property access, method calls, array/collection access, variable use, and bean retrieval from IoC container
      3. Supports parsing and executing expressions help of @Value annotation.
      4. Works inside annotations, XML, or Java config.
      5. Integrates with Spring’s bean factory (can reference other beans).

 
 
Common Use Cases
    1. Injecting values
    
        @Value("#{10 + 20}")
        private int sum;   // 30


    2. Accessing bean properties

        @Value("#{otherBean.name}")
        private String name;

    3. Calling Static methods

         T(class).method(param)

        @Value("#{T(java.lang.Math).sqrt(16)}")
        private double squareRoot;  // 4.0

    4. Call Static variable

         T(class).variable 
          @Value("#{T(java.lang.Math).PI}") // accessing static 
     
    6.  create instance 
        @Value("#{new String('CE21012')}") 
        private String id; // id=Ce21012 
   
    7. use boolean
        @Value("#{55>12}")
        private boolean isAlive;
                  
    5. Using Collections
    
        @Value("#{myList[0]}")
        private String firstItem;


    6. XML Example
        <bean id="info" class="com.example.Info">
            <property name="message" value="#{'Hello ' + 'World'}"/>
        </bean>



