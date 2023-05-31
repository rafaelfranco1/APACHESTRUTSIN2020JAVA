public class XS {

    private List <String> Engine;
    private String youSearch;
    private String youMonth;

    public String getDefaultSearch() {
        return "www.google.com.br";
    }

    public XS() {
        Engine = new ArrayList();
        Engine.add("www.google.com.br");
        Engine.add("www.facebook.com.br");
        Engine.add("www.instagram.com");
        Engine.add("www.youtube.com.br");
        Engine.add("www.tiktok.com.br");
    }

    public String display() {
        return NONE;
    }

    public String execute () throws Exception {
        return "success";
    }
}