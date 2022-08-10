Feature: TC02-CreateEditRole-Permission Management Feature Tiers And Business Roles
		
			Background: login the admin portal
				Given user launches the admin portal
		
			Scenario: Permission management page should have 2 options 1. Feature Tiers 2. Business Roles
				When user enters valid Email and Password for Reseller
				And click on Remember me and sign in button
				Then user should login successfully and navigate to home page
				And user should be able to see the Permissions Management text in the page
				When user clicks on the Permissions Management text
				And user should be able to see the Permissions Management page displayed
        Then user should be able to see Feature Tiers and Business Roles clickable option
        
        