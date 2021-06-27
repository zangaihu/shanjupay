package com.shanjupay.merchant.api;

import com.shanjupay.merchant.api.dto.MerchantDTO;

/**
 * @author Sun Hu
 * @since 2021/6/27
 */
public interface MerchantService {

    public MerchantDTO queryMerchantById(Long id);
}
