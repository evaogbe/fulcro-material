(ns ogbe.fulcro.mui.customization.styles
  #?(:cljs (:require
            ["@mui/material/styles" :refer [createTheme ThemeProvider]]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

#_{:clj-kondo/ignore #?(:clj [:unused-binding] :cljs [])}
(defn create-theme
  [options]
  #?(:cljs (createTheme (clj->js options))))

(def ui-theme-provider #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ThemeProvider)))
