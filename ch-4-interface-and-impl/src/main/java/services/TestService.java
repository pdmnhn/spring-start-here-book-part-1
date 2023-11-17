package services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import main.PrototypeBeanComponent;
import repositories.CommentRepository;


@Service
@Lazy
public class TestService {
    private final CommentRepository commentRepository;

    @Autowired
    private PrototypeBeanComponent prototypeBeanComponent;

    @Autowired
    public TestService(@Qualifier("DBCommentRepository") CommentRepository commentRepository) {
        System.out.println("Instantiating the TestService class!");
        this.commentRepository = commentRepository;
    }

    public PrototypeBeanComponent getPrototypeBeanComponent() {
        return this.prototypeBeanComponent;
    }
}
