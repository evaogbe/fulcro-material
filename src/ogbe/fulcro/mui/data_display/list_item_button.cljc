(ns ogbe.fulcro.mui.data-display.list-item-button
  #?(:cljs (:require
            ["@mui/material/ListItemButton" :default ListItemButton]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-item-button #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory ListItemButton)))
