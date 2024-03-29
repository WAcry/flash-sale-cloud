package com.ziyuan.shop.cloud.mq.msg;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateSeckillOrderMsg implements Serializable {

    private String uuid;
    private Long seckillId;
    private Long userId;
}
