//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.io.*;


/**This class reads in and assign data from a test file. It also provides the functionaries
 to allow you acees that data.*/

public class ResumeReader {
    private Resume myResume;
    private File file;
    String s;
    BufferedReader br = null;

    public ResumeReader() {
        this.file = file;
        this.myResume = new Resume();
        this.readResume();
    }

    public void readResume() {

        //checks used to make sure data is read in right area
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = true;
        boolean flag4 = true;
        boolean flag5 = true;


        try {

            InputStream in = getClass().getResourceAsStream("resume1");
            StringBuilder sb = new StringBuilder();
            this.br = new BufferedReader(new InputStreamReader(in));

            while(true) {
                while(true) {
                    do {
                        if ((this.s = this.br.readLine()) == null) {
                            return;
                        }
                    } while(this.s.isEmpty());

                    if (!this.s.equals("TECHNICAL SKILLS") && flag1) {

                        sb.append(this.s + "\n");
                        this.myResume.setEducation(sb.toString());

                    } else if (flag1) {

                        flag1 = false;
                        sb = new StringBuilder();
                        sb.append(this.s + "\n");

                    } else if (!this.s.equals("ACADEMIC PROJECTS") && flag2) {

                        sb.append(this.s + "\n");
                        this.myResume.setTechSkills(sb.toString());

                    } else if (flag2) {

                        flag2 = false;
                        sb = new StringBuilder();

                        sb.append(this.s + "\n");
                    } else if (!this.s.equals("WORK EXPERIENCE") && flag3) {

                        sb.append(this.s + "\n");
                        this.myResume.setProjects(sb.toString());

                    } else if (flag3) {

                        flag3 = false;
                        sb = new StringBuilder();
                        sb.append(this.s + "\n");

                    } else if (!this.s.equals("Joshua Shilts") && flag4) {

                        sb.append(this.s + "\n");
                        this.myResume.setWorkXP(sb.toString());
                    }else if (flag4){

                        flag4 = false;
                        sb = new StringBuilder();
                        sb.append(this.s + "\n");

                    }else if (!this.s.equals("Contact Info")&&flag5){
                        sb.append(this.s + "\n");
                        this.myResume.setAboutMe(sb.toString());
                    }else if (flag5){
                        flag5 = false;
                        sb = new StringBuilder();
                        sb.append(this.s + "\n");
                    }else{
                        sb.append(s + "\n");
                        this.myResume.setContactInfo(sb.toString());
                    }
                }
            }
        } catch (Exception var14) {
            var14.printStackTrace();
            System.out.println("error in file reader line 30ish");
        } finally {
            if (this.br != null) {
                try {
                    this.br.close();
                } catch (IOException var13) {
                    var13.printStackTrace();
                }
            }

        }

    }

    public String toString() {
        return this.myResume.toString();
    }

    public String getEdu() {
        return this.myResume.getEducation();
    }

    public String getS(){return this.myResume.getTechSkills();}

    public String getProjects(){return this.myResume.getProjects();}

    public String getWorkXp(){return this.myResume.getWorkXP();}

    public String getAboutMe(){return this.myResume.getAboutMe();}

    public String getContactInfo(){return this.myResume.getContactInfo();}
}
