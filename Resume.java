//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

/**This is class resume that will hold the data for a resume and provide the
 * front end with access to the encapsulated data.*/
public class Resume {
    private String education;
    private String techSkills;
    private String projects;
    private String workXP;
    private String aboutMe;
    private String contactInfo;

    public Resume() {
       education = "";
       techSkills    = "";
       projects = "";
       workXP   = "";
       aboutMe= "";
       contactInfo = "";
    }

    public String getEducation() { return this.education; }

    public String getProjects() {return this.projects; }

    public String getTechSkills() { return this.techSkills; }

    public String getWorkXP() { return this.workXP; }

    public String getAboutMe(){return this.aboutMe;}

    public String getContactInfo(){return this.contactInfo;}

    public void setContactInfo(String s){ contactInfo= s; }

    public void setAboutMe(String s){ aboutMe= s; }

    public void setEducation(String education) { this.education = education; }

    public void setProjects(String projects) { this.projects = projects; }

    public void setWorkXP(String workXP) { this.workXP = workXP; }

    public void setTechSkills(String techSkills) { this.techSkills = techSkills; }

    public int hashCode() { return super.hashCode(); }

    public String toString() {
        return this.education + "\n" + this.techSkills + "\n" + this.projects + "\n" + this.workXP
        + "\n" + this.aboutMe+ "\n" +this.contactInfo;
    }

    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
