package com.bytedance.godlp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;

/**
 * A simple regex based detector.
 */
public class RegexDetector implements Detector {
    private final RuleItem rule;

    public RegexDetector(RuleItem rule) {
        this.rule = rule;
    }

    @Override
    public String getRuleInfo() {
        return "RuleID=" + rule.getRuleId() + ", regex=" + rule.getPattern().pattern();
    }

    @Override
    public int getRuleId() {
        return rule.getRuleId();
    }

    @Override
    public boolean useRegex() {
        return true;
    }

    @Override
    public List<DetectResult> detectBytes(byte[] input) {
        String text = new String(input);
        Matcher m = rule.getPattern().matcher(text);
        List<DetectResult> results = new ArrayList<>();
        while (m.find()) {
            results.add(new DetectResult(rule.getRuleId(), m.group()));
        }
        return results;
    }

    @Override
    public List<DetectResult> detectMap(Map<String, String> inputMap) {
        List<DetectResult> results = new ArrayList<>();
        for (String value : inputMap.values()) {
            results.addAll(detectBytes(value.getBytes()));
        }
        return results;
    }
}
