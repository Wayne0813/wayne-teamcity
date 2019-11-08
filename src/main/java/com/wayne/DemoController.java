package com.wayne;

import com.wayne.common.R;
import com.wayne.entity.DemoUser;
import com.wayne.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author Wayne
 * @Date 2019-09-29
 */
@RestController
@RequestMapping("/demo")
@SuppressWarnings("ALL")
public class DemoController {

    @Autowired
    private DemoService demoService;

    @GetMapping("/user")
    public R getUserById(Integer id) {
        return demoService.getUserById(id);
    }

    @PutMapping("/user")
    public R updateUserById(DemoUser user) {
        return demoService.updateUserById(user);
    }


    @PostMapping("/user")
    public R createUser(DemoUser user) {
        return demoService.createUser(user);
    }


    @DeleteMapping("/user")
    public R deleteUserById(Integer id) {
        return demoService.deleteUserById(id);
    }


    public void test() {
        // Iterator<String> iterators = transferLineMap.keySet().iterator();
        // //    Iterator<Map.Entry<String, TransferLine>> iterators = transferLineMap.keySet().iterator();
        // while (iterators.hasNext()) {
        //     String key = iterators.next();
        //     transferLineList.add(transferLineMap.get(key));
        // }
        // lineGrid.setData(transferLineList);
        // lineGrid.refresh();



    }

}
