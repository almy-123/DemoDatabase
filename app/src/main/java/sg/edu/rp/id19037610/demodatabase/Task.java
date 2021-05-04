package sg.edu.rp.id19037610.demodatabase;

public class Task {
    private int _id;
    private String description;
    private String date;

    public Task(int _id, String description, String date) {
        this._id = _id;
        this.description = description;
        this.date = date;
    }

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
