package com.shanjupay.merchant.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.shanjupay.merchant.entity.StoreStaff;
import com.shanjupay.merchant.mapper.StoreStaffMapper;
import com.shanjupay.merchant.service.StoreStaffService;
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
public class StoreStaffServiceImpl extends ServiceImpl<StoreStaffMapper, StoreStaff> implements StoreStaffService {

}
