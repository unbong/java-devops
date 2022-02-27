pipeline{

    // 任何代理都可以
    agent any
    // 定义环境信息
    environment {
      start  = "start"
      end  = "end"
    }

    // 定义流水线加工 流程
    stages{

        stage('check')
        {
            steps{

//                 sh "set JENKINS_URL=http://8.211.173.132:8080/"
//                 sh "set JOB_URL=http://8.211.173.132:8080/job/java-devops/"
                sh '''
                    printenv
                '''



                sh " java -version"
                sh  " git  --version "


            }
        }

         // 编译
            // 步骤
            //             steps{
            //
            //             }
        stage('build') {
          steps {
            // One or more steps need to be included within the steps block.
            echo "build $start"

            echo "build $end"

            sh '''pwd && ls -alh
            '''
          }
        }

          // 测试
        stage('test')
        {
            steps{
                echo "test $start"
                echo "test $end"
            }
        }


        // 打包
        stage('package')
        {
            steps{
                 echo "package $start"
                 echo "package $end"
            }
        }

        // 部署
        stage('deploye'){
            steps{
                echo "deploye $start"

                echo "deploye $end"
            }
        }
    }
}