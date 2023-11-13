public class DoubleSelectAction extends ActionSupport {
	
	private String Fruit1;
	private String Fruit2;
	private String Server1;
	private String Server2;
	private String Language1;
	private String Language2;
	
	Map language; //importar control Shift O 
	//gerar ggas private String fruit1 até Map LanguageMap
	public DoubleSelectAction() {
		
		languageMap = new HashMap(); //importar control Shift O 
		languageMap.put("SQL" ,new ArrayList<String>(Arrays.asList("Microsoft","Oracle")); //importar control Shift O
		languageMap.put("Oracle", new ArrayList<String>(Arrays.asList("11g","10g","9g"));
		languageMap.put("PostGresql" new ArrayList<String>(Arrays.asList("SQL POSTGRES"));
		
	}
	
	public String display() {
		return NONE;
	}
	public String execute() throws Exception {
		return "success";
	}
	
}