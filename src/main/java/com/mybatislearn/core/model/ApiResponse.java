package com.mybatislearn.core.model;

import com.mybatislearn.interceptor.RequestHolder;
import com.mybatislearn.interceptor.TokenUtil;
import com.mybatislearn.utils.jwtmodel.Token;
import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 接口返回对象
 *
 * @author wcpzzz
 * @date 2020/07/06 10:09
 */
@Data
@AllArgsConstructor
public class ApiResponse<T>{

    private Boolean success;

    private String message;

    private T data;

    private String token;

    /**
     * 请求成功
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public static <T> ApiResponse success(T data) {
        return ApiResponse.success ("请求成功", data);
    }

    /**
     * 请求成功
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public static <T> ApiResponse success(String message, T data) {
        String token = RequestHolder.getId ();
        return new ApiResponse<> (Boolean.TRUE, message, data, token);
    }
    /**
     * 请求失败
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public static ApiResponse failed() {
        return ApiResponse.failed ("请求失败");
    }

    /**
     * 请求失败
     *
     * @author wcpzzz
     * @date 2020/07/06 10:09
     */
    public static ApiResponse failed(String message) {
        return new ApiResponse<> (Boolean.FALSE, message, null,null);
    }
}
