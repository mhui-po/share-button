(ns memefactory.server.constants)


(def web3-events
  {:param-change-db/eternal-db-event [:param-change-registry-db :EternalDbEvent {} {:from-block 0 :to-block "latest"}]
   :param-change-registry/param-change-constructed-event [:param-change-registry-fwd :ParamChangeConstructedEvent {} {:from-block 0 :to-block "latest"}]
   :param-change-registry/param-change-applied-event [:param-change-registry-fwd :ParamChangeAppliedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry-db/eternal-db-event [:meme-registry-db :EternalDbEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/meme-constructed-event [:meme-registry-fwd :MemeConstructedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/meme-minted-event [:meme-registry-fwd :MemeMintedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/challenge-created-event [:meme-registry-fwd :ChallengeCreatedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/vote-committed-event [:meme-registry-fwd :VoteCommittedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/vote-revealed-event [:meme-registry-fwd :VoteRevealedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/vote-amount-claimed-event [:meme-registry-fwd :VoteAmountClaimedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/vote-reward-claimed-event [:meme-registry-fwd :VoteRewardClaimedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-registry/challenge-reward-claimed-event [:meme-registry-fwd :ChallengeRewardClaimedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-auction-factory/meme-auction-started-event [:meme-auction-factory-fwd :MemeAuctionStartedEvent {} {:from-block 0 :to-block "latest"}]
   :meme-auction-factory/meme-auction-buy-event [:meme-auction-factory-fwd :MemeAuctionBuyEvent {} {:from-block 0 :to-block "latest"}]
   :meme-auction-factory/meme-auction-canceled-event [:meme-auction-factory-fwd :MemeAuctionCanceledEvent {} {:from-block 0 :to-block "latest"}]
   :meme-token/transfer [:meme-token :Transfer {} {:from-block 0 :to-block "latest"}]})