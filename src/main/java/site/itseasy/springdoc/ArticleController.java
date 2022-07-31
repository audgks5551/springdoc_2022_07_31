package site.itseasy.springdoc;

import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.springframework.http.HttpStatus.*;

@Tag(name = "게시글 CRUD")
@RestController
@RequestMapping("/articles")
public class ArticleController {

    @GetMapping
    @ResponseStatus(OK)
    public List<Article> all() {

        return Arrays.asList(
                new Article(1L, "제목1", "내용1", LocalDateTime.now(), LocalDateTime.now()),
                new Article(2L, "제목2", "내용2", LocalDateTime.now(), LocalDateTime.now()),
                new Article(3L, "제목3", "내용3", LocalDateTime.now(), LocalDateTime.now())
        );
    }

    @GetMapping("/{articleId}")
    @ResponseStatus(OK)
    public Article one(@PathVariable Long articleId) {

        return new Article(1L, "제목1", "내용1", LocalDateTime.now(), LocalDateTime.now());
    }

    @PostMapping
    @ResponseStatus(CREATED)
    public Article newArticle(@RequestBody Article article) {

        return article;
    }

    @PutMapping
    @ResponseStatus(OK)
    public Article modify(@RequestBody Article article) {

        return article;
    }

    @DeleteMapping("/{articleId}")
    @ResponseStatus(NO_CONTENT)
    public void delete(@PathVariable Long articleId) {
    }
}
