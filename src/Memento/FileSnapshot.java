package Memento;

public class FileSnapshot {
    private String content;
    private final int version;
    private String datetime;
    private String message;

    public FileSnapshot(String content, int version, String datetime, String message) {
        this.content = content;
        this.version = version;
        this.datetime = datetime;
        this.message = message;
    }

    public String getContent() {
        return content;
    }

    public String getDetails() {
        return this.toString();
    }

    @Override
    public String toString() {
        return "FileSnapshot{" +
                "content='" + content + '\'' +
                ", version=" + version +
                ", datetime='" + datetime + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
