package com.epam.web.entity;

import java.util.Date;

public class Recipe implements Entity{

    private Long id;
    private Date requestdate;
    private Boolean status;

    public Recipe(Long id, Date requestdate, Boolean status) {
        this.id = id;
        this.requestdate = requestdate;
        this.status = status;
    }

    @Override
    public Long getId(){return id;}

    public void setId(Long id) {
        this.id = id;
    }

    public Date getRequestdate() {
        return requestdate;
    }

    public void setRequestdate(Date requestdate) {
        this.requestdate = requestdate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
