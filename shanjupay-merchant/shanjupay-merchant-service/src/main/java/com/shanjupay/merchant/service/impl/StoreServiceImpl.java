package com.shanjupay.merchant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shanjupay.merchant.entity.Store;
import com.shanjupay.merchant.mapper.StoreMapper;
import com.shanjupay.merchant.service.StoreService;
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
public class StoreServiceImpl extends ServiceImpl<StoreMapper, Store> implements StoreService {

}
