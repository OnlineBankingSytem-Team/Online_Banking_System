# Online_Banking_System
 Online Banking System

##GRUP İÇİN GENEL AÇIKLAMA 

Projedeki java kodları src/main/java altında olacak şekilde yaptım. Controller kısmı api ile bağlantılı kısımdır. Burada findAll tarzı metotları contollerın kendisine ait olduğu repository sayfasından çekersiniz. Admin ve BankTeller için yaptıklarımı örnek alabilirsiniz. Repository kısmına sadece benim yazdığımı yazmanız yeterli belirli yerlere kadar olan metotlar hazır olarak orda var. Hangi metotlar olduğunu araştırarak öğrenebilirsiniz. Ekstradan method eklemek istediğiniz zaman onların nasıl eklendiğini araştırarak bulursunuz. Model kısımlarını oluşturdum zaten fakat eksik olan kısımlar var. Eksik olan kısım aslında modeller arası bağlantı kısmıdır. Yani bir kullanıcının birden fazla hesabı veya kartı olabilir. Bunlar arasındaki ilişki 1-n şeklindedir. Bu ilişkiyi model kısmında belirtmeniz gerekiyor. Kullanmanız gereken attribute @OneToMany şeklindedir. Ama buna yazmanız gereken şeyler var bunları araştırıp bulabilirsiniz. Bunlarla ilgili bir sürü doküman var.

Projedenin veritabanına bağlandığı connection stringinin olduğu veya configürasyonun yapıldığı yer src/main/resource altında. Bu kısım pek sizi ilgilendirmiyor ama ne olduğunu bilin yine de. Tablolara bir şey ekleyeceğiniz zaman haber edin. Ben hallederim. 

Projedeki jsp dosyalarını ise src/main/webapp/WEB-INF ile aynı yerde yapacaksınız yoksa çalışmıyor. Dosyalama kısmına biraz özen gösterin lütfen en azından hepsi birbiri altında olsun. Bulması kolay olsun. Mesela adminle alakalı olan jspler admin klasörü altında olsun gibi düşünebilirsiniz.
 
 
 
