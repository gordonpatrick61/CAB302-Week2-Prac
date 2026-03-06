public class ToDoItem {
    private String description;
    boolean isDone;

    // TODO Now:
    public ToDoItem(String description)
    {
        isDone = false;
        description = this.description;
    }

    public String GetDescription()
    {
        return description;
    }

    public void SetDescription(String description)
    {
        description = this.description;
    }

    public boolean GetIsDone()
    {
        return isDone;
    }
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}