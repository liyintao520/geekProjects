# geekProjects
极客学院第五期学习
# 公钥
+ 通过git config --global user.name “yourname”，git config --global user.email “email@email.com ”（这里得名字和邮箱都是注册github时用的）设置全局用户名和邮箱。
+ ssh-keygen -t rsa -C "lyt890916wlj@sina.com"，一路回车，在出现选择时输入Y，再一路回车直到生成密钥。（注意不要输入密码直接回车）
+ 会在/Users/***/路径下生成一个.ssh文件夹，密钥就存储在其中。
+ 查看公钥 切换目录，cat id_rsa.pub  并复制到gitHub上
+ 测试：ssh -T git@github.com