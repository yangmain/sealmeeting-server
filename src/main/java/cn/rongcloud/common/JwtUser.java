package cn.rongcloud.common;

import lombok.Data;

/**
 * Created by weiqinxiao on 2019/2/27.
 */
@Data
public class JwtUser {
    private String userId;
    private String roomId;
    private String userName;
    private int deviceType;
}
