package enums;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public enum  ResultCodeEnum {
    /*** 通用部分 ***/
    // 通用成功请求
    SUCCESS(0, "请求成功"),
    //通用失败请求
    FAIL(1, "请求失败"),

    ;
    /**
     * 响应状态码
     */
    private Integer code;
    /**
     * 响应信息
     */
    private String message;

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
