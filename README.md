# Chainsaw Installation

Owner: Ricardo Lee
Created time: August 5, 2023 11:24 PM
Status: In progress

# Installation(via Intellij IDEA)

- open with VCS
- download .jar file to lib file
- build

# For Mainland China

- 在第一次编译ChainsawTemplate时,需要下载sbt,scala和其它依赖项,此时最好有梯子,下面给出在使用clash + Intellij IDEA时的代理配置方法
    - 在clash的General页面中查看端口号,使用WSL时,还需要开启Allow LAN,将鼠标悬停在该选项上,可以查看到相对于WSL的host ip
        
        ![Untitled](clash%20configuration.png)
        
    - 在IDEA的Settings中设置host ip和端口号,check connection无误后配置完成
        - host ip一般是127.0.0.1(localhost),对于WSL,使用上面查看到的IP
        
        ![Untitled](Chainsaw%20Installation%20c5bfe4adac7b46a18e32b2cbe675e774/Untitled%201.png)
        
        ![Untitled](Chainsaw%20Installation%20c5bfe4adac7b46a18e32b2cbe675e774/Untitled%202.png)
