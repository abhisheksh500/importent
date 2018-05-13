/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectivity;

/**
 *
 * @author Abhishek
 */
public class Dao {
    public String name,password,secname;

    public Dao(String name, String password, String secname) {
        this.name = name;
        this.password = password;
        this.secname = secname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getSecname() {
        return secname;
    }

    public void setSecname(String secname) {
        this.secname = secname;
    }

    public Dao(String name) {
        this.name = name;
    }

    public Dao(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
