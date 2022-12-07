(ns ogbe.fulcro.mui.icons.iron-rounded
  #?(:cljs (:require
            ["@mui/icons-material/IronRounded" :default IronRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-iron-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory IronRounded)))