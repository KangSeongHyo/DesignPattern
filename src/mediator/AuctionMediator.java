package mediator;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

public class AuctionMediator extends Mediator{

    Map<Colleague,Integer> bidMap;
    String product;

    public AuctionMediator() {
        this.bidMap = new WeakHashMap<>();
    }

    @Override
    protected void round(String product) {
        this.product = product;
        this.bidMap = new WeakHashMap<>();
    }

    @Override
    protected void mediate(Colleague colleague, int paid) {
        bidMap.put(colleague,paid);
    }

    @Override
    protected void result() {

        List<Colleague> colleagues = new ArrayList<>(bidMap.keySet());
        colleagues.sort((o1,o2)->Integer.compare(bidMap.get(o2), bidMap.get(o1)));
        boolean isWinner = true;
        for (Colleague colleague: colleagues) {
            if(isWinner){
                colleague.win(product);
                // 낙찰된 상품을 준다.
                isWinner = false;
            }else {
                colleague.lose(bidMap.get(colleague));
                // 유찰된 금액을 돌려준다.
            }
        }
    }

}
