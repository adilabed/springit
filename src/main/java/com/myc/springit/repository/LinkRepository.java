package com.myc.springit.repository;

import com.myc.springit.domain.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LinkRepository extends JpaRepository<Link,Long> {

    Link findByTitle(String title);
}
