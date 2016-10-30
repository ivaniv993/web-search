package com.edu.domain;

/**
 * Created by xXx on 10/6/2016.
 */
public class Link {

    public int id;

    public Link next;

    public Link(int id) {
        this.id = id;
    }

    public Link(int id, Link next) {
        this.id = id;
        this.next = next;
    }

    @Override
    public String toString() {
        return "Link{" +
                "id=" + id +
                ", next : " + next +
                '}';
    }

    public Link reverse(Link head){

        if (head.next == null)
            return head;

        reverse(head.next).next = head ;

        if (head == this)
            head.next = null;

        return head;

    }
}
