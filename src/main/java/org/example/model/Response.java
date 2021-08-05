package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Response {
    private String contextId;
    private boolean success;
    private int code;
    private List<Item> results;

    public Response() {
    }

    public String getContextId() {
        return contextId;
    }

    public void setContextId(String contextId) {
        this.contextId = contextId;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<Item> getResults() {
        return results;
    }

    public void setResults(List<Item> results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "Response{" +
                "contextId='" + contextId + '\'' +
                ", success=" + success +
                ", code=" + code +
                ", results=" + results +
                '}';
    }
}
