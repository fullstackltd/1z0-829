# Java Records

## What is a Record?

A record is a class that is designed to be a shallowly immutable data carrier. A record is implicitly declared as `final` and is implicitly initialized with the record components of the record.

## What is a Shallowly Immutable Object?

A shallowly immutable object is an object that is immutable, but its fields are not. For example, a `String` is immutable, but its fields are not. A `String` is a shallowly immutable object.

## What is a Deeply Immutable Object?

A deeply immutable object is an object that is immutable, and its fields are also immutable. For example, a `String` is immutable, and its fields are also immutable. A `String` is a deeply immutable object.

## What is a Shallowly Mutable Object?

A shallowly mutable object is an object that is mutable, but its fields are not. For example, a `StringBuilder` is mutable, but its fields are not. A `StringBuilder` is a shallowly mutable object.

## What is a Deeply Mutable Object?

A deeply mutable object is an object that is mutable, and its fields are also mutable. For example, a `StringBuilder` is mutable, and its fields are also mutable. A `StringBuilder` is a deeply mutable object.

## What is a Record Component?

A record component is a field that is declared in a record. A record component is implicitly declared as `private final` and is implicitly initialized in the constructor of the record.

## What is a Record Constructor?

A record constructor is a constructor that is implicitly declared in a record. A record constructor is implicitly declared as `private` and is implicitly initialized with the record components of the record.

## What is a Record Canonical Constructor?

A record canonical constructor is a constructor that is implicitly declared in a record. A record canonical constructor is implicitly declared as `public` and is implicitly initialized with the record components of the record.

## What is a Record Accessor?

A record accessor is a method that is implicitly declared in a record. A record accessor is implicitly declared as `public` and is implicitly initialized with the record components of the record.

## What is a Record Canonical Accessor?

A record canonical accessor is a method that is implicitly declared in a record. A record canonical accessor is implicitly declared as `public` and is implicitly initialized with the record components of the record.

## What is a Record Canonical Constructor Parameter?

A record canonical constructor parameter is a parameter that is implicitly declared in a record canonical constructor. A record canonical constructor parameter is implicitly declared as `final` and is implicitly initialized with the record components of the record.

## What is a Record Canonical Accessor Parameter?

A record canonical accessor parameter is a parameter that is implicitly declared in a record canonical accessor. A record canonical accessor parameter is implicitly declared as `final` and is implicitly initialized with the record components of the record.

## What is a Record Canonical Accessor Return Type?

A record canonical accessor return type is a return type that is implicitly declared in a record canonical accessor. A record canonical accessor return type is implicitly declared as the type of the record component of the record.

## What is a Record Canonical Accessor Name?

A record canonical accessor name is a name that is implicitly declared in a record canonical accessor. A record canonical accessor name is implicitly declared as the name of the record component of the record.

## What is a Record Canonical Accessor Body?

A record canonical accessor body is a body that is implicitly declared in a record canonical accessor. A record canonical accessor body is implicitly declared as the body of the record canonical accessor.

## What is a Record Canonical Accessor Return Statement?

A record canonical accessor return statement is a return statement that is implicitly declared in a record canonical accessor. A record canonical accessor return statement is implicitly declared as the return statement of the record canonical accessor.

## What is a Record Canonical Accessor Return Value?

A record canonical accessor return value is a return value that is implicitly declared in a record canonical accessor. A record canonical accessor return value is implicitly declared as the return value of the record canonical accessor.

## What is a Record Canonical Accessor Return Value Expression?

A record canonical accessor return value expression is a return value expression that is implicitly declared in a record canonical accessor. A record canonical accessor return value expression is implicitly declared as the return value expression of the record canonical accessor.

## What is a Record Canonical Accessor Return Value Expression Name?

A record canonical accessor return value expression name is a name that is implicitly declared in a record canonical accessor return value expression. A record canonical accessor return value expression name is implicitly declared as the name of the record canonical accessor return value expression.

## What is a Record Canonical Accessor Return Value Expression Type?

A record canonical accessor return value expression type is a type that is implicitly declared in a record canonical accessor return value expression. A record canonical accessor return value expression type is implicitly declared as the type of the record canonical accessor return value expression.

## What is a Record Canonical Accessor Return Value Expression Value?

A record canonical accessor return value expression value is a value that is implicitly declared in a record canonical accessor return value expression. A record canonical accessor return value expression value is implicitly declared as the value of the record canonical accessor return value expression.

## What is a Record Canonical Accessor Return Value Expression Value Type?

A record canonical accessor return value expression value type is a type that is implicitly declared in a record canonical accessor return value expression value. A record canonical accessor return value expression value type is implicitly declared as the type of the record canonical accessor return value expression value.

## What is a Record Canonical Accessor Return Value Expression Value Name?

A record canonical accessor return value expression value name is a name that is implicitly declared in a record canonical accessor return value expression value. A record canonical accessor return value expression value name is implicitly declared as the name of the record canonical accessor return value expression value.

## What is a Record Canonical Accessor Return Value Expression Value Value?

A record canonical accessor return value expression value value is a value that is implicitly declared in a record canonical accessor return value expression value. A record canonical accessor return value expression value value is implicitly declared as the value of the record canonical accessor return value expression value.


## Complete Example of a Record

```java
public record Person(String name, int age) {
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String name() {
        return name;
    }

    public int age() {
        return age;
    }
}
```
