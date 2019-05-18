package com.jzh.mybatis.beans;

public class EmpDnameBean {

    private int empno;

    private String ename;

    private int deptno;

    private String dname;

    public EmpDnameBean() {
    }

    public EmpDnameBean(int empno, String ename, int deptno, String dname) {
        this.empno = empno;
        this.ename = ename;
        this.deptno = deptno;
        this.dname = dname;
    }

    public int getEmpno() {
        return empno;
    }

    public void setEmpno(int empno) {
        this.empno = empno;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getDeptno() {
        return deptno;
    }

    public void setDeptno(int deptno) {
        this.deptno = deptno;
    }

    public String getDname() {
        return dname;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    @Override
    public String toString() {
        return "EmpDnameBean{" +
                "empno=" + empno +
                ", ename='" + ename + '\'' +
                ", deptno=" + deptno +
                ", dname='" + dname + '\'' +
                '}';
    }
}
