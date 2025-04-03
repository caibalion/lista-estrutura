package playlistIsabel;

public class TestaPlaylistIsabel {
    public static void main(String[] args) {
        TestaPlaylistIsabel testaPlaylistIsabel = new TestaPlaylistIsabel();
        PlaylistIsabel playlistIsabel = new PlaylistIsabel();

        testaPlaylistIsabel.addMusica(playlistIsabel);
        System.out.println("Musicas adicionadas com sucesso!");
        System.out.println("Musicas na playlist: ");
        testaPlaylistIsabel.mostraPlaylist(playlistIsabel);
        testaPlaylistIsabel.removerMusica(playlistIsabel);

        System.out.println();
        System.out.println("Musica removida");
        System.out.println("Playlist apos remoção:");
        testaPlaylistIsabel.mostraPlaylist(playlistIsabel);
    }

    public void mostraPlaylist(PlaylistIsabel playlist) {
        while (playlist.temProximo()) {
            System.out.println(playlist.getPosicaoAtual().getValor().getNome());
        }
    }

    public void addMusica(PlaylistIsabel playlist) {
        Musica musica1 = new Musica(1, "Lua e Flor");
        Musica musica2 = new Musica(2, "MacArthur Park");
        Musica musica3 = new Musica(3, "November's Song");
        Musica musica4 = new Musica(4, "Travessia");
        Musica musica5 = new Musica(5, "Clube da Esquina");
        Musica musica6 = new Musica(6, "Juanito Alimana");
        Musica musica7 = new Musica(7, "Nessum Dorma");
        Musica musica8 = new Musica(8, "Fio Maravilha");

        playlist.adicionar(musica1);
        playlist.adicionar(musica2);
        playlist.adicionar(musica3);
        playlist.adicionar(musica4);
        playlist.adicionar(musica5);
        playlist.adicionar(musica6);
        playlist.adicionar(musica7);
        playlist.adicionar(musica8);

    }

    public void removerMusica(PlaylistIsabel playlist) {
        playlist.remover();
        playlist.remover();
    }
}
