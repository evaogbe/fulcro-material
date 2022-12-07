(ns ogbe.fulcro.mui.data-display.list-item
  #?(:cljs (:require
            ["@mui/material/ListItem" :default ListItem]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-item #?(:clj  (fn [& _args])
                     :cljs (interop/react-factory ListItem)))
