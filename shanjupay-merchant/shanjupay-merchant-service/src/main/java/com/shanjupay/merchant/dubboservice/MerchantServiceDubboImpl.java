package com.shanjupay.merchant.dubboservice;

import com.shanjupay.merchant.api.MerchantService;
import com.shanjupay.merchant.api.dto.MerchantDTO;
import com.shanjupay.merchant.entity.Merchant;
import com.shanjupay.merchant.mapper.MerchantMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author Sun Hu
 * @since 2021/6/27
 */
@org.apache.dubbo.config.annotation.Service
public class MerchantServiceDubboImpl implements MerchantService {

    @Autowired
    MerchantMapper merchantMapper;

    @Override
    public MerchantDTO queryMerchantById(Long id) {
        Merchant merchant = merchantMapper.selectById(id);
        MerchantDTO merchantDTO=new MerchantDTO();
        merchantDTO.setTenantId(merchant.getTenantId());
        merchantDTO.setMerchantName(merchant.getMerchantName());
        return merchantDTO;
    }
}
