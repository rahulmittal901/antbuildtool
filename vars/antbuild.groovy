#!/usr/bin/env groovy

def call(args) {
 
  bat "${tool 'ant'}/bin ${args}"
}
