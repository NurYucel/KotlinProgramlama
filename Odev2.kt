package com.example.kotlindersleri.nesne_tabanli

class Odev2 {

    //Parametre olarak girilen dereceyi fahrenhiet'a dönüştürdükten
    //sonra geri döndüren bir method yazınız"T(F)=T(C) *1.8+32
    fun soru1(derece : Double) : Double{
        val fahrenhiet = derece*1.8+32
        return fahrenhiet
    }

    //Kenarları parametre olarak girilen ve dikdörtgen çevresini
    //hesaplayan bir method yazınız
    fun soru2(kenar1 : Int,kenar2: Int){
        val cevre = kenar1+kenar2
        println("Çevre : $cevre")
    }

    //Parametre olarak girilen sayının faktoriyel değerini
    //hesaplayıp geri döndüren methodu yazınız
    fun soru3(sayi : Int) : Long{
        return if(sayi == 1) sayi.toLong() else sayi*soru3(sayi-1)
    }

    //Parametre olarak girilen kelime ve harf için harfin kelime
    //içinde kaç adet olduğunu gösteren bir method yazınız
    fun soru4(kelime:String,harf: Char){
        var sayac = 0
        for (i in kelime){
            if(i==harf){
                sayac+=1
            }
        }
        println("$kelime kelimesinde toplam $sayac tane $harf harfi vardır" )
    }

    //Parametre olarak girilen kenar sayısına göre iç açılar
    //toplamını hesaplayıp sonucu geri gönderen method yazınız.
    //Formül : kenar sayısı (n-2).180
    fun soru5(kenarSayisi:Int):Int{
        var aci = (kenarSayisi-2)*180
        return aci
    }

    //Parametre olarak girilen gün sayısına göre maaş hesabu
    //yapan ve elde edilen değeri geri döndüren method yazınız
    //1 günde 8 saat çalışılabilir
    //çalışma saat ücreti 10 tl
    //mesai ücreti 20 tl
    //160 saat ve üzeri mesai sayılır
    fun soru6(günSayisi:Int):Int{
        var maas = 0
        var calismaSuresi = günSayisi*8
        if(calismaSuresi<=160){
            maas = calismaSuresi*10
        }else{
            maas = (calismaSuresi-160)*20 +160*10
        }
        return maas
    }

    //Parametre olarak girilen kota miktarına göre ücreti hesaplayarak
    //döndüren methodu yazınız
    //50GB 100 TL
    //kota aşımından sonra her 1GB 4TL
    fun soru7(kota:Int): Int{
        var ucret =0
        var kotaAsim = kota -50
        if(kota == 50){
            ucret = 100
        }else{
            ucret = 100+ kotaAsim*4
        }
        return ucret
    }

}