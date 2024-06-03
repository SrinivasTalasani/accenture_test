@BuyTv
  Feature: User buys samsung Tv
    Scenario: User buys samsung tv in Takealot site
      Given User launched url and clicked on electronics
      When User chooses all categories of electronics
      And User selects tv categories and selects samsung Tv
      And User adds his tv to cart
      Then User added Tv to the cart and verified