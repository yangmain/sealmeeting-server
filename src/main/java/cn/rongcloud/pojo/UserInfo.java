package cn.rongcloud.pojo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "t_user")
public class UserInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private @Getter @Setter String uid;
    private @Getter @Setter String name;
    private @Getter @Setter String portrait;
    private @Getter @Setter Date createDt;
    private @Getter @Setter Date updateDt;
}
