package com.bytedance.godlp;

import java.util.regex.Pattern;

/**
 * Minimal rule representation containing an id and a regex pattern.
 */
public class RuleItem {
    private final int ruleId;
    private final Pattern pattern;

    public RuleItem(int ruleId, String regex) {
        this.ruleId = ruleId;
        this.pattern = Pattern.compile(regex);
    }

    public int getRuleId() {
        return ruleId;
    }

    public Pattern getPattern() {
        return pattern;
    }
}
