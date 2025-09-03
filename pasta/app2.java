package pasta;

public class app2 {

    public static void main(String[] args) {
        aula livro = new aula ();
        
        livro.nome = "O senhor dos aneis";
        livro.descricao = "Uma obra literaria de fantasia";
        livro.isbn = "2710";
        livro.preco = 30.90;
        livro.autor = "j.r.r. tolkien";
        livro.datapub = "1954";

        livro.dadosLivros();
    }
}