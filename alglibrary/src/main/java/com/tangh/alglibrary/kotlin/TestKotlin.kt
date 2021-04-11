package com.tangh.alglibrary.kotlin

import com.tangh.alglibrary.java.tree.TreeNode
import java.util.*

class TestKotlin {

    fun test(){
        TestKotlin()
        var data:String? =null

        var i : Int = data.let {
            1
        }

        var j : Int= with(data){
           1
        }

        data.run {
        }


        data.also {

        }

        data.apply {

        }
    }

}
