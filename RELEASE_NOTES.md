# Release Notes

This document contains high-level release notes. More details can be found in [milestones](https://github.com/searchisko/searchisko/issues/milestones) on GitHub.

## 1.0.3

- ['Normalization API'](http://docs.jbossorg.apiary.io/#normalizationapi) added [#90](https://github.com/searchisko/searchisko/issues/90)
- ['Content Indexers API'](http://docs.jbossorg.apiary.io/#contentindexersapi) extended by `_stop` and `_restart` operations. `_status`, `_stop` and `_restart` can be used for one indexer or all indexer at all also. [#91](https://github.com/searchisko/searchisko/issues/91)


## 1.0.2

- Filtering by document fields has been generalized [#41](https://github.com/searchisko/searchisko/issues/41)
- 'Content Manipulation API' POST operation returns warnings from data preprocessors
- 'Content Manipulation API' extended by bulk POST and DELETE operations
- Contributor record now contains full name replicated from profile. Useful for contributor normalization by name. 
  **IT IS NECESSARY** to load new mapping for `sys_contributors` index during upgrade, and then run `update_contributor_profile` Task for `jbossorg_username` to fill names from profile.
- Added two new admin tasks `reindex_contributor` and `reindex_project` useful to rebuild search indices for Project and Contributor configurations
- Added ['Content Indexers API'](http://docs.jbossorg.apiary.io/#contentindexersapi) which allows force reindex and get status for content indexers hosted in Searchisko
- Updated elasticsearch-river-remote and elasticsearch-river-jira to latest versions
- Integration tests on REST API [#12](https://github.com/searchisko/searchisko/issues/12)

## 1.0.1

- Bug fix in `update_contributor_profile` task. [#65](https://github.com/searchisko/searchisko/issues/65)
- `jboss-developer` content provider configuration moved to different repo.
- Updates in DCP configuration.

## 1.0.0

- Initial release
