#!/bin/bash

set -feuo pipefail

GIT_SHA=${1:0:8}
sed -i "s|image: ffactory/pokemondemo:.*|image: ffactory/pokemondemo:$GIT_SHA|" "${GITHUB_WORKSPACE}"/manifests/pokemon-kustomize/pokemon-deployment.yaml
