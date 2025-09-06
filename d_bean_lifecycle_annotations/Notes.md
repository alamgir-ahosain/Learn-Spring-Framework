

# Spring Bean Lifecycle Method 

## Spring Bean Lifecycle
1. **Instantiation**: Spring creates the bean object.  
2. **Populate Properties or Dependencies**: Spring injects values or references.  
3. **Aware Interfaces**: `BeanNameAware`, `BeanFactoryAware` (optional).  
4. **Pre-Initialization**: `@PostConstruct` / `afterPropertiesSet()`.  
5. **Custom Init Method**: If `init-method` is defined.  
6. **Bean Ready**: Bean is available for use.  
7. **Destruction**: Container shutdown: `@PreDestroy` / `destroy()` / `destroy-method`.  


## Ways to Define Lifecycle Methods

### 1. Using XML (`init-method` and `destroy-method`)

1. Spring provides two methods for every bean.  
2. Good for 3rd-party or external classes.  
3. We can change the name of these methods but the signature must be the same.  
   - `public void init()`: Initialization code (loading config, connecting DB, web service, etc.)  
   - `public void destroy()`: For cleanup code  

```xml
<bean id="info" class="com.example.info" init-method="init" destroy-method="cleanup"/>
````

```java
public class Info {
    public void init() {
        System.out.println("Bean is initialized");
    }

    public void cleanup() {
        System.out.println("Bean is destroyed");
    }
}
```


### 2. Using Interface

1. `afterPropertiesSet()`: called after dependencies are injected.
2. `destroy()`: called when container shuts down.
3. Legacy, tight coupling with Spring API.

```java
public class Info implements InitializingBean, DisposableBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Bean is initialized");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Bean is destroyed");
    }
}
```


### 3. Using Annotation

1. Recommended modern approach.
2. `@PostConstruct`: initialization after dependency injection.
3. `@PreDestroy`: called before bean is removed from container.

```java
public class Info {
    @PostConstruct
    public void init() {
        System.out.println("Bean is initialized");
    }

    @PreDestroy
    public void cleanup() {
        System.out.println("Bean is destroyed");
    }
}
```


## Key Points

1. `init-method` / `destroy-method` is XML-based.
2. `InitializingBean` / `DisposableBean` are interface-based.
3. `@PostConstruct` / `@PreDestroy` require `javax.annotation` (or Jakarta version).
4. Lifecycle methods are optional, but useful for resource allocation / cleanup.

