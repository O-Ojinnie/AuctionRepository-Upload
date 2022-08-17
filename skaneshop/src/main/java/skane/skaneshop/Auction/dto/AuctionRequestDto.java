package skane.skaneshop.Auction.dto;

import lombok.Data;
import skane.skaneshop.domain.Auction;

@Data
public class AuctionRequestDto {

    private Long auctionId;
    private int bid_price;

    public AuctionRequestDto(Auction auction){

        this.auctionId = auction.getAuctionNumber();
        //입찰 메소드 정의 후 사용 가능
        this.bid_price = getBid_price();
    }
}


