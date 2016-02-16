package theironyard;

/**
 * Created by ericweidman on 2/16/16.
 */
public class ToDoItem {
    String text;
    boolean isDone;

    @Override
    public String toString() {
        return text + (isDone ? " (done)" : "");
    }

    public ToDoItem(String text) {
        this.text = text;
        this.isDone = false;

    }
}
