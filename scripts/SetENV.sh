prop() {
  grep "^[[:space:]]*${1}" gradle.properties | cut -d'=' -f2 | sed 's/^[[:space:]]*//; s/\r//'
}

project_id="atdeprecated"
project_id_b="atDeprecated"

commitid=$(git log --pretty='%h' -1)
mcversion=$(prop mcVersion)
grdversion=$(prop version)
release=$(prop release)
release_tag="$mcversion-$commitid"
jarName="$project_id-$mcversion-paperclip.jar"
jarName_dir="atdeprecated-server/build/libs/$jarName"

pre=false
make_latest=false

if [ "$release" = "1" ]; then
  pre=true
  make_latest=false
elif [ "$release" = "2" ]; then
  pre=false
  make_latest=true
fi

mv atdeprecated-server/build/libs/$project_id-paperclip-$grdversion-mojmap.jar $jarName_dir

echo "project_id=$project_id" >> $GITHUB_ENV
echo "project_id_b=$project_id_b" >> $GITHUB_ENV
echo "commit_id=$commitid" >> $GITHUB_ENV
echo "commit_msg=$(git log --pretty='> [%h] %s' -1)" >> $GITHUB_ENV
echo "mcversion=$mcversion" >> $GITHUB_ENV
echo "pre=$pre" >> $GITHUB_ENV
echo "tag=$release_tag" >> $GITHUB_ENV
echo "jar=$jarName" >> $GITHUB_ENV
echo "jar_dir=$jarName_dir" >> $GITHUB_ENV
echo "make_latest=$make_latest" >> $GITHUB_ENV