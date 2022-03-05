package com.demo.coding;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Solution {

    @Test
    public void testNoop() {
        Assert.assertTrue(true);
    }

    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(Solution.class);
        System.out.println("Total number of tests " + result.getRunCount());
        System.out.println("Total number of tests failed " + result.getFailureCount());
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println(result.getFailureCount());
    }

}
