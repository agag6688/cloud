package com.aiguo.springcloud.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * @ClassName : GateWayConfig
 * @packageName ：com.aiguo.springcloud.config
 * @Author : aiguo
 * @Date: 2023年03月08 上午1:05
 * @Description :
 */

@Configuration
public class GateWayConfig
{
    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder routeLocatorBuilder)
    {
        RouteLocatorBuilder.Builder routes = routeLocatorBuilder.routes();

        routes.route("path_route_atguigu",
                r -> r.path("/bbs")
                        .uri("https://www.kuangstudy.com/bbs"));

        return routes.build();
    }
}

