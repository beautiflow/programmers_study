package org.prgms.kdt.order.voucher;

import org.springframework.stereotype.Service;

import java.text.MessageFormat;
import java.util.UUID;

@Service
public class VoucherService {

    private final VoucherRepository voucherRepository;

    public VoucherService(VoucherRepository voucherRepository) {
        this.voucherRepository = voucherRepository;
    }

    public Voucher getVoucher(UUID voucherId) { // 해당 아이디를 전달 받아 해당 아이디에 대한 voucher 가 있는지 찾아서 있으면 반환
        return voucherRepository
                .findById(voucherId)
                .orElseThrow(() -> new RuntimeException(MessageFormat.format("Can not find a voucher for {0}", voucherId))); // voucher 를 조회해서 가져오려고 하지만 못 찾을 경우
    }

    public void useVoucher(Voucher voucher) {

    }
}
