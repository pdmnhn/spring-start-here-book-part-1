package repositories;

import org.springframework.stereotype.Repository;
import models.Comment;


@Repository
public class DBCommentRepository implements CommentRepository {
    @Override public void storeComment(Comment comment) {
        System.out.println("Storing comment posted by " + comment.getAuthor() + ": " + comment.getText());
    }
}
