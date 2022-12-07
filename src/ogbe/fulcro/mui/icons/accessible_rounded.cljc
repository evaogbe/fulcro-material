(ns ogbe.fulcro.mui.icons.accessible-rounded
  #?(:cljs (:require
            ["@mui/icons-material/AccessibleRounded" :default AccessibleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-accessible-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory AccessibleRounded)))