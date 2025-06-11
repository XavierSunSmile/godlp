package com.bytedance.godlp;

import java.util.List;
import java.util.Map;

/**
 * Interface similar to the Go DetectorAPI.
 */
public interface Detector {
    String getRuleInfo();

    int getRuleId();

    boolean useRegex();

    List<DetectResult> detectBytes(byte[] input);

    List<DetectResult> detectMap(Map<String, String> inputMap);
}
