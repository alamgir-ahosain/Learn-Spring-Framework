# Autowiring in Spring

Autowiring is the automatic injection of dependencies by Spring. Instead of manually linking beans in XML or Java configuration, Spring can detect and inject them automatically.

## Ways to Do Autowiring

Autowiring can be done in two main ways:

### 1. XML-based Autowiring

**Autowire Modes:**

1. **no** -> No autowiring (manual).  
2. **byName**  
   - Matches bean id with property name.  
   - Setter property name = bean id.  
   - If no bean with that id: property = null.  
3. **byType**  
   - Matches by property type (check class name).  
   - Only one bean of matching type must exist.  
   - If 0 beans -> null; if >1 bean -> exception.  
4. **constructor**  
   - Injects via constructor.  
   - Parameter type (and order) must match beans.  
   - If >1 bean of same type -> ambiguity error.  
5. **autodetect** (deprecated)  
   - Chooses constructor or byType.  

### 2. Annotation-based Autowiring

1. **@Autowired**  
   - Tells Spring to automatically inject a bean into another bean.  
   - Lets the IoC container resolve and provide the dependency at runtime.  
   - Injects only reference types (beans), not primitives or Strings.  
   - Can be applied to: Fields, Setter methods, and Constructors.  
   - No control of programmer.  

2. **@Qualifier**  
   - Resolves conflicts (ambiguity) when multiple beans of the same type exist.  
   - Must match bean id or bean name exactly.  
   - Used with `@Autowired` for constructor, setter, or field/property injection.  
