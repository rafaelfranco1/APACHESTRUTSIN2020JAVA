package br.com.projeto.action;

import java.util.ArrayList;
import java.util.List;

import br.com.projeto.model.Language;

import com.opensymphony.xwork2.ActionSupport;

	

@SuppressWarnings("serial")
public class RadioButtonAction extends ActionSupport{
	
	private List <String> genders;
	private List <Language> languages;
	
	private String youGender;
	private String youAnswer;
	public List<String> getGenders() {
		return genders;
	}

	public void setGenders(List<String> genders) {
		this.genders = genders;
	}

	public List<Language> getLanguages() {
		return languages;
	}

	public void setLanguages(List<Language> languages) {
		this.languages = languages;
	}

	public String getYouGender() {
		return youGender;
	}

	public void setYouGender(String youGender) {
		this.youGender = youGender;
	}

	public String getYouAnswer() {
		return youAnswer;
	}

	public void setYouAnswer(String youAnswer) {
		this.youAnswer = youAnswer;
	}

	public String getYouLanguage() {
		return youLanguage;
	}

	public void setYouLanguage(String youLanguage) {
		this.youLanguage = youLanguage;
	}

	public static String getMale() {
		return MALE;
	}

	public static String getFemale() {
		return FEMALE;
	}

	public static String getUnknown() {
		return UNKNOWN;
	}

	private String youLanguage;
	
	private static final String MALE = "Masculino";
	private static final String FEMALE = "Feminino";
	private static final String UNKNOWN = "Desconhecido";
	
	public RadioButtonAction() {
		genders = new ArrayList<String>();
		genders.add(MALE);
		genders.add(FEMALE);
		genders.add(UNKNOWN);
		
		languages = new ArrayList<Language>();
		languages.add(new Language("ES","Espanha"));
		languages.add(new Language("US","Estados Unidos"));
		languages.add(new Language("BR","BRASIL"));
		languages.add(new Language("CH","China"));
	}
	
	public String getDefaultLanguageValue() {
		return "BR";
	}
	
	public String getDefaultGenderValue() {
		return "UNKNOWN";
	}
	public String display () {
		return NONE;
	}
	
	public String execute()throws Exception {
		System.out.println("Executou Radio Button");
		return "success";
	}
}
