## Sample for multi datasources and Micronaut 4 (4.0.4 for data subprojects)

Does not work - for reproduction of possible issue only

Not possible to define more than 1 JPA configurations in `application.yml`

With a second JPA configuration executing `Application` ends with

```
15:29:24.650 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Starting...
15:29:24.809 [main] INFO  com.zaxxer.hikari.pool.HikariPool - HikariPool-1 - Added connection conn0: url=jdbc:h2:mem:devDb1 user=SA
15:29:24.810 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-1 - Start completed.
15:29:24.813 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-2 - Starting...
15:29:24.816 [main] INFO  com.zaxxer.hikari.pool.HikariPool - HikariPool-2 - Added connection conn1: url=jdbc:h2:mem:devDb2 user=SA
15:29:24.817 [main] INFO  com.zaxxer.hikari.HikariDataSource - HikariPool-2 - Start completed.
15:29:24.963 [main] ERROR io.micronaut.runtime.Micronaut - Error starting Micronaut server: Bean definition [org.hibernate.SessionFactory] could not be loaded: Failed to inject value for parameter [jpaConfiguration] of class: io.micronaut.configuration.hibernate.jpa.conf.SessionFactoryPerDataSourceFactory

Message: Multiple possible bean candidates found: [JpaConfiguration, JpaConfiguration]
Path Taken: SessionFactoryPerDataSourceFactory.buildHibernateSessionFactoryBuilder(SessionFactoryBuilder sessionFactoryBuilder) --> new SessionFactoryPerDataSourceFactory(Environment environment,List configures,StandardServiceRegistryBuilderCreator serviceRegistryBuilderSupplier,List standardServiceRegistryBuilderConfigurers,[JpaConfiguration jpaConfiguration],ApplicationContext applicationContext,Integrator integrator)
io.micronaut.context.exceptions.BeanInstantiationException: Bean definition [org.hibernate.SessionFactory] could not be loaded: Failed to inject value for parameter [jpaConfiguration] of class: io.micronaut.configuration.hibernate.jpa.conf.SessionFactoryPerDataSourceFactory

Message: Multiple possible bean candidates found: [JpaConfiguration, JpaConfiguration]
Path Taken: SessionFactoryPerDataSourceFactory.buildHibernateSessionFactoryBuilder(SessionFactoryBuilder sessionFactoryBuilder) --> new SessionFactoryPerDataSourceFactory(Environment environment,List configures,StandardServiceRegistryBuilderCreator serviceRegistryBuilderSupplier,List standardServiceRegistryBuilderConfigurers,[JpaConfiguration jpaConfiguration],ApplicationContext applicationContext,Integrator integrator)
	at io.micronaut.context.DefaultBeanContext.initializeContext(DefaultBeanContext.java:1979)
	at io.micronaut.context.DefaultApplicationContext.initializeContext(DefaultApplicationContext.java:279)
	at io.micronaut.context.DefaultBeanContext.readAllBeanDefinitionClasses(DefaultBeanContext.java:3340)
	at io.micronaut.context.DefaultBeanContext.finalizeConfiguration(DefaultBeanContext.java:3694)
	at io.micronaut.context.DefaultBeanContext.start(DefaultBeanContext.java:345)
	at io.micronaut.context.DefaultApplicationContext.start(DefaultApplicationContext.java:191)
	at io.micronaut.runtime.Micronaut.start(Micronaut.java:73)
	at io.micronaut.runtime.Micronaut.run(Micronaut.java:322)
	at io.micronaut.runtime.Micronaut.run(Micronaut.java:297)
	at demo.ApplicationKt.main(Application.kt:5)
Caused by: io.micronaut.context.exceptions.DependencyInjectionException: Failed to inject value for parameter [jpaConfiguration] of class: io.micronaut.configuration.hibernate.jpa.conf.SessionFactoryPerDataSourceFactory

```


