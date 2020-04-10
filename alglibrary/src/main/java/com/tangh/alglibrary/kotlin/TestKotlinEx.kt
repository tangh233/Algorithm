package com.tangh.alglibrary.kotlin

import java.util.*

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

/**
 * 21. 合并两个有序链表
 */
fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
    if (l1?.`val` == null && l2?.`val` == null) return null

    var newNode= ListNode(1)

    while (l1?.`val` != null) {
        while (l2?.`val` != null) {
            if (l1.`val` > l2.`val`) {

            }
        }
    }
    return null
}


/**
 * 20. 有效的括号
 */
fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false

    var left = arrayOf('(', '[', '{')
    var right = arrayOf(')', ']', '}')

    var stack = Stack<Char>()
    for (c in s) {
        if (left.contains(c)) stack.push(c)
        else {
            if (stack.isEmpty()) return false
            var p = stack.pop()
            if (p == left[0] && c == right[0])
            else if (p == left[1] && c == right[1])
            else if (p == left[2] && c == right[2])
            else {
                return false
            }
        }
    }
    return stack.size == 0
}


/**
14. 最长公共前缀
 */
fun longestCommonPrefix(strs: Array<String>): String {
    if (strs == null || strs.isEmpty()) return ""

    var minStr = strs[0]

    for ((i, s) in strs.withIndex()) {
        while (s.indexOf(minStr) != 0) {
            minStr = minStr.substring(0, minStr.length - 1)
        }

        if (i == strs.size - 1) return minStr
    }

    return ""
}

