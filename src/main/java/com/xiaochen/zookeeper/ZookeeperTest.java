package com.xiaochen.zookeeper;

import org.apache.curator.RetryPolicy;
import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.CuratorFrameworkFactory;
import org.apache.curator.retry.ExponentialBackoffRetry;
import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.data.Stat;

import java.nio.charset.StandardCharsets;

/**
 * @author Chenyufeng
 * @date 2023/3/6
 */
public class ZookeeperTest {

    public static void main(String[] args) throws Exception {

        RetryPolicy retryPolicy = new ExponentialBackoffRetry(1000, 3);
        CuratorFramework client = CuratorFrameworkFactory.newClient("127.0.0.1:2181", retryPolicy);
        client.start();

        String str = "Life is a fucking movie";
        String path = "/test/xiaochen/zookeeper";

        client.create().creatingParentsIfNeeded()
                .withMode(CreateMode.EPHEMERAL)
                .forPath(path, str.getBytes(StandardCharsets.UTF_8));

        Stat stat = client.checkExists().forPath(path);

        if (stat != null) {
            client.delete().forPath(path);
        }
    }
}
