package com.javaex.practice;

public class SongApp{
	public static void main(String[] args) {
		
		Song iu = new Song();
		iu.setTitle("좋은날");
		iu.setArtist("아이유");
		iu.setAlbum("Real");
		iu.setYear(2010);
		iu.setTrack(3);
		iu.setComposer("이민수");
		
//		Song iu = new Song("아이유", "좋은날", "Real", "2010", '3', "이민수");
		iu.showInfo();
		
		
		Song bigbang = new Song();
		bigbang.setTitle("거짓말");
		bigbang.setArtist("BIGBANG");
		bigbang.setAlbum("Always");
		bigbang.setYear(2007);
		bigbang.setTrack(2);
		bigbang.setComposer("G-DRAGON");
		bigbang.showInfo();
		
		Song busker = new Song();
		busker.setTitle("벗꽃엔딩");
		busker.setArtist("버스커버스커");
		busker.setAlbum("버스커버스커1집");
		busker.setYear(2012);
		busker.setTrack(4);
		busker.setComposer("장범준");
		busker.showInfo();
		
	}

}
