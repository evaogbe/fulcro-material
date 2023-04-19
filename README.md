# Fulcro Material UI wrapper

![Clojars version](https://img.shields.io/clojars/v/net.clojars.eoogbe/fulcro-material?include_prereleases)

[Fulcro](https://fulcro.fulcrologic.com/) convenience wrapper around
[Material UI](https://mui.com/).

## Version Compatibility

- Fulcro 3
- Material UI 5

## Usage

Add this library to your Fulcro project and
[install Material UI](https://mui.com/material-ui/getting-started/installation/). If you need icons
or the date pickers, install those as well.

If you just want everything (which will bloat your advanced compile build), then use:

```clojure
(:require [ogbe.fulcro.mui.factories :as mui])
```

But if you’d like to include just what you use in your build then individual factories can be found
in namespaces that mirror the Material UI module structure:

e.g. Inputs > TextField is available as

```clojure
(:require [ogbe.fulcro.mui.inputs.text-field :refer [ui-text-field]])
```

and Data Display > Avatar is available as

```clojure
(:require [ogbe.fulcro.mui.data-display.avatar :refer [ui-avatar]])
```

While this is a bit tedious in the requires, it ensures that you don’t get components in your build
that you don’t use.

Props are required. The factories will convert them to js for you, but if you want every ounce of
possible speed you can pre-tag your props with `#js`.

### Icons

Icons are in a seperate namespace `ogbe.fulcro.mui.icons`. Individual icon elements are in modules
nested in `ogbe.fulcro.mui.icons.[name]`.

### Date pickers

Date pickers are in `ogbe.fulcro.mui.date-pickers`. Individual date picker elements are in modules
nested in `ogbe.fulcro.mui.date-pickers.[name]`. The adapters are in
`ogbe.fulcro.mui.date-pickers.adapter-[name]`. Remember to wrap the top-level UI element of the root
component with the localization provider:

```clojure
(ns com.example.app.root
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [ogbe.fulcro.mui.date-pickers :refer [ui-localization-provider]]
    ;; For date-fns
    [ogbe.fulcro.mui.date-pickers.adapter-date-fns :refer [adapter-date-fns]]
    ;; or for Day.js
    [ogbe.fulcro.mui.date-pickers.adapter-dayjs :refer [adapter-dayjs]]
    ;; or for Luxon
    [ogbe.fulcro.mui.date-pickers.adapter-luxon :refer [adapter-luxon]]
    ;; or for Moment.js
    [ogbe.fulcro.mui.date-pickers.adapter-moment :refer [adapter-moment]]))

(defsc Root [this props]
  (ui-localization-provider
    {:dateAdapter adapter-date-fns}
    ;; Nest other UI elements
  ))
```

### Theming

You can surround the top-level UI element of the root component with a theme provider to enable
[custom theming](https://mui.com/material-ui/customization/theming/):

```clojure
(ns com.example.app.root
  (:require
    [com.fulcrologic.fulcro.components :refer [defsc]]
    [ogbe.fulcro.mui.customization.colors :refer [indigo pink]]
    [ogbe.fulcro.mui.customization.styles :refer [create-theme ui-theme-provider]]))

(def theme
  (create-theme {:palette {:primary (indigo)
                           :secondary (pink)}}))

(defsc Root [this props]
  (ui-theme-provider
    {:theme theme}
    ;; Nest other UI elements
  ))
```

## Examples

Examples are in the workspaces of this repository. To play with them live, clone this repo, and
start the compiler:

```
cd fulcro-material
yarn
yarn start
```

Navigate to http://localhost:9630 and start the cards build. Then navigate to http://localhost:3000.

## License

Copyright © 2023 Eva Ogbe

Distributed under the MIT License.
