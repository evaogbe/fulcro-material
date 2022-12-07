(ns ogbe.fulcro.mui.icons.list
  #?(:cljs (:require
            ["@mui/icons-material/List" :default List]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-list
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory List)))