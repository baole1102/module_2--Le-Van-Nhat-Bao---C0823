package cuoimodule2.module;

public class Bug {
    private String id;
    private String name;
    private String description;
    private String time;
    private String dangerous;

    public Bug() {
    }

    public Bug(String name, String description, String time, String dangerous) {
        this.name = name;
        this.description = description;
        this.time = time;
        this.dangerous = dangerous;
    }

    public Bug(String id, String name, String description, String time, String dangerous) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.time = time;
        this.dangerous = dangerous;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDangerous() {
        return dangerous;
    }

    public void setDangerous(String dangerous) {
        this.dangerous = dangerous;
    }

    @Override
    public String toString() {
        return "Bug{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", time='" + time + '\'' +
                ", dangerous='" + dangerous + '\'' +
                '}';
    }
}
