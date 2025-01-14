package com.fastcampus.ch4.dao.order;

import com.fastcampus.ch4.domain.order.OrderCountCondition;
import com.fastcampus.ch4.domain.order.OrderSearchCondition;
import com.fastcampus.ch4.dto.order.OrderDto;
import com.fastcampus.ch4.dto.order.request.OrderStatusUpdateDto;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/*
필요 기능
1. 생성
2. 조회
    - 기간에 다른 조회
    - 상태에 따른 조회
    - 상품명 조회
    - OrderProduct 와 같이 조회
3. 변경
    - 주문 상태 변경
    - 배송 상태 변경
    - 결제 상태 변경
    - 금액 변경 (총 상품 금액, 총 할인 금액, 총 주문 금액)
4. 삭제

 */

@Repository
public class OrderDaoImpl implements OrderDao {
    @Autowired
    SqlSession sqlSession;

    private static final String namespace = "com.fastcampus.ch4.dao.order.OrderMapper.";

    @Override
    public int insertOrder(OrderDto orderDto) {
        return sqlSession.insert(namespace + "insertOrder", orderDto);
//        return sqlSession.insert(namespace + "insertOrderStat", orderDto);
    }

    @Override
    public List<OrderDto> selectOrderByCondition(Map map) {
        return sqlSession.selectList(namespace + "selectOrderByCondition", map);
    }

    @Override
    public List<OrderDto> selectOrderPage(OrderSearchCondition orderSearchCondition){
        return sqlSession.selectList(namespace + "selectOrderPage", orderSearchCondition);
    }

    @Override
    public int selectOrderCount(OrderCountCondition condition) {
        return sqlSession.selectOne(namespace + "selectOrderCount", condition);
    }

    public int updateOrder(OrderDto orderDto) {
        return sqlSession.update(namespace + "updateOrder", orderDto);
    }

    @Override
    public int updateStatus(OrderStatusUpdateDto orderStatusUpdateDto) {
        return sqlSession.update(namespace + "updateStatus", orderStatusUpdateDto);
    }

    @Override
    public int updateOrderPriceInfo(Map map) {
        return sqlSession.update(namespace + "updateOrderPriceInfo", map);
    }

    @Override
    public int deleteOrderByCondition(Map map) {
        return sqlSession.delete(namespace + "deleteOrder", map);
    }

    public int deleteAll() {
        return sqlSession.delete("order.deleteAll");
    }
}
