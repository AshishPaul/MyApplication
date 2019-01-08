package com.example.a40002778.myapplication.utils.exception;

import com.example.a40002778.myapplication.utils.ResourceProvider;

public abstract class BaseException extends Throwable {
    protected String cause = "";
    protected String suggestion = "";
    protected ResourceProvider resourceProvider;


    public BaseException(ResourceProvider resourceProvider, String cause) {
        this.cause = cause;
    }

    public BaseException(ResourceProvider resourceProvider, String causeOfError, String suggestion) {
        this.cause = causeOfError;
        this.suggestion = suggestion;
    }

    protected BaseException(ResourceProvider resourceProvider) {
    }


    public String getCauseOfError() {
        return cause;
    }

    public String getSuggestion() {
        return suggestion;
    }

    public String getCauseAndSuggestionMessage() {
        return cause+" "+suggestion;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AppException{");
        sb.append("cause='").append(cause).append('\'');
        sb.append(", suggestion='").append(suggestion).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
