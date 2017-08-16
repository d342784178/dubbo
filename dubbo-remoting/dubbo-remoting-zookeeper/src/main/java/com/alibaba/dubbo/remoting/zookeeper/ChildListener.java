package com.alibaba.dubbo.remoting.zookeeper;

import java.util.List;

/**
 * 子节点监听
 */
public interface ChildListener {

	void childChanged(String path, List<String> children);

}
