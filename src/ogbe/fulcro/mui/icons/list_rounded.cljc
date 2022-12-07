(ns ogbe.fulcro.mui.icons.list-rounded
  #?(:cljs (:require
            ["@mui/icons-material/ListRounded" :default ListRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-list-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ListRounded)))