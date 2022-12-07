(ns ogbe.fulcro.mui.data-display.list
  #?(:cljs (:require
            ["@mui/material/List" :default List]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list #?(:clj  (fn [& _args])
                :cljs (interop/react-factory List)))
