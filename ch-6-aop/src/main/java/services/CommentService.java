package services;

import java.util.logging.Logger;
import org.springframework.stereotype.Service;
import annotations.Log;
import models.Comment;


@Service
public class CommentService {
    private final Logger logger = Logger.getLogger(CommentService.class.getName());

    public String publishComment(Comment comment) {
        logger.info("Publishing comment: " + comment);
        return "Success";
    }

    @Log
    public String deleteComment(Comment comment) {
        logger.info("Deleting comment" + comment);
        return "Success";
    }
}
