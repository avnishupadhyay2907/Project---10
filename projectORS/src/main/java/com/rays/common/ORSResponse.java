package com.rays.common;

import java.util.HashMap;
import java.util.Map;

/**
 * Contains REST response
 * 
 * @author Avnish
 */
public class ORSResponse {

    public static String DATA = "data";
    public static String INPUT_ERROR = "inputerror";
    public static String MESSAGE = "message";

    private boolean success = false;
    private Map<String, Object> result = new HashMap<>();
    private String jwtToken;

    public ORSResponse() {}

    public ORSResponse(boolean success) {
        this.success = success;
    }

    public ORSResponse(boolean success, String message) {
        this.success = success;
        addMessage(message);
    }

    public ORSResponse(boolean success, String message, Object value) {
        this.success = success;
        addMessage(message);
        addData(value);
    }

    public ORSResponse(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    // ✅ Getter/Setter names aligned with field names
    public String getJwtToken() {
        return jwtToken;
    }

    public void setJwtToken(String jwtToken) {
        this.jwtToken = jwtToken;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public Map<String, Object> getResult() {
        return result;
    }

    public void setResult(Map<String, Object> result) {
        this.result = result;
    }

    public void addResult(String key, Object value) {
        result.put(key, value);
    }

    public void addData(Object value) {
        result.put(DATA, value);
    }

    public void addInputErrors(Object value) {
        result.put(INPUT_ERROR, value);
    }

    public void addMessage(Object value) {
        result.put(MESSAGE, value);
    }
}
