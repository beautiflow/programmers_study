package org.prgms.kdt.order.voucher;

import java.util.UUID;

public interface Voucher { // 다른 형태의 voucher 로도 쉽게 변경 가능하도록 Interface 로 구현

    UUID getVoucherId(); // 모든 엔티티는 아이디를 가져야 하므로

    long discount(long beforeDiscount);

}
