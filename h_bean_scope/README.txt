

                   ________________ Spring Bean Scopes ___________


1. singleton( by default)
   1. Only one instance of the bean per Spring container.
   2. Same object is shared everywhere.
   Example: Service objects.

2. prototype
   1. A new instance is created every time the bean is requested.
   Example: Stateless utility objects.

3. request (Web-aware only)
   1. One bean instance per HTTP request.
   2. Used in web applications (Spring MVC).

4. session(Web-aware only)
   1. One bean instance per HTTP session.
   Example: User session data.

5. application (Web-aware only)
   1. One bean instance per ServletContext (entire web app).
   2. Similar to singleton but specific to web context.

6. websocket(Web-aware only, since Spring 4.2)
   1. One bean instance per WebSocket session.


Example:
    1. XML
        <bean id="myBean" class="com.example.MyBean" scope="prototype"/>
    2. Annotation
       
        @Component            // stereotype (registers the bean)
        @Scope("prototype")   // modifies its lifecycle
        public class MyBean { ... }
