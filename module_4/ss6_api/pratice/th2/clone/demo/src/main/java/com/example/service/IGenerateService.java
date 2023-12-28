package com.example.service;

import java.util.List;

public interface IGenerateService<T> {
    boolean saveWithStoredProcedure (T t);
}
