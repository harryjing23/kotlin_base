package com.mac.kt_base.s4

class K78 {
    // >>>>>>>>>>>>>>>>>>> 下面是 不使用惰性初始化 by lazy  普通方式(饿汉式 没有任何懒加载的特点)
    // val databaseData1 = readSQlServerDatabaseAction()

    // >>>>>>>>>>>>>>>>>>> 下面是 不使用惰性初始化 by lazy
    val databaseData2 by lazy { readSQlServerDatabaseAction() }

    private fun readSQlServerDatabaseAction(): String {
        println("开始读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("加载读取数据库数据中....")
        println("结束读取数据库数据中....")
        return "database data load success ok."
    }
}

// TODO 78.Kotlin语言的惰性初始化by lazy学习
// 1.不使用惰性初始化 databaseData1 = readSQLServerDatabaseAction()
// 2.使用惰性初始化  databaseData2 by lazy
// 3.K78()  睡眠  db1.databaseData1

// lateinit 是在使用的时候，手动加载的懒加载方式，然后再使用
// by lazy  是在使用的时候，自动加载的懒加载方式，然后再使用
fun main() {
    // >>>>>>>>>>>>>>>>>>> 下面是 不使用惰性初始化 by lazy  普通方式(饿汉式 没有任何懒加载的特点)
    /*val p = K78()

    Thread.sleep(6000)

    println("即将开始使用")

    println("最终显示:${p.databaseData1}")*/


    // >>>>>>>>>>>>>>>>>>> 下面是 不使用惰性初始化 by lazy

    val p = K78()

    Thread.sleep(6000)

    println("即将开始使用")

    println("最终显示:${p.databaseData2}") // 只有我使用的时候，你再加载，才是属于 懒加载
}