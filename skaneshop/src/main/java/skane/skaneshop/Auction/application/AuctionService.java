package skane.skaneshop.Auction.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import skane.skaneshop.Auction.dto.AuctionDto;
import skane.skaneshop.Auction.infra.AuctionRepository;
import skane.skaneshop.Auction.infra.AuctionTestRepository;
import skane.skaneshop.domain.Auction;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class AuctionService {

    AuctionTestRepository auctionTestRepository;
    @Autowired
    private AuctionRepository auctionRepository;

    //입찰 메소드 (자유입찰?)
    public void bid(Long Auction_num, int price ){



        Auction auction = auctionTestRepository.findById(Auction_num);
        auction.setBidprice(price);
    }

    //1000원 입찰 고정
    public void bid_price(){};
}
