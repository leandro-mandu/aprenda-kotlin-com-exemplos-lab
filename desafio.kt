enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

class Usuario(val name: String)

data class ConteudoEducacional(val nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos)
        inscritos.add(usuario)
        println("${usuario.name} matriculado!")
    }
}

fun main() {
    //lista de conteudos
    val contentList = listOf(ConteudoEducacional("Git", 40), ConteudoEducacional("Kotlin"), ConteudoEducacional("Linkedin", 25))
    //instância do curso
    val kotlinForm = Formacao("Kotlin", contentList)
    //alunos
    val user1 = Usuario(name="Aluno Um")
    
    //matriculando um aluno
    kotlinForm.matricular(user1)
    
    //matriculando vários alunos
    
    
    
   // TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
   // TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
   // aceitar matrícula de varios alunos ao mesmo tempo
}