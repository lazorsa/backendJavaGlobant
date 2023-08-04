package com.guide10.bonus;

import com.guide10.entity.FamousSinger;

import java.util.HashSet;
import java.util.Scanner;

public class Bonus02_FamousSinger {
    public static void main(String[] args) {
        HashSet<FamousSinger> singers = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        String name;
        String albumMostSold;

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a singer name: ");
            name = scanner.nextLine();
            System.out.println("Enter a album most sold: ");
            albumMostSold = scanner.nextLine();
            singers.add(new FamousSinger(name, albumMostSold));
        }

        showSingers(singers);

        do {
            switch (
                    menu()
            ) {
                case 1:
                    System.out.println("Enter a singer name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter a album most sold: ");
                    albumMostSold = scanner.nextLine();
                    addSinger(singers, new FamousSinger(name, albumMostSold));
                    break;
                case 2:
                    System.out.println("Enter a singer name: ");
                    name = scanner.nextLine();
                    System.out.println("Enter a album most sold: ");
                    albumMostSold = scanner.nextLine();
                    removeSinger(singers, new FamousSinger(name, albumMostSold));
                    break;
                case 3:
                    showSingers(singers);
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        } while (true);
    }

    private static int menu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 - Add singer");
        System.out.println("2 - Remove singer");
        System.out.println("3 - Show singers");
        System.out.println("4 - Exit");
        System.out.println("Enter a option: ");
        return scanner.nextInt();
    }

    public static void showSingers(HashSet<FamousSinger> singers) {
        System.out.println("Singers: ");
        for (FamousSinger singer : singers) {
            System.out.println(singer.getName() + " - " + singer.getAlbumMostSold());
        }
    }

    public static void addSinger(HashSet<FamousSinger> singers, FamousSinger singer) {
        singers.add(singer);
    }

    public static void removeSinger(HashSet<FamousSinger> singers, FamousSinger singer) {
        singers.remove(singer);
    }
}
