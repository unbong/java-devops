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

         // 编译
            // 步骤
            //             steps{
            //
            //             }
        stage('build') {
          steps {
            // One or more steps need to be included within the steps block.
            echo "build $start"

            echo "build $send"

            sh '''pwd && ls -alh
            '''
          }

        stage('test')
        {
            steps{
                echo "test $start"
                echo "test $end"
            }
        }


        stage('package')
        {
            steps{
                 echo "package $start"
                 echo "package $end"
            }
        }

        stage('deploye'){
            steps{
                echo "deploye $start"

                echo "deploye $end"
            }
        }
    }





        // 测试

        // 打包


        // 部署



}