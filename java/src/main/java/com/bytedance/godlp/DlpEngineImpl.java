package com.bytedance.godlp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Basic implementation of the Java engine.
 */
public class DlpEngineImpl implements DlpEngine {
    private final Map<Integer, Detector> detectors = new HashMap<>();

    @Override
    public void addRule(RuleItem rule) {
        detectors.put(rule.getRuleId(), new RegexDetector(rule));
    }

    @Override
    public List<DetectResult> detect(String text) {
        List<DetectResult> all = new ArrayList<>();
        for (Detector d : detectors.values()) {
            all.addAll(d.detectBytes(text.getBytes()));
        }
        return all;
    }

    @Override
    public List<DetectResult> detectMap(Map<String, String> data) {
        List<DetectResult> all = new ArrayList<>();
        for (Detector d : detectors.values()) {
            all.addAll(d.detectMap(data));
        }
        return all;
    }
}
