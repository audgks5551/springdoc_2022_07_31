package site.itseasy.springdoc;

import lombok.*;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Article {
    private Long id;
    @NotBlank
    @Size(min = 0, max = 20)
    private String title;
    @NotBlank
    private String body;
    private LocalDateTime created;
    private LocalDateTime modified;
}
