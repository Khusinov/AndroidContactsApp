package com.khusinov.androidcontactapp.model

class Contact {
    var name:String? = null
    var number:String? = null

    constructor(name: String?, number: String?) {
        this.name = name
        this.number = number
    }
}