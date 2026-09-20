package javaEightFeatures;

public class AnynomusInnerClass {
    static void main() {
        Employee employee = new Employee() {
            @Override
            public String getSalary() {
                return "100000";
            }

            @Override
            public String getDestination() {
                return "Faltuu ka Engineer";
            }
        };
        System.out.println(employee.getSalary());
        System.out.println(employee.getDestination());
        }
    }

