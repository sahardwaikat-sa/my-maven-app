	package TODOLIST;

	import java.util.List;

	import org.openqa.selenium.By;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;




	public class toDoList {

	    @Test
	    public void verifyTodo() {

	        WebDriver driver = new ChromeDriver();

	        driver.get("https://todomvc.com/examples/angular/dist/browser/#/all");

	        // 1. Find the input field
	        WebElement todoInput = driver.findElement(
	                By.xpath("//input[@placeholder='What needs to be done?']")
	        );

	        // 2. Add Task 1
	        todoInput.sendKeys("task1");
	        todoInput.sendKeys(Keys.ENTER);

	        // 3. Add Task 2
	        todoInput.sendKeys("task2");
	        todoInput.sendKeys(Keys.ENTER);

	        // 4. Find all todo items
	        List<WebElement> todoList = driver.findElements(
	                By.cssSelector("ul.todo-list li")
	        );

	        // Verify list is not empty
	        Assert.assertFalse(todoList.isEmpty());

	        // Verify there are 2 tasks
	        Assert.assertEquals(todoList.size(), 2);

	        // 5. Find task1
	        WebElement task1 = driver.findElement(
	                By.xpath("//label[normalize-space()='task1']")
	        );

	        // 6. Find checkbox for task1
	        WebElement checkbox = task1.findElement(
	                By.xpath("./preceding-sibling::input[@type='checkbox']")
	                
	        );

	        // 7. Check task1
	        checkbox.click();

	        // 8. Verify checkbox is selected
	        Assert.assertTrue(checkbox.isSelected());

	        // 9. Find completed task
	        WebElement completedTask = driver.findElement(
	                By.xpath("//li[.//label[normalize-space()='task1']]")
	        );

	        // 10. Verify li has "completed" class
	        Assert.assertTrue(
	                completedTask.getAttribute("class").contains("completed")
	        );

	        System.out.println("Completed task: " + completedTask.getText());

	        // 11. Delete completed task
	        WebElement deleteButton = completedTask.findElement(
	                By.cssSelector("button.destroy")
	        );

	        deleteButton.click();

	        // 12. Verify task1 was deleted
	        List<WebElement> remainingTasks = driver.findElements(
	                By.cssSelector("ul.todo-list li")
	        );

	        Assert.assertEquals(remainingTasks.size(), 1);

	        // 13. Verify task1 no longer exists
	        List<WebElement> deletedTask = driver.findElements(
	                By.xpath("//label[normalize-space()='task1']")
	        );

	        Assert.assertTrue(deletedTask.isEmpty());

	        System.out.println("Task1 deleted successfully");

	        driver.quit();
	    }
	}
	
	
	
	
	
	


