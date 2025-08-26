package apiautomation;

import lombok.Data;

@Data
public class Support {
    private String url;
    private String text;

    // Getters and setters
    public String getUrl() { return url; }
    public void setUrl(String url) { this.url = url; }

    public String getText() { return text; }
    public void setText(String text) { this.text = text; }
}
