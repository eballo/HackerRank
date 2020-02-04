#!/bin/bash

read text

if [[ "$text" == "Y" || "$text" == "y" ]]; then
  echo "YES";
elif [[ "$text" == "N" || "$text" == "n" ]]; then
  echo "NO"
fi
