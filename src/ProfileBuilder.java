import java.util.LinkedHashMap;
import java.util.Map;

public class ProfileBuilder {
    public Map<String, String> takeIntroDetails(){
        IntroductionSec intro = new IntroductionSec();
        Map<String, String> introInfo = new LinkedHashMap<>();
        introInfo = intro.takeTheDetails();
        return introInfo;
    }
    public Map<String, String> takeExprnDetails(){
        ExperienceSec exprn = new ExperienceSec();
        Map<String, String> exprnInfo = new LinkedHashMap<>();
        exprnInfo = exprn.takeTheDetails();
        return exprnInfo;
    }
    public Map<String, String> takeEduDetails(){
        EducationSec edu = new EducationSec();
        Map<String, String> eduInfo = new LinkedHashMap<>();
        eduInfo = edu.takeTheDetails();
        return eduInfo;
    }
    public Map<String, String> takeSkillsDetails(){
        Skills skills = new Skills();
        Map<String, String> skillsInfo = new LinkedHashMap<>();
        skillsInfo = skills.takeTheDetails();
        return skillsInfo;
    }
    public Map<String, String> takeLangDetails(){
        LanguageSec lang = new LanguageSec();
        Map<String, String> langInfo = new LinkedHashMap<>();
        langInfo = lang.takeTheDetails();
        return langInfo;
    }


}
