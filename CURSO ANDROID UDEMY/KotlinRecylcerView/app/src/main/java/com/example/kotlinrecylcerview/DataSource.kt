package com.example.kotlinrecylcerview

import com.example.kotlinrecylcerview.models.Live

class DataSource {

    companion object {

        fun createDataSet(): ArrayList<Live> {
            val list = ArrayList<Live>()

            list.add(
                Live(
                    "Live 001 da Tainá na twitch",
                    "Tainá Regina",
                    "file:///C:/Users/tainasantos/Downloads/banner%20para%20Twitch.png",
                    "https://www.twitch.tv/tainadmissivel"
                )
            )

            list.add(
                Live(
                    "Live 002 da Tainá na twitch",
                    "Tainá Regina",
                    "file:///C:/Users/tainasantos/Downloads/banner%20para%20Twitch.png",
                    "https://www.twitch.tv/tainadmissivel"
                )
            )

            list.add(
                Live(
                    "Live 003 da Tainá na twitch",
                    "Tainá Regina",
                    "file:///C:/Users/tainasantos/Downloads/banner%20para%20Twitch.png",
                    "https://www.twitch.tv/tainadmissivel"
                )
            )

            list.add(
                Live(
                    "Live 004 da Tainá na twitch",
                    "Tainá Regina",
                    "file:///C:/Users/tainasantos/Downloads/banner%20para%20Twitch.png",
                    "https://www.twitch.tv/tainadmissivel"
                )
            )

            return list
        }
    }
}