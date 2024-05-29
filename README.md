TestCase16 Dökümantasyonu
Bu sınıf, kullanıcı kayıt işlemini, ürün ekleyip sepet işlemlerini ve sipariş verme süreçlerini otomatikleştiren bir Selenium testidir. Test, kullanıcı kaydını oluşturur, bir ürün ekler, sepete ekleme ve ödeme işlemlerini yapar ve sonunda kullanıcı hesabını siler.

Kullanılan Sınıflar ve Yöntemler

homePage: Ana sayfa öğelerini temsil eden sınıf.
signupPage: Kayıt sayfası öğelerini temsil eden sınıf.
cartPage: Sepet ve ödeme işlemleriyle ilgili sayfa öğelerini temsil eden sınıf.
ConfigReader: Konfigürasyon dosyasından veri okuma işlemi yapan yardımcı sınıf.
Driver: WebDriver nesnesini yöneten yardımcı sınıf.
ReusableMethods: Tekrar kullanılabilir yardımcı metodları içeren sınıf.

Test İş Akışı
1. Giriş ve Sayfa Yüklemeleri
WebDriver üzerinden testin yapılacağı siteye gidilir.
Ana sayfada logonun ve kayıt butonunun görünürlüğü kontrol edilir ve ardından kayıt butonuna tıklanır.

2. Kullanıcı Kayıt İşlemi
Kayıt sayfasında kullanıcı adı ve email adresi girilir.
Hesap bilgileri formu doldurulur:
Cinsiyet seçimi
Şifre girişi
Doğum tarihi seçimi
Adres bilgileri girilir: isim, soyisim, adres, ülke, eyalet, şehir, posta kodu ve telefon numarası
"Hesap Oluştur" butonuna tıklanır ve hesabın oluşturulduğu doğrulanır.

3. Ürün Sepete Ekleme
Ürün sayfasına gidilir ve belirli bir ürün sepete eklenir.
Alışverişe devam etme butonuna tıklanır ve ardından sepet sayfasına gidilir.

4. Sepet ve Ödeme İşlemleri
Sepet sayfasında "Ödeme Yap" butonunun görünürlüğü kontrol edilir ve ödeme sayfasına geçilir.
Teslimat ve fatura adreslerinin aynı olduğu doğrulanır.
Sipariş açıklaması girilir ve sipariş tamamlanır.
Kredi kartı bilgileri girilerek ödeme yapılır ve siparişin başarılı olduğu doğrulanır.

5. Hesap Silme ve Çıkış
Kullanıcı hesabı silinir ve silme işleminin başarılı olduğu doğrulanır.
Test sonunda tarayıcı kapatılır.
