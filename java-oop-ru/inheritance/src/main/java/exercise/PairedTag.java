package exercise;

import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

// BEGIN
public class PairedTag extends Tag {
    String body;
    List<Tag> children;


    public PairedTag(String name, Map<String, String> atribute, String body, List<Tag> children) {
        super(name, atribute);
        this.body = body;
        this.children = children;
    }
    @Override
    public String toString() {
        String superToString = super.toString();

        String res = children.stream()
                .map(Tag :: toString)
                .collect(Collectors.joining());

        return String.format("%s%s%s</%s>", superToString, body, res, getName());
    }
}
// END
