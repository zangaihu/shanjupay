package com.shanjupay.merchant.controller;


import com.shanjupay.merchant.service.StoreService;
import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author author
 * @since 2021-06-27
 */
@Slf4j
@Controller
@Api(value = "", tags = "", description="")
public class StoreController {

    @Autowired
    private StoreService storeService;
}
