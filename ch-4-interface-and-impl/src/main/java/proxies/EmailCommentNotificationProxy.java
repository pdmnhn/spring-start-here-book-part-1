package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import models.Comment;


@Component
@Qualifier("Email")
public class EmailCommentNotificationProxy implements CommentNotificationProxy {
    @Override public void sendComment(Comment comment) {
        System.out.println("Sending email notification for comment: " + comment.getText());
    }
}
