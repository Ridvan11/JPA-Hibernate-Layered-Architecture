package _02.dynamic.navigator;

public class Notes {

}

//dynamic navigation i gerceklestirmek icin faces-config.xml dosyasindan yararlaniriz.
//bu dosyada navigation-rule'lar ekleriz.


//login.xhtml sayfasindan geldiginde , outcome bilgisi success oldugunda welcome.xhtml sayfasina git demektir.
//<navigation-rule>
//<from-view-id>/login.xhtml</from-view-id>
//<navigation-case>
//	<from-outcome>success</from-outcome>
//	<to-view-id>/welcome.xhtml</to-view-id>
//</navigation-case>
//</navigation-rule>