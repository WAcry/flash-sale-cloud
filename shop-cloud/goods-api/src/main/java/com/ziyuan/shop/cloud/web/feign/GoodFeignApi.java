package com.ziyuan.shop.cloud.web.feign;

import com.ziyuan.shop.cloud.domain.Good;
import com.ziyuan.shop.cloud.resp.Result;
import com.ziyuan.shop.cloud.web.feign.hystrix.GoodFeignHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Set;

@FeignClient(name = "goods-server", fallback = GoodFeignHystrix.class)
public interface GoodFeignApi {

    /**
     * @param idList
     * @return
     */
    @RequestMapping("/getListByIdList")
    Result<List<Good>> getListByIdList(@RequestParam("idList") Set<Long> idList);
}
