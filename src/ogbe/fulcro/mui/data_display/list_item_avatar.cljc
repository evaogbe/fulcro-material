(ns ogbe.fulcro.mui.data-display.list-item-avatar
  #?(:cljs (:require
            ["@mui/material/ListItemAvatar" :default ListItemAvatar]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-list-item-avatar #?(:clj  (fn [& _args])
                            :cljs (interop/react-factory ListItemAvatar)))
