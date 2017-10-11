package com.twh.example.ch03;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {
    @Override
    public CreditBill process(CreditBill item) throws Exception {
        return null;
    }
}
