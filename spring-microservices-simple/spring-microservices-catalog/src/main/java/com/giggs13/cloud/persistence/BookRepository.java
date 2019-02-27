package com.giggs13.cloud.persistence;

import com.giggs13.cloud.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import java.util.List;

@RepositoryRestResource
public interface BookRepository
        extends JpaRepository<Book, Long> {

    @RestResource(rel = "title", path = "title")
    List<Book> findByTitle(@Param("title") String title);
}
