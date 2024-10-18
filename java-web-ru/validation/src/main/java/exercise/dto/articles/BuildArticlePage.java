import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Getter;

// BEGIN
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class BuildArticlePage {
    private String title;
    private String content;
    private Map<String, List<ValidationError<Object>>> errors;
}
// END