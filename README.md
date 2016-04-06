# JavaShop technical specification v0.2

[![Build Status](https://travis-ci.org/connected/java-shop.svg?branch=master)](https://travis-ci.org/connected/java-shop)

### Table of contents:
1. [Features](#features)
2. [Front-end page structure](#front-end-page-structure)
3. [Back-end page structure](#back-end-page-structure)
4. [Front-end routes](#front-end-routes) 
5. [Database structure](#database-structure)

### Features:
* Unlimited category count
* Unlimited products count
* Unlimited category nesting level
* Associated products
* Product search
* Product cart
* Products attribute filter
* Product comparison
* User accounts
* Custom product attributes
* Checkout page
* Custom pages
* Featured products


### Front-end page structure:
* All pages
  * ~~Search form~~
  * Navigation menu
  * Category menu
  * Cart widget
    * Items counter
    * ~~Items table~~
      * ~~Product title~~
      * ~~Quantity~~
      * ~~Price~~
    * Total price
    * Checkout button/icon
  * ~~User profile widget~~
    * ~~Login form~~
      * ~~E-mail~~
      * ~~Password~~
      * ~~"Remember me" checkbox~~
    * ~~Profile link~~
    * ~~Logout link~~
* Success page
  * Success message
  * Continue button
* Error page
  * Error message
  * Back button
* Home page
  * ~~Featured products list~~
  * ~~Most popular products list~~
  * ~~Last added products list~~
  * Categories list
    *  Category image (thumbnail)
    *  Category title
* Category page (search result page)
  * ~~Sort form~~
  * ~~Breadcrumbs block~~
  * Product list
  * Child categories
  * ~~Attrbute filter~~
  * Product pagination
* Product page
  * ~~Breadcrumbs block~~
  * Product title
  * Product image
  * Product description
  * Product attribute list
  * Add to cart button
  * Price label
  * Back to category button
* ~~User registration page~~
  * ~~Personal information form~~
    * ~~First name~~
    * ~~Last name~~
    * ~~Phone~~
    * ~~Address~~
    * ~~E-mail~~
    * ~~Password~~
* ~~User profile page~~
  * ~~Personal information~~
    * ~~Edit button~~
  * ~~My orders~~
    * ~~Orders list~~
      * ~~Order items table~~
        * ~~Product title~~
        * ~~Quantity~~
        * ~~Price~~
      * ~~Order total price~~
      * ~~Order status~~
    * ~~Orders pagination~~
* Cart page
  * Items table
    * Product title
    * Quantity
    * Price
  * Total price
  * Checkout button
* Checkout page
  * ~~Login form~~
    * ~~E-mail~~
    * ~~Password~~
  * Personal information form
    * First name
    * Last name
    * Phone
    * Address
    * E-mail
    * Password
  * Review button
* Checkout review page
  * Items table
    * Product title
    * Quantity
    * Price
    * Change button
  * Total price
  * Personal information table
    * First name
    * Last name
    * Phone
    * Address
    * E-mail
    * Change button
  * Submit button

### Back-end page structure:

### Front-end routes:
* /
  * /category
  * /product
  * /cart
  * /checkout
    * /review 
  * ~~/user~~
  * /order
    * /success 
  * /page

### Database structure:
* User
  * id
  * email
  * firstname
  * lastname
  * address
  * phone
  * password
  * admin
  * ip
  * created_at
  * ...
* Category
  * id
  * name
  * parent_id
  * ...
* Product
  * id
  * name
  * qty
  * price
  * ...
* Cart
  * id
  * product_id
  * qty
  * user_id
  * updated_at
  * ...
* Order
  * id
  * cart_id
  * status
  * created_at
  * ...
* Page
  * id
  * title
  * content
  * ...
