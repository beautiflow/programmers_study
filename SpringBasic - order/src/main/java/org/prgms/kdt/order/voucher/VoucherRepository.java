package org.prgms.kdt.order.voucher;

import java.util.Optional;
import java.util.UUID;

public interface VoucherRepository {
    Optional<Voucher> findById(UUID voucherId); // 메모리에서 엔티티가 없을 수 있으므로 바우처가 없을 수 있으므로 Optional 로 만듦

    Voucher insert(Voucher voucher);
}
