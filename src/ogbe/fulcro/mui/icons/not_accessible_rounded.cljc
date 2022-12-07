(ns ogbe.fulcro.mui.icons.not-accessible-rounded
  #?(:cljs (:require
            ["@mui/icons-material/NotAccessibleRounded" :default NotAccessibleRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-not-accessible-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory NotAccessibleRounded)))