package com.example.homework2

class Odev2 {
    fun derece(celcius: Double): Double {
        val sonuc = celcius * 1.8 + 32
        println("Fahrenheit: $sonuc")
        return sonuc
    }

    fun soru2(uzunKenar:Int,kısaKenar:Int){
        val cevre=2*uzunKenar+2*kısaKenar
        println("Dikdörtgenin çevresi: $cevre")

    }
    fun soru3(sayi:Int):Int{
        var sonuc=1
        if (sayi==0 || sayi==1){
            return 1
        }else{
            for(i in sayi downTo 1)
                sonuc *= i
            return sonuc
        }

    }

    fun soru4(metin:String):Int{
        var sayac=0
        for(char in metin){
            if(char== 'a' || char== 'A'){
                sayac++
            }
        }
        return sayac
    }
    fun soru5(kenarSayisi:Int):Int{
       val icAci=(kenarSayisi-2)*180
        println(icAci)
        return icAci
    }

    fun soru6(gunSayi:Int):Int{

        val calismaSaat=8*gunSayi
        if(calismaSaat>160){
            val mesaiSaat=calismaSaat-160
            return mesaiSaat*20+(calismaSaat-mesaiSaat)*10
        }else{
           return calismaSaat*10
        }

        }
    fun  soru7(kullanilan:Int):Int{

        var kota = 50

        if(kullanilan>50){
           var odeme= 100+(kullanilan-50)*4
            return odeme
        }else{
            return 100
        }


    }







    }
