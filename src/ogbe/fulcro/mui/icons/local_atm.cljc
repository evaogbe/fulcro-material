(ns ogbe.fulcro.mui.icons.local-atm
  #?(:cljs (:require
            ["@mui/icons-material/LocalAtm" :default LocalAtm]
            [com.fulcrologic.fulcro.algorithms.react-interop :as interop])))

(def ui-icon-local-atm
  #?(:clj  (fn [& _args])
     :cljs (interop/react-factory LocalAtm)))