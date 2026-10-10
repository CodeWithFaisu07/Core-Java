package javaEightFeatures;

import java.util.Optional;

public class Optional_01 {
        public static void main(String[] args) {

            // 1. DEFINITION:
            // Optional is a class introduced in Java 8.
            // It is a container object that may or may not contain
            // a non-null value.
            //
            // 2. WHY WE USE OPTIONAL:
            // We use Optional to represent the possible absence of a value
            // and to reduce unexpected NullPointerException risks.
            // It encourages us to handle missing values explicitly.

            // 3. IMPLEMENTATION:
            // Optional.of() creates an Optional containing a non-null value.
            Optional<String> name = Optional.of("Faisal");

            // Optional.ofNullable() allows a value that may be null.
            String city = null;
            Optional<String> cityName = Optional.ofNullable(city);

            // Optional.empty() creates an empty Optional.
            Optional<String> emptyValue = Optional.empty();


            // 4. OPERATIONS ON OPTIONAL:

            // isPresent(): checks whether a value is present.
            System.out.println(name.isPresent());      // true
            System.out.println(cityName.isPresent());  // false

            // ifPresent(): executes the given action if a value exists.
            name.ifPresent(n -> System.out.println("Name: " + n));

            // orElse(): returns the value if present;
            // otherwise, returns the specified default value.
            String result = cityName.orElse("City not available");
            System.out.println(result);

            // orElseGet(): uses a Supplier to generate a default value
            // only when the Optional is empty.
            String country = cityName.orElseGet(() -> "India");
            System.out.println(country);

            // map(): transforms the value if it is present.
            Optional<String> upperName = name.map(String::toUpperCase);
            System.out.println(upperName.orElse("Unknown"));

            // filter(): keeps the value only if the condition is true.
            Optional<String> filteredName =
                    name.filter(n -> n.startsWith("F"));

            System.out.println(filteredName.orElse("Name not matched"));

            // orElseThrow(): returns the value if present;
            // otherwise, throws an exception.
            String actualName = name.orElseThrow(
                    () -> new IllegalStateException("Name is missing")
            );

            System.out.println(actualName);
        }
    }
