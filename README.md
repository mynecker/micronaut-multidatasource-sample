# Sample for multiple datasources with Micronaut 4

Micronaut 4.0.2, Micronaut-data 4.0.4

## Relates to
This sample relates to micronaut-data issue https://github.com/micronaut-projects/micronaut-data/issues/2419

## Solution 

Multiple datasources can be defined as shown in 'resources/application.yaml'.

There *must* be one `default` datasource defined besides further datasources that can hold arbitrary names. 

io.micronaut.configuration.hibernate.jpa.conf.SessionFactoryPerDataSourceFactory expects a 'default' datasource.




