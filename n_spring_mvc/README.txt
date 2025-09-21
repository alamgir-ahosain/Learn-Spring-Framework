

 Five steps for creating a Spring MVC application are:
    1. Configure the dispatcher servlet in web.xml
    2. Create Spring Configuration File
    3. Configure View Resolver
    4. Create Controller
    5. Create a View to show


    1. dispatcher
    2. view resolver:(retrun index.jsp) an then
         class="org.springframework.web.servlet.view.InternalResourceViewResolver">
                <property name="prefix" value="/WEB-INF/views/" />
                <property name="suffix" value=".jsp" />
            </bean>


     Sending data from Controller to view
     Two way:

        1. ModelAndView
            addObject(String key,Object value) [object->student,collection,Integer]

            1. creating ModelAndView Object.
            2. setting data with AddObject method.
            3. Setting View name with setViewName method.
            4. return the ModelAndView Object.

        2. Model
            addAttribute(String key,Object value) [object->student,collection,Integer]
            Object obj=request.getAttribute()


        @GetMapping("/")
            public String home(Model m) {
                m.addAttribute("name","Alamgir");
                return "index";
            }
            <html>
            <head>title>Home Page</title>   </head>
            <body>
            <%String name = (String) request.getAttribute("name"); %>
            <h1><%= name %></h1>
            </body>
            </html>

@RequestMapping
    An annotation used in Spring MVC to map HTTP requests to handler methods in controller classes.
    @RequestMapping(
            value = "/submit",                       // URL path
            method = RequestMethod.POST,             // HTTP method
            params = "type=form",                    // Must include ?type=form in request
            headers = "X-Requested-With=XMLHttpRequest", // Must have this header
            consumes = MediaType.APPLICATION_JSON_VALUE, // Accepts JSON request body
            produces = MediaType.APPLICATION_JSON_VALUE  // Produces JSON response
        )

Key Points
@PathVariable : From URL path
@RequestParam : Individual fields
@ModelAttribute : Whole object (POJO)

             ________ Sending data view  Controller _____________

    1. @RequestParam
        1. Binds HTTP request parameters (query strings or form fields) to controller method parameters.
        2. Attribute
            @RequestParam(
            value = "q",            //optional(Name of the request parameter)
            required = false,       //true by default – throws error if missing
            defaultValue = "none") //Sets a default if the param is missing.
        3. Comparison:
           1. @RequestParam -> From query string/form
           2. @PathVariable -> From URL path

       4. Example:
           @GetMapping("/login")
           public String greet(@RequestParam("name") String name) {
                 return "Name Field value: " + name;
           }


   2. @ModelAttribute

    @ModelAttribute – 3 Key Roles Explained
       1. Binds request parameters : Acts like multiple @RequestParam for an entire object.
       2. Sets object fields : Creates the object, fills its fields, passes it to the method.
       3. Adds to Model (for views) : Automatically adds the object to the model (like addAttribute).

       1. Binds form data or request parameters to a Java object (POJO) automatically.
       2. Example
           1. Model Class
               public class User {
                   private String name;
                   private String email;
                   private String password;
                   // Getters and setters
               }
           2. Form
               <form action="/submit" method="post">
                   <input name="name" />
                   <input name="email" />
                   <input name="password" />
                   <button type="submit">Submit</button>
               </form>
           3.
            @PostMapping("/submit")
              public String handleForm(@ModelAttribute User user) {
                  // user.name, user.email, user.password are automatically populated
                  return "Data received: " + user.getName();
              }

           How It Works:
           1. Spring matches form field names with object properties.
           2. Automatically populates the object.



Controller -> Service Layer ->Database Layer(dao) ->Database
@Autowired
@Repository
@Service