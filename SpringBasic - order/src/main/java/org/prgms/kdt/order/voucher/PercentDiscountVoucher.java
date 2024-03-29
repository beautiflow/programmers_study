package org.prgms.kdt.order.voucher;

import org.prgms.kdt.order.voucher.Voucher;

import java.util.UUID;

public class PercentDiscountVoucher implements Voucher {
    private final UUID voucherId;
    private final long percent;

    public PercentDiscountVoucher(UUID voucherId, long percent) {
        this.voucherId = voucherId;
        this.percent = percent;
    }

    @Override
    public UUID getVoucherId() {
        return voucherId;
    }

    @Override
    public long discount(long beforeDiscount) { // 특정한 비율 만큼 할인
        return beforeDiscount * (percent / 100);
    }
}
