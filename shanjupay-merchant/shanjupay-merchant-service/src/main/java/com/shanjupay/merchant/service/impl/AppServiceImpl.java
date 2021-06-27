package com.shanjupay.merchant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shanjupay.merchant.entity.App;
import com.shanjupay.merchant.mapper.AppMapper;
import com.shanjupay.merchant.service.AppService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author author
 * @since 2021-06-27
 */
@Slf4j
@Service
@Transactional
public class AppServiceImpl extends ServiceImpl<AppMapper, App> implements AppService {

}
