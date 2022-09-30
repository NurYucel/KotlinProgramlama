package com.example.kotlindersleri.nesne_tabanli

fun main() {
    val odevler = Odev2()

    val fahrenhiet = odevler.soru1(32.5)
    println("Fahrenhiet : $fahrenhiet")

    val cevre = odevler.soru2(3,5)

    val faktoriyel = odevler.soru3(5)
    println("Faktoriyel : $faktoriyel")

    val kelime = odevler.soru4("Merhabalar",'a')

    val icAci = odevler.soru5(7)
    println("İç açıları toplamı : $icAci")

    var maas = odevler.soru6(21)
    println("Alınacak maaş : $maas")

    var ucret = odevler.soru7(52)
    println("Ödenecek ücret : $ucret")
}