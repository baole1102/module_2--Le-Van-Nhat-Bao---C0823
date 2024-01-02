package com.example.demo.Repository;


import com.example.demo.Model.CodeBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface ICodeBookRepository extends JpaRepository<CodeBook,Integer> {
    @Query(value = "select * from code_book c where c.code = :code",nativeQuery = true)
    CodeBook findIdCode(@Param("code") String code);
}
