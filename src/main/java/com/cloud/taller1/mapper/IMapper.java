package com.cloud.taller1.mapper;

public interface IMapper<I,O> {
    public O map(I in);
}
