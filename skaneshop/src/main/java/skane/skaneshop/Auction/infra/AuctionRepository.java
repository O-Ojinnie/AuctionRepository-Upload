package skane.skaneshop.Auction.infra;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import skane.skaneshop.Auction.dto.AuctionRequestDto;
import skane.skaneshop.domain.Auction;
import skane.skaneshop.domain.Category;
import skane.skaneshop.domain.Option;

import java.util.List;
import java.util.Optional;

@Repository
//이건 JPA -> h2 연결하고 나서 쓰자
public interface AuctionRepository extends JpaRepository<Auction,Long> {

    /*// 카테고리별 검색
    List<Auction> findByCategory(Category category);

    // 입찰가로 정렬
    List<Auction> OrderByBidPrice();

    // PostId로 검색
    List<Auction> findByPostBoardNumber();*/

}
