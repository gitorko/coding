package com.demo.coding.common;

import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Employee implements Comparable<Employee> {

    public String name;
    public Integer age;

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee emp = (Employee) obj;

        if (!this.name.equals(emp.name)) {
            return false;
        }
        if (this.age != emp.age) {
            return false;
        }

        if (this.name.equals(emp.name)) {
            return this.age.equals(emp.age);
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return this.name.hashCode() * this.age.hashCode();
    }

    @Override
    public int compareTo(Employee o) {
        return o.age.compareTo(this.age) + o.name.compareTo(this.name);
    }

    public static class EmployeeAgeComparator implements Comparator<Employee> {

        @Override
        public int compare(Employee o2, Employee o1) {
            if (o1.name.compareTo(o2.name) == 0) {
                if (o1.age.compareTo(o2.age) == 0) {
                    return 0;
                } else {
                    return o1.age.compareTo(o2.age);
                }
            } else {
                return o1.name.compareTo(o2.name);
            }
        }

    }

}
