# Project Echoe Android

This project wraps the **original Pecho `loader.html` website page** in a full-screen Android WebView. The app loads the live page from jsDelivr, so it uses the latest version on the repository's `main` branch.

- App label: Project Echoe
- Launcher icon: the white E on black from the supplied reference
- Intended phone: Samsung Galaxy S23
- Build: GitHub Actions creates a debug APK automatically

## Build it using only your phone

1. On GitHub, create a **new public repository** named `ProjectEchoe`.
2. Download this ZIP to your phone and extract it with My Files.
3. In the new GitHub repository, use **Add file → Upload files** and upload the extracted project contents. Make sure `.github/workflows/build-apk.yml` is included. If GitHub's mobile upload screen hides dot-folders, create the workflow file separately at `.github/workflows/build-apk.yml` using the GitHub website's Add file → Create new file.
4. Commit the files to the `main` branch.
5. Open the repository's **Actions** tab. Select **Build Project Echoe APK**, then **Run workflow** if it has not started automatically.
6. Wait for the workflow to finish successfully.
7. Open the completed workflow run, scroll to **Artifacts**, and download `Project-Echoe-APK`.
8. Extract the downloaded artifact ZIP. Install `app-debug.apk` on your Galaxy S23. If Android asks, allow your browser or My Files to install this APK.

## Website URL used by the app

`https://cdn.jsdelivr.net/gh/VoidNetworkOnTop/pecho@main/loader.html`

The repository currently contains `loader.html` and no configured website URL in its About section, so the app loads that original HTML file through the CDN rather than guessing a separate site address.

## Notes

- This is an unsigned debug APK for personal installation, not a Play Store release.
- The website requires internet access.
- Website updates on the source repository's `main` branch are reflected when the CDN cache refreshes.
