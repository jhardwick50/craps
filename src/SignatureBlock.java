

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jason
 */
public class SignatureBlock {
    private String name = "Jason Hardwick";
    private String courseID = "CIS 214";
    private String email = "jason.hardwick@maine.edu";
    private String motto = "You may not realize it when it happens, but a kick in the teeth may be the best thing in the world for you." +" \n" + " -Walt Disney";

    public void setName(String name) {
        this.name = name;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMotto(String motto) {
        this.motto = motto;
    }

    public String getName() {
        return name;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getEmail() {
        return email;
    }

    public String getMotto() {
        return motto;
    }
    
    @Override
    public String toString()
    {
        return name + "\n" + courseID + "\n" + email + "\n" + motto;
    }
    
}
