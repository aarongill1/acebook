package MVP;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class PostsController {
    @Autowired
    private PostRepository postRepository;

    @GetMapping("/")
    public String Hello(Model model) {
        return "acebook";
    }

    @GetMapping("/posts")
    public String displayPosts(Model model) {
        model.addAttribute("post", new Post());
        return "posts";
    }

    @PostMapping("/posts")
    public String submitPost(@ModelAttribute Post post) {
        postRepository.save(post);
        return "result";
    }

    @GetMapping("/feed")
    public String getPosts(Model model) {
        model.addAttribute("posts", postRepository.findAll());
        return "feed";
    }
}
