# کاربرد عملی اصول شئ‌گرایی SOLID با استفاده از روش Test Driven Development
#### آزمایش دوم درس آز مهندسی نرم افزار 
---
### گزارش آزمایش:
با توجه به فرآیند Test Driven Development ->
1. در ابتدا تست واحد نوشته شد
2. سپس با توجه به تست واحد کد مورد نیاز برای پاس کردن آن زده شد
3. در ادامه مجدد تست ها ران شد که تست ها پاس بشوند
4. پس از پاس شدن تست ها کد های زده شده ریفکتور شدند
5. در آخر چرخه گفته شده برای نیازمندی بعدی مجدد تکرار شد

برای مثال نیاز مندی اول " با داشتن طول (height) و عرض (width) یک مستطیل (Rectangle)، مساحت آن را محاسبه کند " برای رفع این نیازمندی

در ابتدا تست های واحد آن نوشته شد ~ [کامبت تست های واحد ](https://github.com/amirzgh/SE-Lab-2/commit/b700a3bf3fb9d98568e98e53304cb93cc50da4e1#diff-e7bfbfaa7185148cca1a750aa2fcd390c31bdfe417b049fd44c57983f3830ca8) ~
و تست ها اجرا و همگی شکست خوردند 

در ادامه کد های لازم برای پاس کردن تست ها اضافه شد ~ [کامیت کد های اضافه شده](https://github.com/amirzgh/SE-Lab-2/commit/bad4341c7e79dbe55f2c81ee5d5fc9703945b988#diff-1597d2955516e4d404c9395c883d26475c58b27032926237f062392226c69fe9) ~
و تست ها مجدد اجرا شد و همگی پاس شدند 

در ادامه کد های زده شد مجدد بررسی شد و ریکفتور های لازم صورت گرف ~ [کامیت ریکفتور های صورت گرفته](https://github.com/amirzgh/SE-Lab-2/commit/1a1ad8bad6165be6c283ebeadf391e448da15f75) ~

در اخر درخواست ادغام ( pull request ) با شاخه ( Branch )،  develop زده شد و توسط اعضا دیگر ریو شد و در اخر ادغام صورت گرفت ~ [لینک درخواست ادغام](https://github.com/amirzgh/SE-Lab-2/pull/2) ~


---
### پرسش‌ها:
1. پرسش اول:
<br />
اصول برنامه نویسی SOLID به صورت زیر است
<br />
single responsobility : این اصل بدین معنا است که یک کلاس تنها مسئول انجام یک وظیفه است و تنها در صورتی میتواند تغییر کند که در انجام آن وظیفه تغییری ایجاد شود. به عنوان مثال اگر کلاس ما کلاسی مانند student  باشد تنها زمانی تغییر میکند که در وظایف و خصوصیات دانشجو تغییری ایجاد شود   
  اصل دوم : The open close 
  این اصل بدین معنا است که کلاس ساخته شده باید قابل گسترش باشد ولی نباید در ساختار آن تغییر (modification)  داشته باشیم به عنوان نمونه ما باید امکان اضافه کردن فانکشن جدید به کلاس خود را داشته باشیم بدون آنکه به کدی که د رحال حاضر وجود دارد تغییری ایجاد کنیم و این اصل به این دلیل است که هر بار که ما کلاس خود را تغییری در گد هایش دهیم احتمال بروز باگ را بالا میبریم و این اصل را باید رعایت کنیم تا کمتر به کد های تست شده قدیمی تغییری وارد کنیم  
  اصل سوم : Liskov  
  این اصل بیان میکند که هر کلاس فرزند باید با کلاس پدر قابل تعویض باشد بدین معنا که اگر کلاس B فرزند A  باشد آبجکت ساخته شده در کلاس فرزند باید قابلیت این را داشته باشد که به یک متد از آبجکتی از کلاس پدر پاس داده شود و بدون اینکه عملکرد اشتباهی داشته   باشد خروجی دهد  
  اصل چهارم : Interface Segregation Pronciple  
  این اصل بیان میکند که داشتن چندین interface در ارتباط با کاربر بهتر از داشت ن تنها یک Interface کلی در ارتباط با کاربر است چرا که کاربر نیازی ندارد که فانکشن هایی که نیاز ندارد را پیاده سازی کند  
  اصل پنجم: Dependency Inversion Principle  
  بنا بر این اصل کلاس های ما باید تنها به interface ها و abstract classes وابستگی داشته باشد و نه به کلاس های بهم وابسته و فانکشن ها
2. پرسش دوم:  
   اصول SOLID در مرحله طراحی سیستم در چرخه ایجاد نرم افزار قرار میگیرند چرا که در آن مرحله طراحی class ها و interface ها صورت میگیردو نیاز است که این اصول را برای داشتن نرم افزاری کارا و بهینه رعایت کنیم.
3. پرسش سوم:
4. پرسش چهارم:  
   
