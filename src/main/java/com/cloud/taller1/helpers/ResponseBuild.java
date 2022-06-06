package com.cloud.taller1.helpers;

import org.springframework.stereotype.Component;

import static org.springframework.http.HttpStatus.*;

@Component
public class ResponseBuild {

    public Response success() {
        return Response.builder()
                .data(OK)
                .code(OK.value()).build();
    }

    public Response success(Object data) {
        return Response.builder()
                .data(data)
                .code(OK.value()).build();
    }

    public Response created(Object data) {
        return Response.builder()
                .data(data)
                .code(CREATED.value()).build();
    }

    public Response failed(Object data) {
        return Response.builder()
                .data(data)
                .code(INTERNAL_SERVER_ERROR.value()).build();
    }

    public Response badRequest(Object data) {
        return Response.builder()
                .data(data)
                .code(BAD_REQUEST.value()).build();
    }
    public Response badRequest() {
        return Response.builder()
                .data(BAD_REQUEST)
                .code(BAD_REQUEST.value()).build();
    }

}
