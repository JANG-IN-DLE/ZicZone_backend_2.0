package org.zerock.ziczone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.zerock.ziczone.domain.PayHistory;
import org.zerock.ziczone.domain.payment.Payment;
import org.zerock.ziczone.dto.mypage.PayHistoryDTO;

import java.util.List;
import java.util.Optional;

import java.util.List;
import java.util.Optional;

public interface PayHistoryRepository extends JpaRepository<PayHistory, Long> {
    // PayHistory에서 BuyerId와 SellerId가 있는지 체크
    boolean existsByBuyerIdAndSellerId(Long buyerId, Long sellerId);

    Optional<PayHistory> findByBuyerIdAndSellerId(Long buyerId, Long sellerId);
    // pickCards 조회할 때 결제여부 파악하기 위해서
    List<PayHistory> findBySellerIdAndBuyerId(Long sellerId, Long buyerId);

    // 특정 BuyerId로 모든 SellerId 조회
    @Query("SELECT DISTINCT p.sellerId FROM PayHistory p WHERE p.buyerId = :buyerId")
    List<Long> findSellerIdsByBuyerId(@Param("buyerId") Long buyerId);

    // PersonalUser의 personalId로 PayHistory 조회
    @Query("SELECT p FROM PayHistory p WHERE p.personalUser.personalId = :personalId")
    List<PayHistory> findByPersonalUserPersonalId(@Param("personalId") Long personalId);
}
