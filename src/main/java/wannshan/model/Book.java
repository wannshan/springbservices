package wannshan.model;

/**
 * 文件功能：xxxx
 *
 */
public class Book  {
    private Integer id;
    private String title;
    private String author;
    private Integer pagesNum;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPagesNum() {
        return pagesNum;
    }

    public void setPagesNum(Integer pagesNum) {
        this.pagesNum = pagesNum;
    }
}
