import java.util.Scanner;
public class IPhone implements Spotify, Google, Telefone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        String musica;
        public void ligar(){
            System.out.println("Digite o número para quem quer ligar: ");
            numero=scanner.nextInt();
            scanner.nextLine();
            System.out.println("Chamando "+numero);
            System.out.println(numero+" atendeu");
            System.out.println("Chamada encerrada");
        }

        public void atender(){
            System.out.println(numero+" está ligando");
            System.out.println("Antendo");
            System.out.println("Chamada encerrada");
        }

        public void Correiodevoz(){
            System.out.println("Mandando audio para "+numero);
        }

        System.out.println(" ");

        protected void selecionarMusica(){
            System.out.println("Selecione uma musica: ");
            musica=scanner.nextLine();
        }

        public void tocarMusica(){
            System.out.println("Play "+musica);
        }

        public void pausarMusica(){
            System.out.println(musica+" pausado");
        }

        System.out.println(" ");

        public void addnovaAba(){
            System.out.println("Adicionando nova aba");
        }

        public void exibirPagina(){
            System.out.println("Exibindo pagina");
        }

        protected void atualizarPagina(){
            System.out.println("Atualizando pagina");
        }

    }
}
