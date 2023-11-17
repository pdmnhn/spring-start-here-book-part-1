package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import models.Comment;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;
import services.TestService;
import services.TestService2;


public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfiguration.class);
        var commentService = context.getBean(CommentService.class);
        var comment = new Comment();
        comment.setAuthor("Person");
        comment.setText("This is a very good blog post");
        commentService.publishComment(comment);

        System.out.println("\nBefore getting the TestService bean");
        TestService testService = context.getBean(TestService.class);
        System.out.println("After getting the TestService bean");

        TestService2 testService2 = context.getBean(TestService2.class);
        System.out.println("Are the two bean instances same? " + (testService.getPrototypeBeanComponent()
                == testService2.getPrototypeBeanComponent()));
        System.out.println(context.getBean(PrototypeBeanComponent.class) == context.getBean(PrototypeBeanComponent.class));
        System.out.println(context.getBean(CommentRepository.class) == context.getBean(CommentRepository.class));
    }
}
