package com.bytedance.godlp;

import java.util.List;
import java.util.Map;

/**
 * Simplified Engine API for the Java version.
 */
public interface DlpEngine {
    void addRule(RuleItem rule);

    List<DetectResult> detect(String text);

    List<DetectResult> detectMap(Map<String, String> data);
}
