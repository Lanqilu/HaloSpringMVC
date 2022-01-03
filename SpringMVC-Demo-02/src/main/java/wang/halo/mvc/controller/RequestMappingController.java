package wang.halo.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Halo
 * @create 2022/01/03 下午 10:24
 * @description
 */
@Controller
@RequestMapping("/test")
public class RequestMappingController {

    // 此时请求映射所映射的请求的请求路径为：/test/testRequestMapping
    @RequestMapping("/testRequestMapping")
    public String testRequestMapping() {
        return "success";
    }

    // 测试 value 属性
    @RequestMapping(value = {"/t1", "/t2"})
    public String testRequestMapping2() {
        return "success";
    }

    // 测试 method 属性
    @RequestMapping(
            value = {"/t3", "/t4"},
            method = {RequestMethod.GET, RequestMethod.POST}
    )
    public String testRequestMapping3() {
        return "success";
    }

    @RequestMapping(value = "/t5", method = RequestMethod.POST)
    public String testRequestMapping4() {
        return "success";
    }

    // 测试 params 和 headers 属性
    @RequestMapping(
            value = "/t7",
            params = {"username", "password!=123456"},
            headers = {"Host=localhost:8080"}
    )
    public String testParamsAndHeaders() {
        return "success";
    }

    // 测试 Ant 风格的路径
    // @RequestMapping("/a?a/testAnt")
    // @RequestMapping("/a*a/testAnt")
    @RequestMapping("/**/testAnt")
    public String testAnt() {
        return "success";
    }

    // 测试路径占位符
    @RequestMapping("/t8/{id}/{username}")
    public String testRest(@PathVariable("id") String id, @PathVariable("username") String username) {
        System.out.println("id:" + id + ",username:" + username);
        return "success";
    }
    // 最终输出的内容为 → id:1,username:admin
}