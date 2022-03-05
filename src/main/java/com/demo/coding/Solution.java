package com.demo.coding;

import static org.junit.platform.engine.discovery.DiscoverySelectors.selectClass;

import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.platform.launcher.Launcher;
import org.junit.platform.launcher.LauncherDiscoveryRequest;
import org.junit.platform.launcher.core.LauncherDiscoveryRequestBuilder;
import org.junit.platform.launcher.core.LauncherFactory;
import org.junit.platform.launcher.listeners.SummaryGeneratingListener;
import org.junit.platform.launcher.listeners.TestExecutionSummary;

public class Solution {

    @Test
    public void testNoop() {
        Assertions.assertTrue(true);
    }

    public static void main(String args[]) {
        LauncherDiscoveryRequest request =
                LauncherDiscoveryRequestBuilder.request()
                        .selectors(selectClass(Solution.class))
                        .build();

        Launcher launcher = LauncherFactory.create();
        SummaryGeneratingListener listener = new SummaryGeneratingListener();

        launcher.registerTestExecutionListeners(listener);
        launcher.execute(request);

        TestExecutionSummary summary = listener.getSummary();
        List<TestExecutionSummary.Failure> failures = summary.getFailures();
        failures.forEach(failure -> System.out.println("failure - " + failure.getException()));
        System.out.println(summary.getTestsFailedCount());
    }

}
