package Memento;

public class Main {
    public static void main(String[] args) {
        File poza = new File("primul content", "1", "desktop", "poza.jpg");
        VersionControl versionControl = new VersionControl();

        versionControl.addFileSnapshot(poza.createSnapshot("prima poza"));

        poza.setContent("al doilea content");
        versionControl.addFileSnapshot(poza.createSnapshot("a doua poza"));

        poza.setContent("al treilea content");
        poza.print();

        versionControl.listSnapshotList();


        poza.restoreToSomePoint(versionControl.getFileSnapshotByVersion(2));
        poza.print();
    }
}
