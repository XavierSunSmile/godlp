package com.bytedance.godlp;

import java.util.Arrays;
import java.util.List;

/**
 * Example usage of the Java DLP engine.
 */
public class Main {
    public static void main(String[] args) {
        DlpEngineImpl engine = new DlpEngineImpl();
        // very simple rule to detect email addresses
        engine.addRule(new RuleItem(1, "[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+"));

        String input = "contact me at example@test.com";
        List<DetectResult> results = engine.detect(input);
        System.out.println("Input: " + input);
        System.out.println("Results: " + Arrays.toString(results.toArray()));
    }
}
