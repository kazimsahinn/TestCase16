# TestCase16 Dökümantasyonu

Bu sınıf, kullanıcı kayıt işlemini, ürün ekleyip sepet işlemlerini ve sipariş verme süreçlerini otomatikleştiren bir Selenium testidir. Test, kullanıcı kaydını oluşturur, bir ürün ekler, sepete ekleme ve ödeme işlemlerini yapar ve sonunda kullanıcı hesabını siler.

## Kullanılan Sınıflar ve Yöntemler;
homePage: Ana sayfa öğelerini temsil eden sınıf.<br/>
signupPage: Kayıt sayfası öğelerini temsil eden sınıf.<br/>
cartPage: Sepet ve ödeme işlemleriyle ilgili sayfa öğelerini temsil eden sınıf.<br/>
ConfigReader: Konfigürasyon dosyasından veri okuma işlemi yapan yardımcı sınıf.<br/>
Driver: WebDriver nesnesini yöneten yardımcı sınıf.<br/>
ReusableMethods: Tekrar kullanılabilir yardımcı metodları içeren sınıf.<br/>

## Test İş Akışı
**1. Giriş ve Sayfa Yüklemeleri**<br/>
WebDriver üzerinden testin yapılacağı siteye gidilir.<br/>
Ana sayfada logonun ve kayıt butonunun görünürlüğü kontrol edilir ve ardından kayıt butonuna tıklanır.<br/>
**2. Kullanıcı Kayıt İşlemi**<br/>
Kayıt sayfasında kullanıcı adı ve email adresi girilir.<br/>
Hesap bilgileri formu doldurulur:<br/>
Cinsiyet seçimi<br/>
Şifre girişi<br/>
Doğum tarihi seçimi<br/>
Adres bilgileri girilir: isim, soyisim, adres, ülke, eyalet, şehir, posta kodu ve telefon numarası<br/>
"Hesap Oluştur" butonuna tıklanır ve hesabın oluşturulduğu doğrulanır.<br/>
**3. Ürün Sepete Ekleme**<br/>
Ürün sayfasına gidilir ve belirli bir ürün sepete eklenir.<br/>
Alışverişe devam etme butonuna tıklanır ve ardından sepet sayfasına gidilir.<br/>
**4. Sepet ve Ödeme İşlemleri**<br/>
Sepet sayfasında "Ödeme Yap" butonunun görünürlüğü kontrol edilir ve ödeme sayfasına geçilir.<br/>
Teslimat ve fatura adreslerinin aynı olduğu doğrulanır.<br/>
Sipariş açıklaması girilir ve sipariş tamamlanır.<br/>
Kredi kartı bilgileri girilerek ödeme yapılır ve siparişin başarılı olduğu doğrulanır.<br/>
**5. Hesap Silme ve Çıkış**<br/>
Kullanıcı hesabı silinir ve silme işleminin başarılı olduğu doğrulanır.<br/>
Test sonunda tarayıcı kapatılır.
