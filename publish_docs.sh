#! /bin/bash

echo "publishing docs for: $RELEASE_VERSION"
git config --global user.email "evangelists@stormpath.com"
git config --global user.name "stormpath-sdk-java Auto Doc Build"
git clone git@github.com:stormpath/stormpath.github.io.git
cd stormpath.github.io
git fetch origin source:source
git checkout source
rm -rf source/java/servlet-plugin/
cp -r ../docs/build/html source/java/servlet-plugin
cp -r ../docs/build/html source/java/servlet-plugin/latest
cp -r ../docs/build/html source/java/servlet-plugin/$RELEASE_VERSION
rm -rf source/java/spring-boot-web
cp -r ../extensions/spring/boot/docs/build/html source/java/spring-boot-web
cp -r ../extensions/spring/boot/docs/build/html source/java/spring-boot-web/latest
cp -r ../extensions/spring/boot/docs/build/html source/java/spring-boot-web/$RELEASE_VERSION
git add --all
git commit -m "stormpath-sdk-java release $RELEASE_VERSION"
ls -la source/java/servlet-plugin
#git push origin source
gem install bundler
bundle install
rake setup_github_pages[git@github.com:stormpath/stormpath.github.io.git]
cd _deploy
git pull --no-edit -s recursive -X theirs https://github.com/stormpath/stormpath.github.io.git
cd ..
rake generate
cd _deploy
git pull --no-edit -s recursive -X theirs https://github.com/stormpath/stormpath.github.io.git
cd ..
#rake deploy
cd ..
