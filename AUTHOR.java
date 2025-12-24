public class AUTHOR {

    private Integer authorId;
    private String name;
    private String biography;

    // Constructor
    public AUTHOR(Integer authorId, String name, String biography) {
        this.authorId = authorId;
        this.name = name;
        this.biography = biography;
    }

    // Getter for authorId
    public Integer getAuthorId() {
        return authorId;
    }

    // Setter for authorId
    public void setAuthorId(Integer authorId) {
        this.authorId = authorId;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for biography
    public String getBiography() {
        return biography;
    }

    // Setter for biography
    public void setBiography(String biography) {
        this.biography = biography;
    }
}
