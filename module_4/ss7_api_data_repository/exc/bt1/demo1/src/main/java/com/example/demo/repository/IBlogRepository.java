package com.example.demo.repository;

import com.example.demo.model.Blog;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IBlogRepository extends JpaRepository<Blog, Long> {
    @Query(value = "select b.* from Blog b join Catelogy c on c.id = b.catelogy_id  where c.id = :id ", nativeQuery = true,
    countQuery = " select count(*) from (select b.* from Blog b join Catelogy c on c.id = b.catelogy_id where c.id = :id) temp")
    List<Blog> findCatelogy(@Param("id") Long id);

    @Query(value = "select * from Blog b where b.id = :id", nativeQuery = true)
    Blog findId(@Param("id") Long id);
    @Query(value = "select * from Blog b where b.name like :name", nativeQuery = true)
    Page<Blog> findByName(@Param("name") String name, Pageable pageable);

//    @Query(value = "select * from Blog b join Catelogy c on c.blog_id = b.id", nativeQuery = true)
//    List<BlogDto> getAll();
//
//    @Query(value = "insert into Blog(name,content,date,author,img,id)" +
//            "values (?1,?2,?3,?4,?5)",nativeQuery = true)
//     void saveDto(String name, String content,String date,String author,String img,Long id);
}
