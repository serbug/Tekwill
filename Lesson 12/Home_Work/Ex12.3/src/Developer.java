import java.util.Arrays;

public class Developer extends Employee{

    protected String mainLanguage;
    protected String[] skills;

    public Developer(String name, String email, int experience, String mainLanguage, String[] skills) {
        super(name, email, experience);
        this.mainLanguage = mainLanguage;
        this.skills = skills;
    }
    public String getMainLanguage() {
        return mainLanguage;
    }

    public String[] getSkills() {
        return skills;
    }

    @Override
    public String toString() {
        return "Developer{" +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", experience=" + experience +
                ", mainLanguage='" + mainLanguage + '\'' +
                ", skills=" + Arrays.toString(skills) +
                '}';
    }
}
