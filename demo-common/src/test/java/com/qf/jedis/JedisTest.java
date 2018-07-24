/*
package com.qf.jedis;

import org.junit.Test;
import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

*/
/**
 * User: DHC
 * Date: 2018/7/24
 * Time: 10:16
 * Version:V1.0
 *//*

public class JedisTest {

    @Test
    public void test1(){
        Jedis jedis = new Jedis("101.132.38.253", 6379);
        jedis.auth("dhcdhc$$");
        System.out.println(jedis.get("name"));
    }
    @Test
    public void test2(){
        JedisPool jedisPool = new JedisPool("101.132.38.253", 6379);
        Jedis jedis = jedisPool.getResource();
        jedis.auth("dhcdhc$$");
        System.out.println(jedis.get("name"));
    }

    @Test
    public void test3() throws IOException {
        //创建集群的集合
        Set<HostAndPort> nodes = new HashSet<HostAndPort>();
        nodes.add(new HostAndPort("106.12.6.239",9001));
        nodes.add(new HostAndPort("106.12.6.239",9002));
        nodes.add(new HostAndPort("106.12.6.239",9003));
        nodes.add(new HostAndPort("106.12.6.239",9004));
        nodes.add(new HostAndPort("106.12.6.239",9005));
        nodes.add(new HostAndPort("106.12.6.239",9006));
        //获取JedisCluster对象
        JedisCluster jedisCluster = new JedisCluster(nodes);
        //打印出集群中查询出的内容
        System.out.println(jedisCluster.get("name"));
        //释放资源
        jedisCluster.close();

    }
}
*/
