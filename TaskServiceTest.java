package Test;

import static org.junit.Assert.assertNull;

import org.junit.Test;

import info.Task;
import info.TaskService;

public class TaskServiceTest {
	
    @Test
    public void testAddTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1234567890", "Buy A Car", "Let us go shopping for a new car");
        taskService.addTask(task);
    }

    @Test
    public void testDeleteTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1234567890", "Buy A Car", "Let us go shopping for a new car");
        taskService.addTask(task);
        taskService.deleteTask("1234567890");
        assertNull(taskService.getTaskID("1234567890"));
    }

    @Test
    public void testUpdateTask() {
        TaskService taskService = new TaskService();
        Task task = new Task("1234567890", "Buy A Car", "Let us go shopping for a new car");
        taskService.addTask(task);
        taskService.updateTask("ABCDE12345", "Maybe Buy A Car", "I will see what my wife is doing that day to go shopping.");
    }
	
	
}
