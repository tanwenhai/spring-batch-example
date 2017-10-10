package com.twh.example.ch02;

import org.springframework.batch.item.ItemProcessor;

public class CreditBillProcessor implements ItemProcessor<CreditBill, CreditBill> {
    @Override
    public CreditBill process(CreditBill creditBill) throws Exception {
        System.out.println(creditBill);
        return creditBill;
    }
}
