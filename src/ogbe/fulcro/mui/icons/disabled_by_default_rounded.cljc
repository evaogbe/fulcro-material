(ns ogbe.fulcro.mui.icons.disabled-by-default-rounded
  #?(:cljs (:require
            ["@mui/icons-material/DisabledByDefaultRounded" :default DisabledByDefaultRounded]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-disabled-by-default-rounded
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DisabledByDefaultRounded)))