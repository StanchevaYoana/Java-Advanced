package Google;

public class Children {
    private String childBirthday;
    private String childName;

    public Children(String childName, String childBirthday) {
        this.childName = childName;
        this.childBirthday = childBirthday;
    }

    public String getChildBirthday() {
        return childBirthday;
    }

    public String getChildName() {
        return childName;
    }
}
