(ns ogbe.fulcro.mui.icons.list-alt
  #?(:cljs (:require
            ["@mui/icons-material/ListAlt" :default ListAlt]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-list-alt
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory ListAlt)))