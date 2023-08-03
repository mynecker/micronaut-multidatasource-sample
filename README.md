## Sample for Micronaut 4 in a dedicated branch `micronaut4`

## Sample for multi datasources

Does not work - for reproduction of possible issue only

Not possible to inject an `EntityManager` for a specific data source. 

Executing `MultidatasourcesCommand` ends with

```
picocli.CommandLine$InitializationException: Could not instantiate class demo.MultidatasourcesCommand: io.micronaut.context.exceptions.DependencyInjectionException: Failed to inject value for field [entityManager] of class: demo.persistence.$Service1$Definition$Intercepted

Message: Multiple possible bean candidates found: [io.micronaut.configuration.hibernate.jpa.TransactionalSession$Intercepted, io.micronaut.configuration.hibernate.jpa.TransactionalSession$Intercepted]
Path Taken: new MultidatasourcesCommand() --> MultidatasourcesCommand.service1 --> $Service1$Definition$Intercepted.entityManager
	at picocli.CommandLine$DefaultFactory.create(CommandLine.java:5687)
	at picocli.CommandLine$Model$CommandUserObject.getInstance(CommandLine.java:12262)
	at picocli.CommandLine$Model$CommandSpec.userObject(CommandLine.java:6437)
	at picocli.CommandLine$Interpreter.clear(CommandLine.java:13466)
	at picocli.CommandLine$Interpreter.parse(CommandLine.java:13512)
	at picocli.CommandLine$Interpreter.parse(CommandLine.java:13501)
	at picocli.CommandLine$Interpreter.parse(CommandLine.java:13396)
	at picocli.CommandLine.parseArgs(CommandLine.java:1552)
	at picocli.CommandLine.execute(CommandLine.java:2169)
	at io.micronaut.configuration.picocli.PicocliRunner.run(PicocliRunner.java:137)
	at io.micronaut.configuration.picocli.PicocliRunner.run(PicocliRunner.java:114)
	at demo.MultidatasourcesCommand$Companion.main(MultidatasourcesCommand.kt:29)
	at demo.MultidatasourcesCommand.main(MultidatasourcesCommand.kt)
Caused by: io.micronaut.context.exceptions.DependencyInjectionException: Failed to inject value for field [entityManager] of class: demo.persistence.$Service1$Definition$Intercepted

```


