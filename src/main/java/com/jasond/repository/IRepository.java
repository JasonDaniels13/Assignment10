package com.jasond.repository;

public interface IRepository<ID, T> {
    T create(ID i, T t);

    T update(ID i, T t);

    T read(ID id);

    T delete(ID id);
}

