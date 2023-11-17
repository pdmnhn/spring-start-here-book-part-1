package main;

import java.util.logging.Logger;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import models.Comment;
import services.CommentService;


public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        CommentService commentService = context.getBean(CommentService.class);
        Comment comment = new Comment();
        comment.setText("Hi")
                .setAuthor("pdmnhn");
//        String value = commentService.publishComment(comment);
//        logger.info(value);
        String value = commentService.deleteComment(comment);
        logger.info(value);
    }
}
