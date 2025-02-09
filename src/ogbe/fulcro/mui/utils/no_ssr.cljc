(ns ogbe.fulcro.mui.utils.no-ssr
  #?(:cljs (:require
            ["@mui/material/NoSsr" :default NoSsr]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-no-ssr #?(:clj  (fn [& _args])
                  :cljs (interop/react-factory NoSsr)))
