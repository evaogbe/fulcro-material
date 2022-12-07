(ns ogbe.fulcro.mui.utils.scoped-css-baseline
  #?(:cljs (:require
            ["@mui/material/ScopedCssBaseline" :default ScopedCssBaseline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-scoped-css-baseline #?(:clj  (fn [& _args])
                               :cljs (interop/react-factory ScopedCssBaseline)))
