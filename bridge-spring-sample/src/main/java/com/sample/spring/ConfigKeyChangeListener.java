package com.sample.spring;

import com.bridge.annotation.BridgeValueChangedListener;
import com.bridge.listener.PropertiesChangeListener;
import com.bridge.zookeeper.data.ConfigKeyNodeData;
import lombok.extern.slf4j.Slf4j;

/**
 * @author Jay
 * @version v1.0
 * @description 对key "jdbc.url"监听
 * @date 2019-02-19 14:49
 */
@Slf4j
@BridgeValueChangedListener(key = "jdbc.url")
public class ConfigKeyChangeListener implements PropertiesChangeListener {

    /**
     * 当值发生变化前
     *
     * @param configKeyNodeData {@link ConfigKeyNodeData}
     */
    @Override
    public void onBeforePropertiesChanged(ConfigKeyNodeData configKeyNodeData) {
        log.info("当值发生变化前，接收到回调------>:{}", configKeyNodeData);
    }

    /**
     * 当值发生变化后
     *
     * @param configKeyNodeData {@link ConfigKeyNodeData}
     */
    @Override
    public void onPropertiesChanged(ConfigKeyNodeData configKeyNodeData) {
        log.info("当值发生变化后，接收到回调------>:{}", configKeyNodeData);
    }
}
