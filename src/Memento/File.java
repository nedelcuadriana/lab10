package Memento;

import java.text.SimpleDateFormat;
import java.util.Date;

public class File {
    private String content;
    private String id;
    private String address;
    private String name;

    public File(String content, String id, String address, String name) {
        this.content = content;
        this.id = id;
        this.address = address;
        this.name = name;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "File{" +
                "content='" + content + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void print() {
        System.out.println(this);
    }

    public FileSnapshot createSnapshot(String message) {
        return new FileSnapshot(
                this.content,
                VersionControl.getNextVersionNo(),
                new SimpleDateFormat("dd-MM-yyyy").format(new Date()),
                message
        );
    }

    public void restoreToSomePoint(FileSnapshot snapshot) {
        this.content = snapshot.getContent();
    }
}
