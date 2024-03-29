# 如何在本项目中应用Git
本文档将会以情景代入的方式，简单介绍可能会使用到的Git操作和Github-Flow

## 1. 如何与GitHub上的其他小伙伴建立联系？
首先我们需要有一个Git的客户端，下载Git客户端可以登陆[官方网站](https://git-scm.com/download)进行下载
下载完客户端之后设置你自己的用户名和邮箱名，设置正确的用户名和邮箱地址可以让你在仓库中的commit里面留下头像～
- 设置用户名
```shell
$ git config --global user.name "二狗"
```
- 设置邮箱
```shell
$ git config --global user.email "example@scut.edu.cn
```
准备就绪，就可以直接在GitHub上找到组织的仓库的链接，进行克隆，克隆到本地之后就可以开始在仓库上为所欲为了

## 2. 如何贡献自己的代码（文档）？
我们之前进行了一系列操作，把远程的代码库克隆到了本地。我们接下来直接在仓库里面操作，操作完执行命令上传同步即可。

但是我们的要求是在`develop`分支上作业，直接在`master`上作业的话一般会被喷死，不过现阶段试错一下没什么大碍，不过要提醒大家的是，Git是为追踪文件而生的，所以你做的任何蠢事都会被记录下来，撤销的话只能删库~~,所以准备好接受公开处刑吧~~

于是我们需要在本地切换成`develop`分支(**我们接下来的一切操作的工作路径都必须基于目标仓库之内**)
```shell
$ git checkout develop
```
只要是从GitHub上面克隆下来的，而且上面已经有`develop`分支的，我们就不需要再创建了，直接使用`checkout`命令即可

切换成develop分支之后，我们开始进行自己的更改，使用一个操作可以看到自己的更改情况
```shell
$ git status
```

出现的信息可以清楚地看到自己在哪个分支工作、做了什么改变，千万不要嫌烦不看

将我们的工作提交到暂存区
```shell
$ git add .
```

将我们的工作确认提交
```shell
$ git commit -m "你的骚话"
```

将我们的工作提交到远程分支，确保其他小伙伴也能接受到我们的垃圾代码的洗礼
```shell
$ git push origin develop
```

## 3. 如何接受他人的洗礼？
只有一个粗暴的方法
```shell
$ git pull origin develop
```
养成一个好习惯，在选择拉取`develop`分支上的内容时，将自己的本地分支也切换成`develop`

如果没有养成习惯的话，很容易就自己不知不觉中XJB地合并了代码，准备好被喷吧



## 4. GitHub-Flow是什么?抓捕鲁迅和我周树人有什么关系?

GitHub-Flow的具体概念和流程大家可以到网上找资料,直接上手中文资料会好得多,廖雪峰、阮一峰等知名博主的讲述都非常具有参考性,毕竟接了不少广告

那么我们如何在项目中应用GitHub-Flow呢??????

主要还是要在`develop`分支上操作:

```shell
$ git checkout develop
```

假设,我是负责管理员系统的工作的,为了避免跟别人的代码形成冲突(别人也要加垃圾代码),我们应该在`develop`分支上创建一个新的分支.我们创建一个专门负责管理员系统的分支:

```shell
$ git branch develop-admin
```

然后切换到这个new-born的分支:

```shell
$ git checkout develop-admin
```

这个时候我们就可以在自己的分支上为所欲为,而别人也可以在别人的分支上为所欲为了

但是注意!`develop-admin`分支是为了方便自己管理,时辰到了(你改完代码了),还是要回到`develop`分支的.

你们可能会想到`git merge`

但是在现实生活中这往往是翻车的开端,你XJB`merge`了,别人也XJB`merge`了,那最后这个`develop`分支就千疮百孔了.所以我们统一将分支的合并交给负责人(**初始阶段大家还不怎么懂就不设置负责人了**),由负责人来决定谁的代码更加垃圾,然后选择最垃圾的代码合并到`develop`分支

合并代码中的重要步骤是`PR`(pull request)

这个操作需要在GitHub的网站上发起.如果不会的话在网上搜索一下相关教程.