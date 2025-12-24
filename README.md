# Git Workflow Summary

This project shows how Git commands and branching work in practice.

## Git Commands

- `git init` → Start a new repository  
- `git add` → Stage files for commit  
- `git commit` → Save changes locally  
- `git push` → Send commits to GitHub  
- `git pull` → Get updates from remote  
- `git branch` → Create/manage separate lines of work  

## Branching & Merging

1. **Create Branch**: Make a new branch for each feature or task.  
2. **Develop**: Work and commit changes on the feature branch.  
3. **Sync**: Pull latest changes from `main` to avoid conflicts.  
4. **Merge**: Merge feature branch back into `main` when done.  
5. **Push**: Update remote repository with merged changes.  

**Workflow Summary:**  
`main` ← feature branch → development → merge → stable code
