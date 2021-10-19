fun main() {
    var myMap= mutableMapOf("boss" to "Zeyad", "student" to "Terky" , "boy" to "Bader" , "Eng" to "Saide" )
    println(myMap)
    myMap["HOLY City"]="Makkah"
    println(myMap)
    myMap.remove("Eng")
    println(myMap)
    myMap.replace("boss", "Bin Twalah")
    println(myMap)

}