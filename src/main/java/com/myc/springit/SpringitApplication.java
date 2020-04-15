package com.myc.springit;

import com.myc.springit.domain.Comment;
import com.myc.springit.domain.Link;
import com.myc.springit.repository.CommentRepository;
import com.myc.springit.repository.LinkRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;


@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

    public static void main(String[] args) {

        SpringApplication.run(SpringitApplication.class, args);
        System.out.println("Application started");
    }

    //@Bean
    CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository) {
        return args -> {
            Link link = new Link("Getting started with Angular 9", "http://ultimatecourse.com");
            linkRepository.save(link);

            Comment comment = new Comment("This is an awesome course ty", link);
            commentRepository.save(comment);
            link.addComment(comment);

            Link firstLink = linkRepository.findByTitle("Getting started with Angular 9");
            System.out.println(firstLink.getTitle());
        };
    }


}
