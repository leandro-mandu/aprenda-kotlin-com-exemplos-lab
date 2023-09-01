enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val conteudos: List<ConteudoEducacional>) {

val inscritos = mutableSetOf<Usuario>()
    
    fun matricular(vararg usuario: Usuario) {
        for(u in usuario){
            print(u.name)

            if(inscritos.add(u))
            	println(" foi matriculado.")
            else
            	println(" já estava matriculado, nenhuma ação realizada.");
        }
    }
}

fun main() {
    val contentList = listOf(ConteudoEducacional("Git", 40), ConteudoEducacional("Kotlin"), ConteudoEducacional("Linkedin", 25))
    val kotlinForm = Formacao("Kotlin", contentList)
    //alunos
    val user1 = Usuario(name="Aluno Um")
    val user2 = Usuario(name="Aluno Dois")
    val user3 = Usuario(name="Aluno Tres")
    val user4 = Usuario(name="Aluno Quatro")
    val user5 = Usuario(name="Aluno Cinco")
    
    //matriculando alunos
    kotlinForm.matricular(user1)
    kotlinForm.matricular(user2, user3)
    kotlinForm.matricular(user2, user4, user3, user5)
    
    
    
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
   // aceitar matrícula de varios alunos ao mesmo tempo
}