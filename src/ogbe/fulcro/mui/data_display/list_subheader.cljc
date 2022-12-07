(ns ogbe.fulcro.mui.data-display.list-subheader
  #?(:cljs (:require
            ["@mui/material/ListSubheader" :default ListSubheader]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-subheader #?(:clj  (fn [& _args])
                          :cljs (interop/react-factory ListSubheader)))
