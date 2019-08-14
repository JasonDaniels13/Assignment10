package com.jasond.service;


public interface IService<ID, T> {
    T create(ID i , T t);
    T read(ID id);
    T update(ID i, T t);
    T delete(ID id);
}


