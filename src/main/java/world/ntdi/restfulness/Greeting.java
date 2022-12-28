package world.ntdi.restfulness;

public class Greeting {
    private final long ID;
    private final String contents;

    public Greeting(long ID, String contents) {
        this.ID = ID;
        this.contents = contents;
    }

    public long getID() {
        return ID;
    }

    public String getContents() {
        return contents;
    }
}
