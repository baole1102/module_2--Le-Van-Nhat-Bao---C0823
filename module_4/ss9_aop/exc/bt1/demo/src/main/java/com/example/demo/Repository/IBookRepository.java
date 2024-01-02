package com.example.demo.Repository;

import com.example.demo.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface IBookRepository extends JpaRepository<Book,Integer> {
    @Query(value = "select b.* from Book b join code_book c on c.id = b.code_book_id where b.id= :id",nativeQuery = true)
    Book findCodeBook(@Param("id") int id);
}
