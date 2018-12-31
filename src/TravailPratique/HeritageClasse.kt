package TravailPratique

open class Personne() {
    var Nom: String? = null
    var PostNom: String? = null
    var Prenom: String? = null
    var Age: Int = 0

    constructor(Nom: String, PostNom: String, Prenom: String, Age: Int) : this() {
        this.Nom = Nom
        this.PostNom = PostNom
        this.Prenom = Prenom
        this.Age = Age
    }

    init {

    }
}
//Cryoni riek
class Agent() : Personne() {
    var Salaire: Float? = 0f
    var Grade: String? = null
    var Site: String? = null
    var Affectation: String? = null

    constructor(Salaire: Float, Grade: String, Site: String, Affectation: String) : this() {
        this.Salaire = Salaire
        this.Grade = Grade
        this.Site = Site
        this.Affectation = Affectation
    }
}

class Pere() : Personne() {
    var ville: String? = null
    var Commune: String? = null
    var Quartier: String? = null
    var Av: String? = null
    var NumeroMaison: String? = null

    constructor(ville: String, Commune: String, Quartier: String, Av: String, NumeroMaison: String) : this() {
        this.ville = ville
        this.Commune = Commune
        this.Quartier = Quartier
        this.Av = Av
        this.NumeroMaison = NumeroMaison
    }
}

fun main(args: Array<String>) {
    val personne = Personne("Cryoni", "Riek", "Cryoni", 21)
    val agent = Agent(20f, "Inspecteur", "Goma", "Goma-ville")
    val pere = Pere("Goma", "Karisimbi", "Mabanga-sud", "Industriel", "80")
    print("Salaire est: ${agent.Salaire}\n Grade est: ${agent.Grade}\n Site est :${agent.Site}\n Affecter a :${agent.Affectation}\n")
}