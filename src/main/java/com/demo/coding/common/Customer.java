package com.demo.coding.common;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Builder
@AllArgsConstructor
@Data
public class Customer {
    public String name;
    public Integer age;
}
