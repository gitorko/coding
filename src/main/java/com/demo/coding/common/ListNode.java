package com.demo.coding.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class ListNode {

    public final int val;
    public ListNode next;

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                '}';
    }
}
