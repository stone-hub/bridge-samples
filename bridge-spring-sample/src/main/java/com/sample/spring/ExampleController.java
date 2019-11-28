package com.sample.spring;

import com.bridge.annotation.BridgeValue;
import com.bridge.utils.rpc.RpcResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author Jay
 * @version v1.0
 * @description 请添加类描述
 * @date 2018-12-29 16:19
 */
@Controller
@Slf4j
public class ExampleController {


    @Autowired
    private TestBO testBO;

    @Value("${jdbc.url}")
    private String testOne;

    @BridgeValue(value = "${jdbc.url}", autoRefreshed = true)
    private String testTwo;

    @BridgeValue(value = "${jdbc.url}")
    private String testThree;


    @RequestMapping("/test")
    @ResponseBody
    public RpcResponse<String> test() {
        return RpcResponse.wrapSuccessfulResult("testTwo(@BridgeValue(value = ${jdbc.url}, autoRefreshed = true))=" +
                testTwo + ",testThree(@value)=" + testOne + ",testThree(@BridgeValue(value = ${jdbc.url}))=" + testThree
                + ",TestBO#abString($>>F{jdbc.url})= " + testBO.getAbString() + ",TestBO#keyObj(${jdbc.url})= " + testBO.getKeyObj()
                + ",TestBO#keyObjOne($>>T{jdbc.url})= " + testBO.getKeyObjOne() + ",TestBO#keyObjTwo($>>{jdbc.url})= " + testBO.getKeyObjTwo());
    }

}
