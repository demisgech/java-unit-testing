package com.demiscode;

public class Reservation {
    private User madeByUser;

    public User getMadeByUser() {
        return madeByUser;
    }

    public void setMadeByUser(User madeByUser) {
        this.madeByUser = madeByUser;
    }

    public boolean canBeCancelledBy(User user) {
        return (user.isAdmin() || madeByUser == user);
    }
}
