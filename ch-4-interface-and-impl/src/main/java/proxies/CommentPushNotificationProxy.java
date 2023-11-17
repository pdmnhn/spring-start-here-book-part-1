package proxies;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import models.Comment;


@Component
@Qualifier("Push")
public class CommentPushNotificationProxy implements CommentNotificationProxy {
    @Override public void sendComment(Comment comment) {
        System.out.println("Sending push notification for comment: " + comment.getText());
    }
}
