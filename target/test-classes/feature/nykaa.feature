Feature: Buy prodect from nykaa

Scenario: login into nykaa

Given launch url
When sign in 
And sign in with mobile no
And enter mob no and proceed
And login via password 
And enter password and login

Scenario: select night creame

Given move to skin
When  select night creame and click

Scenario: select plum green tea reneved night gel

Given switch to night creame window
When find plum green night gel and click

Scenario: add night gel to bag

When find add to bag and click

Scenario: add to bag

When find bag and click
And switch to frame
And find qnty and select qnty and clock
And proceed

Scenario: add new address

When find new address and click
And enter address in given field
And ship to this addree

Scenario: cash on delivery
When find and click cash on delivery
And place order
Then take screen shot
And order confirm 

Scenario: cancel order
 When move to user 
 And click my order
 And click order detail
 And click cancel order
And click and select reason
And cancel order and confirm
Then cancelation succesful
And take Screenshot














