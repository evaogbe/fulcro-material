(ns ogbe.fulcro.mui.icons.kitchen
  #?(:cljs (:require
            ["@mui/icons-material/Kitchen" :default Kitchen]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-kitchen
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory Kitchen)))