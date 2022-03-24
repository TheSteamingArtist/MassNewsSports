Unit 8: Group Milestone - README
===

# MassSportsNews

## Table of Contents
1. [Overview](#Overview)
1. [Product Spec](#Product-Spec)
1. [Wireframes](#Wireframes)
2. [Schema](#Schema)

## Overview
### Description
Used to see current live scores for sports and highlights for games. Can also be used to purchase tickets and add them to the app as a barcode. 

### App Evaluation
[Evaluation of your app across the following attributes]
- **Category:** News / Sports
- **Mobile:** This app is primarily used for mobile so sports enthusiasts can view current sports events and games happening. This app could definitely be transfered onto a website and be viewed, such as ESPN. 
- **Story:** Sports enthusiasts are able to watch their favorite sports and see the highlights of the games without actually viewing the whole game. They're able to conviniently purchase tickets to games without the need to download others apps. 
- **Market:** Any individual interested in sports would be able to download this app, but they would need to input their age to filter anything inappropriate. 
- **Habit:** This app is primarily going to depend on how important sports are to the user, and how much they view highlights. 
- **Scope:** The app will first start out with a couple of sports, but it could expand into other sports later down the line. Tickets to other sports events can also be bought for the sports we add to the app. 

## Product Spec

### 1. User Stories (Required and Optional)

**Required Must-have Stories**

* User logs in to access current games and preference settings
* User can view the score for ongoing games
* Payment method to purchase tickets
* Profile section to view personal info 
* Section to purchase tickets
* News about upcoming/past games (game info, player info, etc)

**Optional Nice-to-have Stories**

* Expanded view of ticket and seat placement
* Samsung and Google play capability
* Barcode scanner for tickets
* Section with favorite teams

### 2. Screen Archetypes

* Login
* Register - user signs up or logs in
   * When the user first downloads the app, the are required to sign up to access the app
   * Once the user signs up, they are prompted to login, and the app will remember them even after they close the app
* Profile 
    * user can see they personal information here and change it if they desire(password, address, etc)
* News
    * displayed here is news happening in the sports world
    * here the user can see news from different sports news sites(like bleacher report)
* Live
    * displays the score for ongoing games
* Tickets
    *  users are able to purchase tickets for sport events here


### 3. Navigation

**Tab Navigation** (Tab to Screen)

* Tickets
* News/Home
* Live
* Profile

optional:
* Scanner


**Flow Navigation** (Screen to Screen)

* Forced Log-in -> Account creation if no log in is available
* Tickets -> place to purchase tickets
* Live -> displays score for ongoing games
* Profile -> personal information


## Wireframes

<img src="MassSports-Wireframe.pdf" width=600><br>

### [BONUS] Digital Wireframes & Mockups

### [BONUS] Interactive Prototype

## Schema 

### Models
**User** 

<img src="model_user_table.pdf" width=600><br>

**Payment**

<img src="model_payment_table.pdf" width=600><br>

**LiveFeed**

<img src="model_liveFeed_table.pdf" width=600><br>

[Add table of models]
### Networking
- [Add list of network requests by screen ]
- [Create basic snippets for each Parse network request]
- [OPTIONAL: List endpoints if using existing API such as Yelp]
