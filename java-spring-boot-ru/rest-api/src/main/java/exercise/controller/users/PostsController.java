package exercise.controller.users;

import java.util.List;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;

import exercise.model.Post;
import exercise.Data;

// BEGIN
@RestController
@RequestMapping("/api")
public class PostsController {
    private List<Post> allPosts = Data.getPosts();

    @GetMapping("users/{id}/posts")
    public List<Post> showById(@PathVariable Integer id) {
        var result = allPosts.stream()
                .filter(post -> post.getUserId() == id)
                .toList();
        return result;
    }

    @PostMapping("/users/{id}/posts")
    public ResponseEntity<Post> createPostById(@PathVariable Integer id, @RequestBody Post post) {

        post.setUserId(id);
        allPosts.add(post);

        return ResponseEntity
                .status(201)
                .body(post);
    }
}
// END
