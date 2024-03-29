package at.ac.tgm.hit.syt.dezsys.hamplwortha.domain;


import javax.persistence.*;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

/**
 * The Knowledge entry
 *
 * @version 1.0
 * @author Burkhard Hampl [burkhard.hampl@student.tgm.ac.at]
 */
@Entity
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "knowledge", propOrder = {"id", "title", "content", "language"})
public class Knowledge{

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(nullable = false)
    @XmlElement(required = true)
    private String title;

    @Column(nullable = false)
    @XmlElement(required = true)
    private String content;

    @Column(nullable = false)
    @XmlElement(required = true)
    private String language;

    /**
     * Default Constructor
     */
    public Knowledge(){

    }

    /**
     * Initializes a new Knowledge entry with title, content, language
     *
     * @param title the title
     * @param content the content
     * @param language the language
     */
    public Knowledge(String title, String content, String language) {
        this.title = title;
        this.content = content;
        this.language = language;
    }

    public long getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
