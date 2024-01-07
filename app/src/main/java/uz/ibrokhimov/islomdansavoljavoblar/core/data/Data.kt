package uz.ibrokhimov.islomdansavoljavoblar.core.data

import uz.ibrokhimov.islomdansavoljavoblar.core.model.SavolModel

object Data {

    fun getAllData(): ArrayList<SavolModel> {
        val data = ArrayList<SavolModel>()
        data!!.add(
            SavolModel(
                0,
                "Islom dinining uchinchi ustuni nima?",
                arrayListOf<String>(
                    "Farzand tarbiyasi",
                    "Ilm olish",
                    "Ro'za",
                    "ota-onaga yaxshilik"
                ),
                "Ro'za"
            )
        )

        data!!.add(
            SavolModel(
                1,
                "Mehr berish shartmi?",
                arrayListOf("Ixtiyoriy", "Umr mobaynida berish farz", "Shart emas", "bida't"),
                "Umr mobaynida berish farz"
            )
        )

        data!!.add(
            SavolModel(
                2,
                "Payg'ambarimiz Muhammad (sollallohu alayhu vas nimani \"U dunyoda bu dunyo ovqatlariningoliysi\" deb ataganlar?",
                arrayListOf<String>(
                    "Sut",
                    "Xurmo",
                    "Non",
                    "Gosht"
                ),
                "Gosht"
            )
        )

        data!!.add(
            SavolModel(
                3,
                "Allohning ismi nechta?",
                arrayListOf<String>(
                    "77",
                    "56",
                    "99",
                    "88"
                ),
                "99"
            )
        )

        data.add(
            SavolModel(
                4,
                "Payg'ambarimiz necha yoshlarida vafot etganlar?",
                arrayListOf<String>(
                    "67",
                    "63",
                    "57",
                    "76"
                ),
                "63"
            )
        )

        data.add(
            SavolModel(
                4,
                "Payg'ambarimiz qayerda tug'ilgan?",
                arrayListOf<String>(
                    "Makka",
                    "madina",
                    "Sofia",
                    ""
                ),
                "makka"
            )
        )

        data.add(
            SavolModel(
                4,
                "Payg'ambarimiz qayerda vafot etganlar?",
                arrayListOf<String>(
                    "Makka",
                    "madina",
                    "Sofia",
                    ""
                ),
                "Madina"
            )
        )

        data.add(
            SavolModel(
                4,
                "Payg'ambarimiz Muhammad (s.a.v) necha Jabroil (a.s) dan vahiy tushgan?",
                arrayListOf<String>(
                    "40",
                    "30",
                    "45",
                    "35"
                ),
                "40"
            )
        )



        data.add(
            SavolModel(
                7,
                "Payg'ambarimiz Muhammad (s.a.v)ning necha yoshlarida onalari vafot etgan?",
                arrayListOf<String>(
                    "9 yoshlarida",
                    "6 yoshlarida",
                    "3 yoshlarida",
                    "12 yoshlarida"
                ),
                "6 yoshlarida"
            )
        )

        data.add(
            SavolModel(
                8,
                "Payg'ambarimiz Muhammad (s.a.v)ning necha yoshlarida otalari vafot etgan?",
                arrayListOf<String>(
                    "9 yoshlarida",
                    "Tug'ilmaslaridan oldin",
                    "3 yoshlarida",
                    "12 yoshlarida"
                ),
                "Tug'ilmaslaridan oldin"
            )
        )

        data.add(
            SavolModel(
                9,
                "Quron qaysi suradan boshlanadi?",
                arrayListOf<String>(
                    "Fotiha",
                    "Yasin",
                    "Baqara",
                    "Nas"
                ),
                "Fotiha"
            )
        )

        data.add(
            SavolModel(
                10,
                "Dajjolning qayerida nuqsoni bo'lgan?",
                arrayListOf<String>(
                    "Qulog'ida",
                    "Kozida",
                    "Qo'lida",
                    "Yuzida"
                ),
                "Kozida"
            )
        )

        data.add(
            SavolModel(
                11,
                "Islom dinining beshinchi ustuni nima?",
                arrayListOf<String>(
                    "Yaxshi xulqi",
                    "Uzun soqoli",
                    "Bosh kiyimi",
                    "Haj"
                ),
                "Haj"
            )
        )

        data.add(
            SavolModel(
                12,
                "Qaysi sahoba islomni birinchi bo'lib qabul qilgan?",
                arrayListOf<String>(
                    "Usmon (r.a)",
                    "Umar (r.a)",
                    "Ali (r.a)",
                    "Holid (r.a)"
                ),
                "Ali (r.a)"
            )
        )


        data.add(
            SavolModel(
                13,
                "Islom dinini birinchi bo'lib qabul qilgan ayol?",
                arrayListOf<String>(
                    "Hadiycha onamiz",
                    "Ruqiya onamiz",
                    "Omina onamiz",
                    "Oisha onamiz"
                ),
                "Hadiycha onamiz"
            )
        )


        data.add(
            SavolModel(
                14,
                "Jabroil (a.s) Payg'ambarimiz Muhammad (s.a.v)ga yetkazish uchun Alloh Qur`onni qaysi tunda nozil bo'lgan?",
                arrayListOf<String>(
                    "1001 kun",
                    "Idul-fitr kuni",
                    "Qurbon bayrami kechasi",
                    "Laylat-ul-Qadr"
                ),
                "Laylat-ul-Qadr"
            )
        )


        data.add(
            SavolModel(
                15,
                "Oisha onamiz kimning qizlari edi?",
                arrayListOf<String>(
                    "Usmon r.a",
                    "Umar r.a",
                    "Xolid ibn Valid r.a",
                    "Abu Bakr r.a"
                ),
                "Abu Bakr r.a"
            )
        )

        data.add(
            SavolModel(
                16,
                "Badrdagi jangda kim g`olib bo`lgan?",
                arrayListOf<String>(
                    "Musulmonlar",
                    "G`ayriddinlar",
                    "Durang",
                    "Tinchlik o`rnatildi"
                ),
                "Musulmonlar"
            )
        )


        data.shuffle()
        return data
    }

}