(ns ogbe.fulcro.mui.utils.css-baseline
  #?(:cljs (:require
            ["@mui/material/CssBaseline" :default CssBaseline]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-css-baseline #?(:clj  (fn [& _args])
                        :cljs (interop/react-factory CssBaseline)))
