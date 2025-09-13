
   JDBC: Direct database interaction using SQL
   JPA(Java Persistence API): API application for ORM(used by Hibernate)
   Hibernate: JPA Implementation with advanced feature.

        _______ ORM (Object-Relational Mapping) _____

Mapping Java classes to database tables.
Why is ORM?
   1. Remove boilerplate JDBC code
   2. automatic translation management
   3. portablity across diffrent databases
   4. Reduce SQL dependency with HQL(Hibernate Query Language)


            ______________ Hibernate ____________

Properties of Hibernate
  1. ORM Mapping: Maps Java classes to DB tables.
  2. JPA Support: Implements JPA standard APIs.
  3. HQL :Object-based query language (like SQL).
  4. Caching: Built-in first- and second-level caching.
  5. Lazy Loading: Loads related data only when accessed.
  6. Auto Table Generation: Creates tables from entity classes.
  7. Transaction Handling: Manages DB transactions easily.
  8. Dialect Config: Supports many DBs via dialects.
           
Hibernate Architecture & Workflow
   1. Core Components of Hibernate
      1. SessionFactory (Creates sessions, heavy object, singleton)
      2. Session (Interacts with DB, lightweight, short-lived)
   2. Transaction (Manages commit/rollback)
   3. Query & Criteria API (Fetching data efficiently)
   4. Hibernate Configuration File (hibernate.cfg.xml)

Hibernate Lifecycle & Workflow
   1. Load Hibernate Configuration 
   2. Create SessionFactory
   3. Open a Session
   4. Begin Transaction
   5. Perform CRUD operation
   6. commit Transaction
   7. Close Session.


Load Hibernate Configuration  &Create SessionFactory

@Entity Annotation — Key Points

    1. Marks a class as a database entity (table).
    2. Part of JPA (javax.persistence.Entity).
    3. Required for Hibernate to manage the class.
    4. Class must have:
        1. A no-arg constructor
        2. An @Id field (primary key)
    5. Table name defaults to class name (can customize with @Table).

What is HQL?
      1. HQL is similar to SQL but works with entity class names and field names, not table or column names.
      2. It's case-sensitive for class and property names.
      3.Example:
         SQL: SELECT * FROM StudentTable
         HQL: FROM StudentClass


  What is the Criteria API?
   1. Part of JPA and Hibernate.
   2. build queries dynamically using Java code, avoiding string-based HQL.
   3. useful when query conditions are optional or user-defined at runtime.
   
   Pagination: Pagination allows you to retrieve chunks of data (pages), rather than all rows at once.