package com.kedi.bilanshan.utils;


import com.kedi.bilanshan.vo.ResultVo;

public class ResultVOUtil {
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
