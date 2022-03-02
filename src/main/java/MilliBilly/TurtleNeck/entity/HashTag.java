package MilliBilly.TurtleNeck.entity;

public class HashTag {

    private Long tagId;
    private String tagName;
    private String categorty;

    public HashTag(Long tagId, String tagName, String categorty) {
        this.tagId = tagId;
        this.tagName = tagName;
        this.categorty = categorty;
    }

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getCategorty() {
        return categorty;
    }

    public void setCategorty(String categorty) {
        this.categorty = categorty;
    }
}
