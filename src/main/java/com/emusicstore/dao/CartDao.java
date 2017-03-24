package com.emusicstore.dao;

import com.emusicstore.model.Cart;

/**
 * Created by Vytlasai on 3/22/2017.
 */
public interface CartDao {

    Cart getCartById(int cartId);

    void update(Cart cart);


}
