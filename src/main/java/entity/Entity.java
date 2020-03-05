package entity;

public class Entity {
    String letter;
    String name;
    String link;

    public Entity(String letter, String name, String link) {
        this.letter = letter;
        this.name = name;
        this.link = link;
    }

    public Entity(String letter, String link) {
        this.letter = letter;
        this.link = link;
    }

    @Override
    public String toString() {
        return "Entity{" +
                "letter=" + letter +
                ", name='" + name + '\'' +
                ", link='" + link + '\'' +
                '}';
    }

    public String getLetter() {
        return letter;
    }

    public void setLetter(String letter) {
        this.letter = letter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
