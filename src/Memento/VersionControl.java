package Memento;

import java.util.HashMap;

public class VersionControl {
    private final HashMap<Integer, FileSnapshot> versions;
    private static int version;

    public VersionControl() {
        versions = new HashMap<>();
    }

    public void addFileSnapshot(FileSnapshot snapshot) {
        version++;
        versions.put(version, snapshot);
    }

    public FileSnapshot getFileSnapshotByVersion(int targetVersion) {

        return versions.get(targetVersion);
    }

    public void listSnapshotList() {
        System.out.println(versions);
    }

    public static int getNextVersionNo() {
        return version + 1;
    }
}
