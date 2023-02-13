package org.prgms.kdt.order.order;

import org.prgms.kdt.order.voucher.VoucherService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class OrderService { // voucher 서비스와 오더에 대한 정보를 기록하고 조회할 수 있는 레파지토리에 대해 의존성을 가짐. 그 두 개에 클래스에 의존성을 갖게됨

    private final OrderRepository orderRepository;
    private final VoucherService voucherService;

    public OrderService(OrderRepository orderRepository, VoucherService voucherService) { // 외부에서 주입받을 수 있도록 생성자를 만듦
        this.orderRepository = orderRepository;
        this.voucherService = voucherService;
    }

    public Order createOrder(UUID customerId, List<OrderItem> orderItems) { // get.voucher 는 orderservice 에서 이용해진거고, orderservice 는 voucher 를 이용해서 order 를 만듦
        var order = new Order(UUID.randomUUID(), customerId, orderItems); // voucher 가 없어도 order를 만들 수 있게 함

        orderRepository.insert(order);
        return order;
    }

    public Order createOrder(UUID customerId, List<OrderItem> orderItems, UUID voucherId) { // 실제 주문 생성에 대한 책임을 갖는다.
        var voucher = voucherService.getVoucher(voucherId); // voucher 를 voucher 서비스로부터 가져온다
        var order = new Order(UUID.randomUUID(), customerId, orderItems, voucher);

        orderRepository.insert(order); // 오더 레파지토리에서 저장하는 기능 추가. 처음이니까 Insert
        voucherService.useVoucher(voucher); // 해당 오더에 관한 바우처를 사용했다는 메서드
        return order;
    }

}
