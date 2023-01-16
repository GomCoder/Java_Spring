package com.example.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDbRepositoryIfs<T> {

    Optional<T> findById(int index);//index를 받아 해당 타입에 대한하는 엔터티를 찾아서 리턴하는 함수

    T save(T entity); //저장하는 메서드

    void deleteById(int index);//삭제하는 메서드

    List<T> findAll(); //전체를 리턴하는 메서드
}