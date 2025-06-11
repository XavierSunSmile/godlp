package com.bytedance.godlp;

/**
 * Simple representation of detection result.
 */
public class DetectResult {
    private final int ruleId;
    private final String text;

    public DetectResult(int ruleId, String text) {
        this.ruleId = ruleId;
        this.text = text;
    }

    public int getRuleId() {
        return ruleId;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "DetectResult{" +
                "ruleId=" + ruleId +
                ", text='" + text + '\'' +
                '}';
    }
}
