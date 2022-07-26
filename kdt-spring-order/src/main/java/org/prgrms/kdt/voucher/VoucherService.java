package org.prgrms.kdt.voucher;

import org.prgrms.kdt.voucher.Voucher;
import org.prgrms.kdt.voucher.VoucherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Service;
import java.text.MessageFormat;
import java.util.UUID;

@Service
public class VoucherService {

    private final VoucherRepository voucherRepository;


    public VoucherService(@Qualifier("memory") VoucherRepository voucherRepository) {
        this.voucherRepository = voucherRepository;
    }


    public Voucher getVoucher(UUID voucherId) {
        return voucherRepository
                .findById(voucherId)
                .orElseThrow(()-> new RuntimeException(MessageFormat.format("Can not find a voucher for {0}", voucherId)));
    }

    public void useVoucher(Voucher voucher) {
    }


}
