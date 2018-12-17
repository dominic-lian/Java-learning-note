package com.dominic;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
        Album album = new Album("叶惠美", "周杰伦");

        album.addSong("以父之名", 5.42);
        album.addSong("懦夫", 3.45);
        album.addSong("晴天", 6.43);
        album.addSong("三年二班", 6.14);
        album.addSong("东风破", 8.34);
        album.addSong("你听得到", 3.56);
        album.addSong("同一种调调", 7.83);
        album.addSong("她的睫毛", 3.13);
        album.addSong("爱情悬崖", 3.23);
        album.addSong("梯田", 2.55);
        album.addSong("双刀", 5.67);

        albums.add(album);

        album = new Album("范特西", "周杰伦");

        album.addSong("爱在西元前", 5.42);
        album.addSong("爸, 我回来了", 3.45);
        album.addSong("简单爱", 6.43);
        album.addSong("忍者", 6.14);
        album.addSong("开不了口", 8.34);
        album.addSong("上海一九四三", 3.56);
        album.addSong("对不起", 7.83);
        album.addSong("威廉古堡", 3.13);
        album.addSong("双节棍", 3.23);
        album.addSong("安静", 2.55);

        albums.add(album);


        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("晴天", playList);
        albums.get(0).addToPlayList("梯田", playList);
        albums.get(0).addToPlayList("轨迹", playList);
        albums.get(0).addToPlayList(9, playList);
        albums.get(1).addToPlayList(8, playList);
        albums.get(1).addToPlayList(3, playList);
        albums.get(1).addToPlayList(2, playList);
        albums.get(1).addToPlayList(100, playList);

        play(playList);

    }

    private static void play(LinkedList<Song> playList) {
        Scanner scanner = new Scanner(System.in);

        boolean quit = false;
        boolean forward = true;

        ListIterator<Song> listIterator = playList.listIterator();

        if (playList.size() == 0) {
            System.out.println("No songs in playlist");
            return;
        } else {
            System.out.println("Now playing " + listIterator.next().toString());
        }

        printMenu();

        while (!quit) {
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("Playlist complete.");
                    quit = true;
                    break;
                case 1:
                    if (!forward) {
                        if (listIterator.hasNext()) {
                            listIterator.next();
                        }
                        forward = true;
                    }
                    if (listIterator.hasNext()) {
                        System.out.println("Now playing " + listIterator.next().toString());
                    } else {
                        System.out.println("Reached the end of the playlist");
                    }
                    break;
                case 2:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            listIterator.previous();
                        }
                        forward = false;
                    }
                    if (listIterator.hasPrevious()) {
                        System.out.println("Now playing " + listIterator.previous().toString());
                    } else {
                        System.out.println("Reached the start of the playlist");
                    }
                    break;
                case 3:
                    if (forward) {
                        if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                            forward = false;
                        } else {
                            System.out.println("Reached the start of the playlist");
                        }
                    } else {
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                            forward = true;
                        } else {
                            System.out.println("Reached the end of the playlist");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if (playList.size() > 0) {
                        listIterator.remove();
                        if (listIterator.hasNext()) {
                            System.out.println("Now replaying " + listIterator.next().toString());
                        } else if (listIterator.hasPrevious()) {
                            System.out.println("Now replaying " + listIterator.previous().toString());
                        } else {
                            System.out.println("Playlist is empty");
                        }
                    } else {
                        System.out.println("Playlist is empty");
                    }
                    break;
            }
        }
    }

    private static void printMenu() {
        System.out.println("Available actions: \npress:");
        System.out.println("0 - to quit\n" +
                "1 - to play next song\n" +
                "2 - to play previous song\n" +
                "3 - to replay the current song\n" +
                "4 - list songs in the playlist\n" +
                "5 - print options menu\n" +
                "6 - delete current song from playlist");
    }

    private static void printList(LinkedList<Song> playlist) {
        Iterator<Song> iterator = playlist.listIterator();
        System.out.println("========================");

        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }

        System.out.println("========================");
    }
}
