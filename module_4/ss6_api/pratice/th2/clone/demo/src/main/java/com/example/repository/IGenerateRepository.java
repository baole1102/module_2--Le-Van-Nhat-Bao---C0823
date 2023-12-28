package com.example.repository;

import java.util.List;

public interface IGenerateRepository<T> {
    boolean saveWithStoredProcedure (T t);
}
