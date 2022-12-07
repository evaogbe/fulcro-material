(ns ogbe.fulcro.mui.icons.disabled-by-default
  #?(:cljs (:require
            ["@mui/icons-material/DisabledByDefault" :default DisabledByDefault]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-disabled-by-default
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory DisabledByDefault)))