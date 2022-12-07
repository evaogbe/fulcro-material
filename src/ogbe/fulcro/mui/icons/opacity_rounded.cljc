(ns ogbe.fulcro.mui.icons.opacity-rounded
  #?(:cljs (:require
            ["@mui/icons-material/OpacityRounded" :default OpacityRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-opacity-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory OpacityRounded)))