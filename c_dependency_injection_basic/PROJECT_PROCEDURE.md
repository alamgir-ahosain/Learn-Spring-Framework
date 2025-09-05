# Spring XML DI Example - Project Procedure

1. **Create Maven Project**

   - Set up project structure using Maven.

2. **Add Dependencies**

   - Add Spring Core and Spring Context in `pom.xml`.

3. **Create Bean (Student.java)**

   - Plain Old Java Object (POJO) with properties `id` and `name`.

4. **Create Configuration File (config.xml)**

   - Define the `student1` bean and set properties.

5. **Setter Injection**

   - Use setter methods in `Student.java` to inject `id` and `name`.

6. **Main Class**
   - Load Spring `ApplicationContext`.
   - Retrieve `Student` bean and use it.
