pipeline{

    // 任何代理都可以
    agent any
    // 定义环境信息
    environment {
      start  = "start"
      end  = "end"
      WS="${WORKSPACE}"

    }

    // 定义流水线加工 流程
    stages{

        stage('check')
        {
            steps{
                sh '''
                    printenv
                '''
                sh " java -version"
                sh  " git  --version "
            }
        }
        /// just test
         // 编译
            // 步骤
            //             steps{
            //
            //             }
        stage('build') {
            agent{
                docker{
                    image 'maven:3-alpine'
                    args '-v /root/.m2:/root/.m2'

                }
            }


          steps {

            // for
            // One or more steps need to be included within the steps block.
            echo "build $start"

            sh '''pwd && ls -alh'''
            // 指定jenkins中的特定路径来执行maven
            sh "echo 默认工作目录: ${WS}"
            sh 'cd ${WS} && mvn clean package -s "/var/jenkins_home/appconfig/maven/settings.xml" -DskipTests'

            echo "build $end"


          }
        }

          // 测试
        stage('test')
        {
            steps{
                echo "test $start"
                sh '''pwd && ls -alh'''
                echo "test $end"
            }
        }


        // 打包
        stage('package')
        {
            steps{
                 echo "package $start"
                 sh '''pwd && ls -alh'''
                 sh "docker build -f Dockerfile -t java-devops ."

                 echo "package $end"
            }
        }

        // 部署
        stage('deploye'){
            steps{
                echo "deploye $start"
                sh "docker version"
                sh '''pwd && ls -alh'''
                 sh "docker rm -f java-devops "
                sh "docker run -d -p 8888:8080 --name java-devops java-devops"

                echo "deploye $end"
            }
        }
    }
}