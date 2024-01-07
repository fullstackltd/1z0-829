package com.fullstackbd.vendor.date;

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

    public Person withName(String name) {
        return new Person(name, this.age);
    }

    public Person withAge(int age) {
        return new Person(this.name, age);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) {
            return false;
        }
        Person other = (Person) obj;
        return this.name.equals(other.name) && this.age == other.age;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }

    public static void main(String[] args) {
        Person person = new Person("John Doe", 42);
        System.out.println(person);
        Person p = person.withName("Rashed");
        System.out.println(p);
        System.out.println(person.equals(p));

        Person p2 = person.withAge(52);
        System.out.println(p2);
        System.out.println(person.equals(p2));
        System.out.println(p.equals(p2));
    }
}