package com.uas.wisatabandung_10117229;
/*
 * Nama : Mufti Alfarisy
 * Kelas : IF 7
 * NIM : 10117229
 * tgl pengerjaan : 7 agustus - 12 agustus 2020
 * */
public class MainPresenter {
    private MainView view;
    private User user;

    public MainPresenter(MainView view) {
        this.view = view;
    }
    public void tampildata(String nim, String nama, String kelas) {
        String data = tampilandata(nim, nama, kelas);
        user = new User();
        view.tampilkandata(user);
    }
    private String tampilandata(String nim, String nama, String kelas) {
        return nim;
    }
}
