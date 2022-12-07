(ns ogbe.fulcro.mui.icons.dangerous-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DangerousRounded" :default DangerousRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-dangerous-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DangerousRounded)))