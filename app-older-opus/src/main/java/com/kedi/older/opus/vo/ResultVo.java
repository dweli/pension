package com.kedi.older.opus.vo;

/**
* @Description:    返回的实体类
* @Author:         ytw
* @CreateDate:     2019/7/12 9:57
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ResultVo<T> {
    private Integer code;
    private String msg;
    private T data;

    public ResultVo() {
    }

    public ResultVo(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public ResultVo(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
