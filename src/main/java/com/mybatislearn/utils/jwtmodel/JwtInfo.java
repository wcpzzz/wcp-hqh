package com.mybatislearn.utils.jwtmodel;

public class JwtInfo {

    private String uid;
//    private String uname;

    public JwtInfo(String uid) {
        this.uid = uid;
//        this.uname = uname;
    }

    public String getUid() {
        return uid;
    }

    public void setUid(String uid) {
        this.uid = uid== null ? null : uid.trim();
    }

/*    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }*/
}
