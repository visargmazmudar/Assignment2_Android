
package com.example.macstudent.catalog;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class User implements Serializable {

    public static final String USER_PARAM = "user_object";
    private long id;
    private String rname;
    private String rdetail;
    private String rrating;

    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * No args constructor for use in serialization
     * 
     */
    public User() {
    }

    /**
     * 
     * @param id
     * @param phone
     * @param username
     * @param website
     * @param address
     * @param email
     * @param company
     * @param name
     */
    public User(long id, String rname, String rdetail, String rrating) {
        super();
        this.id = id;
        this.rname = rname;
        this.rdetail = rdetail;
        this.rrating = rrating;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getRName()
    {
        return rname;
    }

    public void setRName(String rname)
    {
        this.rname = rname;
    }

    public String getRdetail()
    {
        return rdetail;
    }

    public void setRdetail(String rdetail)
    {
        this.rdetail = rdetail;
    }


    public String getRrating()
    {
        return rrating;
    }

    public void setRrating(String rrating)
    {
        this.rrating = rrating;
    }




    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
