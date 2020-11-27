package org.example;
import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
public class App implements RequestHandler<Object, LambdaResponse>
{
    @Override
    public LambdaResponse handleRequest(Object o, Context context) {
        return new LambdaResponse("Hello World", 200);
    }
}

class LambdaResponse {
    private String msg;
    private int status;

    public LambdaResponse(String msg, int status) {
        this.msg = msg;
        this.status = status;
    }
    public String getMsg() {
        return msg;
    }
    public void setMsg(String msg) {
        this.msg = msg;
    }
    public int getStatus() {
        return status;
    }
    public void setStatus(int status) {
        this.status = status;
    }
}
