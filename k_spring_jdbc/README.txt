
                   __________ JDBC (Java Database Connectivity) ___________

A powerful mechanism to connent to the database and execute SQL queries.
    Problems with JDBC
    1. A lot of boilerplate code.
    2. Excaption Handling Problem.(multiple try-catch-final bolck).
    3, Code duplication.
    4. Database login is a time consuming task.



             __________   Spring JDBC ___________

    2. Provides a JDBC abstraction layer through the JdbcTemplate class.
    3. Simplifies JDBC code with less boilerplate.
    3. Provides jdbcTemplate class which has all the inportant method to perform  operation with database.
    4. Integrates easily with Spring’s IoC container (dependency injection).
 
Key Component

       1. DataSource
            1. Interface type
            2. Used to manage database connection properties(username,password,url).
            3. Contains 
                driverClassName=? (for MySql -> con.mysql.jdbc.driver)
                url=? (jdbc:locahost:8080)
                username=?
                password=?

        2. DriverManagerDataSource 
            1. Implementation of DataSource

        3. jdbcTemplate
            1. Core class of Spring JDBC.
            2. Simplifies the process of executing SQL queries and updates.
            3. Automatically manages resource closing and exception translation.


Steps to Use Spring JDBC:
    1. Create and configure DriverManagerDataSource(set driver class, DB URL, username, and password)
    2. Inject DataSource into JdbcTemplate
    3. Use JdbcTemplate to perform database operations(query(), update(), execute(), etc.)


 Set up MySQL database
 
    CREATE DATABASE springjdbcDB;
    USE springjdbcDB;

    CREATE TABLE studenTable (
        id INT PRIMARY KEY,
        name VARCHAR(100) NOT NULL,
        email VARCHAR(100)
    );

                          __________  RowMapper in Spring  __________

    1. RowMapper<T> is a Spring interface.
    2. It maps each row of a ResultSet into a Java object (T).
    3. Makes code cleaner by avoiding direct ResultSet handling.
    4. Commonly used with JdbcTemplate.query() and queryForObject().
    5. Example Convert rows from studentTable into Student objects

        The Interface
        public interface RowMapper<T> {
           T mapRow(ResultSet rs, int rowNum) throws SQLException;
           }

       rs : current row of the ResultSet
       rowNum : row number (starting from 0)
       Returns : the mapped object (e.g., a Student object)
       
1. For single Object: public queryForObject(String sql,RowMapper<T> rowMapper,Object args)
2. For multiple Object: public List<T>query(String sql,RowMapper<T>rowMapper)

