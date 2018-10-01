# checks

## Maven dependency
```xml
<dependency>
    <groupId>no.obje</groupId>
    <artifactId>checks</artifactId>
    <version>0.2</version>
</dependency>
```

## The purpose of this library
To create a utility library for null checking and similiar checks typically used when instantiating objects or injecting dependencies.

## Example

Check constructor arguments to ensure that a valid object

```java
public class Person {

    private final String name;
    private final List<String> occupations;
    
    public Person(String name, List<String> occupations) {
        this.name = Checks.notNull(name); // name is a required field
        this.occupations = Checks.notEmpty(occupations); // needs to have at least one occupation
    }

}
```
