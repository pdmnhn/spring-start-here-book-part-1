package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import models.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;


@Service
public class CommentService {
    private final CommentRepository repository;
    private final CommentNotificationProxy notificationProxy;

    @Autowired
    public CommentService(CommentRepository repository,
            @Qualifier("Push") CommentNotificationProxy notificationProxy) {
        this.repository = repository;
        this.notificationProxy = notificationProxy;
    }

    public void publishComment(Comment comment) {
        repository.storeComment(comment);
        notificationProxy.sendComment(comment);
    }
}
