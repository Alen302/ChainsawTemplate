# Chainsaw Installation

Owner: Ricardo Lee
Created time: August 5, 2023 11:47 PM
Status: In progress

# Installation(via Intellij IDEA)

- open with VCS
    - 通过IDEA的Get from VCS功能

  ![Untitled](open%20with%20vcs.png)

    - 或者使用git clone来打开本项目

    ```bash
    git clone git@github.com:Chainsaw-Team/ChainsawTemplate.git [targetDir]
    ```

- download .jar file to lib file
    - 在正式编译ChainsawTemplate之前, 需要前往[ChainsawTeam/Chainsaw](https://github.com/Chainsaw-Team/Chainsaw)下载[Releases](https://github.com/Chainsaw-Team/Chainsaw/releases)版本的jar文件
        - Chainsaw.jar
        - engine.jar
    - 下载完成之后将其放到ChainsawTemplate/lib这个目录下(如果识别不到, 在对应的jar文件下右键→ Add as Library)
- build
    - 上述步骤完成之后, 就可以开始ChainsawTemplate的编译过程了, 编译的时候最好有[梯子](https://www.notion.so/Chainsaw-Installation-37594125abe1453fb736d41854cd2d4e?pvs=21)
    - sbt文件放在/ChainsawTemplate/build.sbt


# For Mainland China

- 在第一次编译ChainsawTemplate时,需要下载sbt,scala和其它依赖项,此时最好有梯子,下面给出在使用clash + Intellij IDEA时的代理配置方法
    - 在clash的General页面中查看端口号,使用WSL时,还需要开启Allow LAN,将鼠标悬停在该选项上,可以查看到相对于WSL的host ip
        
        ![Untitled](clash%20configuration.png)
        
    - 在IDEA的Settings中设置host ip和端口号,check connection无误后配置完成
        - host ip一般是127.0.0.1(localhost),对于WSL,使用上面查看到的IP
        
        ![Untitled](setting%20proxy%20in%20IDEA.png)
        
        ![Untitled](success.png)
- 
# Run example in ChainsawTemplate