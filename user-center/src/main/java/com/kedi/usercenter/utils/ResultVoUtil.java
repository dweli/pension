package com.kedi.usercenter.utils;


import com.kedi.usercenter.vo.ResultVo;

/**
* @Description:    返回值的封装类
* @Author:         ytw
* @CreateDate:     2019/7/12 9:57
* @UpdateRemark:   修改内容
* @Version:        1.0
*/
public class ResultVoUtil {
    public static ResultVo success(Object object){
        ResultVo<Object> resultVo = new ResultVo<>();
        resultVo.setCode(1);
        resultVo.setMsg("成功");
        resultVo.setData(object);
        return resultVo;
    }

    public static ResultVo success(){
        return success(null);
    }

    public static ResultVo error(Integer code,String msg){
        ResultVo<Object> resultVO = new ResultVo<>();
        resultVO.setCode(code);
        resultVO.setMsg(msg);
        return resultVO;
    }
}
