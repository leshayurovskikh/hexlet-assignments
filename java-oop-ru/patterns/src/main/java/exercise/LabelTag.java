package exercise;

// BEGIN
public class LabelTag implements TagInterface {

String label;
TagInterface tag;

    public LabelTag(String label, TagInterface tag) {
        this.label = label;
        this.tag = tag;
    }

    @Override
    public String render() {
        String textTag = tag.render();
        return "<label>" + label + textTag + "</label>";
    }
}
// END
