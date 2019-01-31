#!/usr/bin/env groovy

def call(arg) {

  withAnt(installation: 'ant', jdk: 'jdk') {
            bat "ant compile"

       }

}
