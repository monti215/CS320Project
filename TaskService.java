package info;

public class Task {
    private final String taskID;
    private final String name;
    private final String description;

    public Task(String taskID, String name, String description) {
        if (taskID == null || taskID.length() > 10) {
            throw new IllegalArgumentException("Task ID must be non-null and no longer than 10 characters");
        }
        if (name == null) {
            throw new IllegalArgumentException("Name must be non-null");
        }
        if (description == null) {
            throw new IllegalArgumentException("Description must be non-null");
        }
        if (name.length() > 20) {
            throw new IllegalArgumentException("Name must not exceed 20 characters");
        }
        if (description.length() > 50) {
            throw new IllegalArgumentException("Description must not exceed 50 characters");
        }
        this.taskID = taskID;
        this.name = name;
        this.description = description;
    }

    public String getTaskID() {
        return taskID;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

	public void setName(String name2) {
		// TODO Auto-generated method stub
		
	}

	public void setDescription(String description2) {
		// TODO Auto-generated method stub
		
	}
}
