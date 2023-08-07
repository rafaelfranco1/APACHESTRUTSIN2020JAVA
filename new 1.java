public class TestAction {
	
	String message;
	String firstName;
	
	public String execute() 
	{
		System.out.println("execute () method called");
		message = "SUCESS Message";
		System.out.println("Name: "+firstName);
		return "success";
	}
	
	public String getMessage() {
		return message;
	}
	
	public void setMessage(String message) {
		this.message = message;
	}
	
	public String getFirstName() {
		return firstName;
		
	}
	
	public String setFirstName() {
		
		this firstName = firstName;
	}
	
	//Criar uma string do que ser exibido no HTML(JSP)
	//Criar um return que será procurado pela JSP no arquivo JAVA
	//criar getter and setter para a string 